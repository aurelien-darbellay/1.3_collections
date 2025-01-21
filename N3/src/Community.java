import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Community extends HashSet<People> {
    public Community() {
    }
    public Set<People> orderBy(Comparator<People> comparator){
        return  (Set<People>) new OrderedCommunity(comparator,this);
    }

}
