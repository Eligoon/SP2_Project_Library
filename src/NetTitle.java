public abstract class NetTitle extends Title
{
    private int availability;  // Number of available copies or digital availability (number of counties having the books)
    private int reach;         // Reach (number of counties that have the book lent out currently)
    private int use;           // Usage count (how many books is being lent, giving a certain amount of points)

    // Constructor initializing title, literature type, availability, reach, and usage metrics
    public NetTitle(String title, String literatureType, int availability, int reach, int use)
    {
        super(title, literatureType);  // Call parent Title constructor
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    // Calculate a composite "pseudo copies" metric combining reach, availability, and usage factors
    protected double getPseudoCopies()
    {
        // reach multiplied by 5, availability by 0.5, plus a use factor based on use thresholds
        return (reach * 5.0) + (availability * 0.5) + getUseFactor();
    }

    // Private helper to determine the use factor based on the use count thresholds
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
