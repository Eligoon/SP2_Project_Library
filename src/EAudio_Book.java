public class EAudio_Book extends Net_Title implements IAudio_Book
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
        // duration in minutes divided by 2 * literature type * ((reach * 5) + (availability * 0,5) + usefactor))
        double points = (durationInMinutes / 2) * convertLiteratureType() * getPseudoCopies();

        return points;
    }
}
