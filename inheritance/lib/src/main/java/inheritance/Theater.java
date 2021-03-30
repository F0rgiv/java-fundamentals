package inheritance;

import java.util.HashSet;
import java.util.Set;

public class Theater extends Place{
    Set<String> movies = new HashSet<>();

    public Theater(String name, int price) {
        super(name, price);
    }

    public Theater(String name, String price) {
        super(name, price);
    }

    public void addMovie(String movie){
        movies.add(movie);
    }

    public void removeMovie(String movie){
        movies.remove(movie);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", now showing:%s", this.movies);
    }
}
