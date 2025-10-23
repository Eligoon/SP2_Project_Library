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
        return 0;
    }

    private double calculatePages()
    {
        return 0;
    }
}
