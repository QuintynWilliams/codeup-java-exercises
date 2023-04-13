package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {

//        Movie mom = new Movie ("mom", "drama");
//        Movie dad = new Movie ("dad", "action");
//
//        Movie[] eachTitle = MoviesArray.findAll();
//
//        for (Movie n : eachTitle) {
//            System.out.println(n.getAll());
//        }

        Movie.movieApplication(Movie.getUserInput());

    }

}
