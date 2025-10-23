public abstract class Physical_Title extends Title
{
    protected int copies;  // Number of copies distributed

    public Physical_Title(String title, String literatureType, int copies)
    {
        super(title, literatureType);
        this.copies = copies;
    }
}
