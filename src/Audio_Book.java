// Represents an audiobook version of a title
public class Audio_Book extends Title
{
    private int durationInMinutes;   // Total length of the audiobook
    private int copies;              // Number of copies sold or distributed

    public Audio_Book(String title, String literatureType, int durationInMinutes, int copies)
    {
        super(title, literatureType);
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;
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

