public abstract class Physical_Title extends Title
{
    protected int copies;  // Number of physical copies distributed

    // Constructor initializing title, literature type, and number of copies
    public Physical_Title(String title, String literatureType, int copies)
    {
        super(title, literatureType);  // Call Title constructor
        this.copies = copies;
    }
}
