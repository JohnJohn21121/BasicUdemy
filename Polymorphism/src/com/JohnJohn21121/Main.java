package com.JohnJohn21121;

public class Main {

    public static void main(String[] args) {

        for (int i =1;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie# " + i + ": " + movie.getName()+"\n" + "Plot: " + movie.plot() + "\n");
        }
    }
    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random()* 5) +1;
        System.out.println("Random Number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new ForgetableMovie();
        }
        return null;
    }
}

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No Plot Here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A Shark eats a lot of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens Attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze.";
    }

}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars.");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe.";
    }
}

class ForgetableMovie extends Movie{
    public ForgetableMovie() {
        super("Forgetable.");
    }
    //No plot method
}