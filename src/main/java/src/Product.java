package src;

public class Product
{

    private final int id;
    private final String title;
    private final int cost;

    public Product(int id, String name, int cost)
    {
        this.id = id;
        this.title = name;
        this.cost = cost;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public int getCost()
    {
        return cost;
    }

}
