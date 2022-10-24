import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import src.ProductList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/product_servlet")

public class ProductServlet  implements Servlet
{

    private static final Logger logger = LoggerFactory.getLogger(ProductServlet.class);

    @Override
    public void init(ServletConfig servletConfig)
    {
    }

    @Override
    public ServletConfig getServletConfig()
    {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws IOException
    {
        logger.info("Request");
        ProductList productList = new ProductList();
        String page = productList.getProductPage();
        res.getWriter().println(page);

    }

    @Override
    public String getServletInfo()
    {
        return null;
    }

    public void destroy()
    {
        logger.info("Destroy");
    }


}