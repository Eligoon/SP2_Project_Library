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
        return 0;
    }

    protected abstract double calculatePoint();

    protected double convertLiteratureType()
    {
        double bookPoints;
        String bookType = literatureType;

        if (bookType == null)
        {
            System.err.println("Incorrect booktype.");
        }

        if (bookType.toUpperCase().contains("BI"))
        {
            bookPoints = 3;
        } else if (bookType.toUpperCase().contains("TE"))
        {
            bookPoints = 3;
        } else if (bookType.toUpperCase().contains("LYRIK"))
        {
            bookPoints = 6;
        } else if (bookType.toUpperCase().contains("SKØN"))
        {
            bookPoints = 1.7;
        } else if (bookType.toUpperCase().contains("FAG"))
        {
            bookPoints = 1;
        } else
            bookPoints = 0;
            System.err.println("Incorrect booktype.");

        return bookPoints;
    }

}
