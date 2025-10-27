// Represents an audiobook version of a title
public class AudioBook extends PhysicalTitle implements IAudioBook
{
    private int durationInMinutes;   // Total length of the audiobook

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes)
    {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoint()
    {
        // Formula for audiobook points:
        // (duration in minutes * 0.5) * literatureTypeMultiplier * numberOfCopies
        double points = (durationInMinutes * 0.5) * convertLiteratureType() * copies;
        return points;
    }
}

