public class EBook extends Net_Title
{
    private int characters;            // Number of characters in the eBook text
    private boolean isIllustrated;    // Flag to indicate if the eBook contains illustrations

    // Constructor to initialize eBook with title, type, availability, reach, usage, character count, and illustration flag
    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean isIllustrated)
    {
        super(title, literatureType, availability, reach, use); // Call parent constructor to set common fields
        this.characters = characters;
        this.isIllustrated = isIllustrated;
    }

    @Override
    protected double calculatePoint()
    {
        // pages * literature type factor * ((reach * 5) + (availability * 0.5) + use factor)
        double points = calculatePages() * convertLiteratureType() * getPseudoCopies();

        return points;
    }

    private double calculatePages()
    {
        double pageNum = 0;

        // Calculate pages based on characters divided by 1800 + 20 base pages
        // If illustrated, add 10% more pages
        if (isIllustrated == false)
        {
            pageNum = characters / 1800.0 + 20;
        }
        else
            pageNum = (characters / 1800.0 + 20) * 1.10;

        return pageNum;
    }
}
