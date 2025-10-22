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

    public abstract double calculatePoint();

    protected double convertLiteratureType()
    {
        return 0;
    }
}
