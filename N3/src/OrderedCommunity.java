import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class OrderedCommunity extends TreeSet<People> {
    public OrderedCommunity(Comparator<? super People> comparator, Collection<People> community) {
        super(comparator);
        this.addAll(community);
    }
}
