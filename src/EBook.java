public class EBook extends Net_Title
{
   private int characters;
   private boolean isIllustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean isIllustrated)
    {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.isIllustrated = isIllustrated;
    }


    @Override
    protected double calculatePoint()
    {
        // calculated pages * literature type * ((reach * 5) + (availability * 0,5) + use))
        double points = calculatePages() * convertLiteratureType(); // continue

        return points;
    }

    private double calculatePages()
    {
        double pageNum = 0;

        if (isIllustrated == false)
        {
            pageNum = characters / 1800 + 20;
        }
        else
            pageNum = (characters / 1800 + 20) * 1.10;

        return pageNum;
    }
}
