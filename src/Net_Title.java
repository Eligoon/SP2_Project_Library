public abstract class Net_Title extends Title
{
    private int availability;
    private int reach;
    private int use;

    public Net_Title(String title, String literatureType, int availability, int reach, int use)
    {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    protected double getPseudoCopies()
    {
        return (reach * 5) + (availability * 0.5) + getUseFactor();
    }

    private int getUseFactor()
    {
        return 205;
    }
}
