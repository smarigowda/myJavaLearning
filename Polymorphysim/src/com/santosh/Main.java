package com.santosh;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + ", Name: " + movie.getName() + ", Plot: " + movie.plot());

        }
    }

    public static Movie randomMovie() {

        Movie defaultMovie = new Movie("default Movie");
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("Ramdom number was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Forgettable();
        }

        return defaultMovie;
    }

}
