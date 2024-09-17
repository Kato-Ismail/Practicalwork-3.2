import java.util.ArrayList;
import java.util.List;
public class movie
{
    private final List<movieItem> items;
    public movie()
    {
        items = new ArrayList<movieItem>();
    }
    public void addMovieItem(movieItem item)
    {
        items.add(item);
    }
    public void printMovieItems()
    {
        for(movieItem item : items)
        {
            System.out.println(item);
        }
    }
}
