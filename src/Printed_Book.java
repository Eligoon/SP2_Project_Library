public class Printed_Book extends Title
{
  private int pages;
  private int copies;

    public Printed_Book(String title, String literatureType, int pages, int copies)
    {
        super(title, literatureType);
        this.pages = pages;
        this.copies = copies;
    }

    @Override
    protected double calculatePoint()
    {
        // pages * literature type * copies

       double pPoints = pages * convertLiteratureType() * copies;

       return pPoints;
    }
}
