public class EAudio_Book extends Net_Title
{
    private int durationInMinutes;

    public EAudio_Book(String title, String literatureType, int availability, int reach, int use, int durationInMinutes)
    {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoint()
    {
        return 0;
    }
}
