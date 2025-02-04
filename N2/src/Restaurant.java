import java.util.Objects;

public class Restaurant {
    private final String name;
    private final float points;


    public Restaurant(String name, float points) {
        this.name = name;
        this.points = points;
        System.out.println("Restaurant " + name + " created with " + points + " points.");
    }

    @Override
    public boolean equals(Object obj) {
        Restaurant other = (Restaurant) obj;
        return (this.name.equals(other.name) && this.points == other.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, points);
    }

    public String getName() {
        return name;
    }

    public float getPoints() {
        return points;
    }
}