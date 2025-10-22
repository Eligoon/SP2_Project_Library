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
    public double calculatePoint()
    {
        return 0;
    }
}
