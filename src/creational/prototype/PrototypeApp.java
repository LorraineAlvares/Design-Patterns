package creational.prototype;

public class PrototypeApp {

    public static void main(String args[]){

        Registry registry = new Registry();
        Movie movie = (Movie)registry.createItem("Movie");
        movie.setTitle("Design patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie)registry.createItem("Movie");
        anotherMovie.setTitle("Another Movie");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());

    }
}
