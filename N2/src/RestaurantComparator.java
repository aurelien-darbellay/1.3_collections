import java.io.Serializable;
import java.util.Comparator;

public class RestaurantComparator implements Comparator<Restaurant> {
    @Override
    public int compare(Restaurant o1, Restaurant o2) {
        if (o1.equals(o2)) return 0;
        else if (o1.getName().equals(o2.getName())){
            return o1.getPoints()>o2.getPoints()?  -1 : 1;
         }else{
            return o1.getName().compareTo(o2.getName());
        }
    }
}
