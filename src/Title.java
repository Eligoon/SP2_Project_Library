// Abstract base class representing a general literary title
public abstract class Title
{
    private String title;                // The name of the title
    private String literatureType;       // Type of literature (e.g., "LYRIK", "SKØN", etc.)
    static final double RATE = 0.067574; // Royalty rate per point

    public Title(String title, String literatureType)
    {
        this.title = title;
        this.literatureType = literatureType;
    }

    // Template method for calculating royalties based on points
    protected double calculateRoyalty()
    {
        // Royalty = points * RATE
        double royalty = calculatePoint() * RATE;
        return royalty;
    }

    // Each subclass must define its own method for calculating "points"
    protected abstract double calculatePoint();

    // I know I could have thrown some more exceptions here and made proper error catches
    // Converts a literature type string into a numeric point value
    protected double convertLiteratureType()
    {
        double bookPoints;
        String bookType = literatureType;

        if (bookType == null)
        {
            System.err.println("Incorrect booktype.");
            return 0;
        }

        // Normalize input to uppercase for consistent comparison
        bookType = bookType.toUpperCase();

        // Determine point value based on type
        if (bookType.contains("BI") || bookType.contains("TE"))
        {
            bookPoints = 3;
        }
        else if (bookType.contains("LYRIK"))
        {
            bookPoints = 6;
        }
        else if (bookType.contains("SKØN"))
        {
            bookPoints = 1.7;
        }
        else if (bookType.contains("FAG"))
        {
            bookPoints = 1;
        }
        else
        {
            System.err.println("Incorrect booktype.");
            bookPoints = 0;
        }

        return bookPoints;
    }
}
