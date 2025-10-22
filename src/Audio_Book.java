public class Audio_Book extends Title
{
    private int durationInMinutes;
    private int copies;

    public Audio_Book(String title, String literatureType, int durationInMinutes, int copies)
    {
        super(title, literatureType);
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;
    }


    @Override
    protected double calculatePoint()
    {
        // (duration in minutes * 0,5) * litteraturetype * copies

        double points = (durationInMinutes * 0.5) * convertLiteratureType() * copies;

        return points;
    }
}
