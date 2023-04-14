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

//    public static Movie[] setMovie(String title, String cat) {
//
//        Movie[] userMovie = new Movie[]{new Movie(title, cat)};
//        Movie[] oldMovies = MoviesArray.findAll();
//
//        int oldLength = oldMovies.length;
//
//        Movie[] newMovies = new Movie[oldLength + 1];
//
//        for (int i = 0; i < oldLength; i++) {
//            newMovies[i] = new Movie(oldMovies[i].getName(), oldMovies[i].getCat());
//        }
//
//        String title = "";
//
//        for (Movie n : newMovies) {
//            title += n.getName() + " -- " + n.getCat() + " \n";
//        }
//
//        return newMovies;
//    }

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
                6 - add movie
                                
                Enter your choice:  """);

        int userOpt = user.getInt();

        return userOpt;
    }
    public static String getTitleInput () {
        Input user = new Input();

        System.out.printf("""
                Enter Movie Title:
                """);

        String userTitle = user.getString();

        return userTitle;
    }
    public static String getCatInput () {
        Input user = new Input();

        System.out.printf("""
                Select Movie category:
                    animated
                    drama
                    horror
                    scifi
                    other
                                
                Type your choice:  """);

        String userCat = user.getString();

        return userCat.toLowerCase();
    }

    public static void movieApplication (int input) {
        if (input == 0) {
            System.out.println("Later");
        } else if (input == 1) {
            System.out.println(getAll());
            movieApplication(getUserInput());
        } else if (input == 2) {
            System.out.println(getByCats("animated"));
            movieApplication(getUserInput());
        } else if (input == 3) {
            System.out.println(getByCats("drama"));
            movieApplication(getUserInput());
        } else if (input == 4) {
            System.out.println(getByCats("horror"));
            movieApplication(getUserInput());
        } else if (input == 5) {
            System.out.println(getByCats("scifi"));
            movieApplication(getUserInput());
        } else if (input == 6) {
//          MOVIE SET FUNCTION
//            System.out.println(setMovie(getTitleInput(),getCatInput()));
            movieApplication(getUserInput());
        }
    }

}
