// Represents a printed (physical) book version of a title
public class PrintedBook extends PhysicalTitle
{
    private int pages;   // Number of pages in the book

    public PrintedBook(String title, String literatureType, int copies, int pages)
    {
        super(title, literatureType, copies);
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
