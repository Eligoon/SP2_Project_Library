// Represents a printed (physical) book version of a title
public class Printed_Book extends Title
{
    private int pages;   // Number of pages in the book
    private int copies;  // Number of copies distributed

    public Printed_Book(String title, String literatureType, int pages, int copies)
    {
        super(title, literatureType);
        this.pages = pages;
        this.copies = copies;
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
