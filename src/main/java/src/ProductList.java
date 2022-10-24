package src;

import java.util.ArrayList;
import java.util.List;

public class ProductList
{

    private final List<Product> list = new ArrayList<>();

    public ProductList()
    {

        list.add(new Product(1,"Product_1",42));
        list.add(new Product(2,"Product_2",14));
        list.add(new Product(3,"Product_3",89));
        list.add(new Product(4,"Product_4",684));
        list.add(new Product(5,"Product_5",19));
        list.add(new Product(6,"Product_6",64));
        list.add(new Product(7,"Product_7",111));
        list.add(new Product(8,"Product_8",157));
        list.add(new Product(9,"Product_9",165));
        list.add(new Product(10,"Product_10",5));
    }
    public String getProductPage()
    {
        StringBuilder sb = new StringBuilder("<h1>Product list:</h1>");
        for (Product product : list)
        {
            sb.append("Id: " + product.getId() + ". ");
            sb.append("Name: " + product.getTitle() + ". ");
            sb.append("Cost: " + product.getCost() + ".<Br>");
        }

        return sb.toString();
    }

}
