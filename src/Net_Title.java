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
        if (use >= 0 && use <= 25)
        {
            return 0;
        }
        else if (use >= 26 && use <= 75)
        {
            return 50;
        }
        else if (use >= 76 && use <= 150)
        {
            return 100;
        }
        else if (use >= 151 && use <= 400)
        {
            return 150;
        }
        else if (use >= 401 && use <= 1000)
        {
            return 200;
        }
        else if (use >= 1001 && use <= 2000)
        {
            return 250;
        }
        else if (use >= 2001 && use <= 5000)
        {
            return 500;
        }
        else if (use >= 5001 && use <= 10000)
        {
            return 750;
        }
        else // use > 10000
        {
            return 1000;
        }
    }
}

