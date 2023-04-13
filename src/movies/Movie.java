package movies;

import util.Input;

import java.util.Arrays;

public class Movie {

    private String name;
    private String category;

/* TODO: Constructor that sets both of these.*/

/* TODO: Create methods to access these properties and change them (getters
     and setters). */

// the Movie constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setCategory(String name) {
//        this.name = name;
//    }

//    public getMovies() {
//        return MoviesAr;
//    }
    public String getName(){
        return name;
    }
    public String getCat(){
        return category;
    }

    public static int getUserInput() {
        Input user = new Input();

        System.out.printf("""
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                                
                Enter your choice:  """);

        int userOpt = user.getInt();

        return userOpt;
    }

    public static String getAll() {
        Movie[] bob = MoviesArray.findAll();
        String title = "";

        for (Movie n : bob) {
            title += n.getName() + " -- " + n.getCat() + " \n";
        }

        return title;
    }

    public static String getByCats(String genre) {
        Movie[] bob = MoviesArray.findAll();
        String title = "";

        for (Movie n : bob) {
            if (n.getCat().equals(genre)) {
                title += n.getName() + " -- " + n.getCat() + " \n";
            }
        }

        return title;

    }

    public static void movieApplication (int input) {
        if (input == 0) {
            System.out.println("Later");
        } else if (input == 1) {
            System.out.println(Movie.getAll());
            Movie.movieApplication(Movie.getUserInput());
        } else if (input == 2) {
            System.out.println(Movie.getByCats("animated"));
            Movie.movieApplication(Movie.getUserInput());
        } else if (input == 3) {
            System.out.println(Movie.getByCats("drama"));
            Movie.movieApplication(Movie.getUserInput());
        } else if (input == 4) {
            System.out.println(Movie.getByCats("horror"));
            Movie.movieApplication(Movie.getUserInput());
        } else if (input == 5) {
            System.out.println(Movie.getByCats("scifi"));
            Movie.movieApplication(Movie.getUserInput());
        }
    }

}
