import java.util.ArrayList;

// Represents an author with a collection of published titles
public class Author
{
    private String name;                 // Author's name
    private ArrayList<Title> titles = new ArrayList<>(); // List of titles by this author

    public Author(String name)
    {
        this.name = name;
    }

    // Add a title to the author's list
    public void addTitle(Title title)
    {
        titles.add(title);
    }

    // Calculate the sum of all royalties for this author's titles
    public double calculateRoyalties()
    {
        double totalRoyalty = 0;

        // Loop through all titles and sum their royalties
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
