import java.util.*;

public class Main {
    public static void main(String[] args) {
        Restaurant manor = new Restaurant("Manor", 1);
        Restaurant menor = new Restaurant("Menor", 1);
        Restaurant minor = new Restaurant("Manor", 2);
        Restaurant mano = new Restaurant("Manor", 1);
        System.out.println(Objects.equals(manor, mano));
        Set<Restaurant> restaurants = new HashSet<Restaurant>();
        restaurants.add(manor);
        restaurants.add(menor);
        restaurants.add(minor);
        restaurants.add(mano);
        System.out.println(restaurants.toString());
        Comparator<Restaurant> restaurantComparator= new RestaurantComparator();
        Set<Restaurant> orderedRestaurants = new TreeSet<Restaurant>(restaurantComparator);
        orderedRestaurants.add(manor);
        orderedRestaurants.add(menor);
        orderedRestaurants.add(minor);
        orderedRestaurants.forEach(restaurant->System.out.println(restaurant.getName() + " : " + restaurant.getPoints() + " points."));

    }
}