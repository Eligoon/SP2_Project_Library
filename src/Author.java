import java.util.ArrayList;

public class Author
{
    private String name;
    ArrayList<Title> titles = new ArrayList<>();

    public Author(String name)
    {
        this.name = name;
    }

    public void addTitle(Title title)
    {
        titles.add(title);
    }

    public double calculateRoyalties()
    {
        // points for Audio book * RATE + points for physical book * RATE
        double totalRoyalty = 0;

        for (Title t : titles)
        {
            totalRoyalty += t.calculateRoyalty();
        }
        return totalRoyalty;
    }

    public String getName()
    {
        return name;
    }
}
