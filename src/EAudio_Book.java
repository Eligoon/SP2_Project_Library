public class EAudio_Book extends Net_Title implements IAudio_Book
{
    private int durationInMinutes;  // Duration of the audiobook in minutes

    // Constructor to initialize audiobook with title, type, availability, reach, usage, and duration
    public EAudio_Book(String title, String literatureType, int availability, int reach, int use, int durationInMinutes)
    {
        super(title, literatureType, availability, reach, use);  // Initialize common title fields
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoint()
    {
        // (duration / 2) * literature type factor * ((reach * 5) + (availability * 0.5) + use factor)
        double points = (durationInMinutes / 2.0) * convertLiteratureType() * getPseudoCopies();

        return points;
    }
}
