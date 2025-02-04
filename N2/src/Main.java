import java.util.*;

public class Main {
    public static void main(String[] args) {

        Restaurant manor = new Restaurant("Manor", 1);
        Restaurant menor = new Restaurant("Menor", 1);
        Restaurant minor = new Restaurant("Manor", 2);
        Restaurant manorCopy = new Restaurant("Manor", 1);
        System.out.format("It is %b that %s (%.0f points) and %s (%.0f points) are identical%n", Objects.equals(manor, manorCopy), manor.getName(), manor.getPoints(), manorCopy.getName(), manorCopy.getPoints());
        Set<Restaurant> restaurants = new HashSet<Restaurant>();
        restaurants.add(manor);
        restaurants.add(menor);
        restaurants.add(minor);
        restaurants.add(manorCopy);
        System.out.format("Because of the former equality, the set of all the restaurants created has %d elements%n", restaurants.size());
        Comparator<Restaurant> restaurantComparator = new RestaurantComparator();
        Set<Restaurant> orderedRestaurants = new TreeSet<Restaurant>(restaurantComparator);
        orderedRestaurants.add(manor);
        orderedRestaurants.add(menor);
        orderedRestaurants.add(minor);
        orderedRestaurants.forEach(restaurant -> System.out.println(restaurant.getName() + " : " + restaurant.getPoints() + " points."));

    }
}