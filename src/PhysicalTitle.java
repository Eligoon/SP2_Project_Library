public abstract class PhysicalTitle extends Title
{
    protected int copies;  // Number of physical copies distributed

    // Constructor initializing title, literature type, and number of copies
    public PhysicalTitle(String title, String literatureType, int copies)
    {
        super(title, literatureType);  // Call Title constructor
        this.copies = copies;
    }
}
