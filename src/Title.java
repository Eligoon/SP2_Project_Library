public abstract class Title
{
 private String title;
 private String literatureType;
 static final double RATE = 0.067574;

    public Title(String title, String literatureType)
    {
        this.title = title;
        this.literatureType = literatureType;
    }

    protected double calculateRoyalty()
    {
        // points * RATE
        double royalty = calculatePoint() * RATE;

        return royalty;
    }

    protected abstract double calculatePoint();

    protected double convertLiteratureType()
    {
        double bookPoints;
        String bookType = literatureType;

        if (bookType == null)
        {
            System.err.println("Incorrect booktype.");
            return 0;
        }

        bookType = bookType.toUpperCase();

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
