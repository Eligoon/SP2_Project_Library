// Represents a printed (physical) book version of a title
public class Printed_Book extends Physical_Title
{
    private int pages;   // Number of pages in the book

    public Printed_Book(String title, String literatureType, int pages) {
        super(title, literatureType);
        this.pages = pages;
    }

    @Override
    protected double calculatePoint()
    {
        // Formula for printed book points:
        // pages * literatureTypeMultiplier * numberOfCopies
        double points = pages * convertLiteratureType() * copies;
        return points;
    }
}
