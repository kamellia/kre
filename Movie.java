public class Movie {
    String name;
    int release_year;
    String lead_actor;
    float rating;

    void print(Movie movie)
    {
        System.out.println(" Name : " + movie.name);
        System.out.println(" Release Year : " + movie.release_year);
        System.out.println(" Lead Actor : " + movie.lead_actor);
        System.out.println(" Rating : " + movie.rating);
    }
}
