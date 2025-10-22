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

    }

    public double calculateRoyalty()
    {
        return 0;
    }

    public String getName()
    {
        return "";
    }
}
