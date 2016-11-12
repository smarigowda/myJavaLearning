package com.santosh;

public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot() {
        return "No plot here...";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A Shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }
    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
    // no plot here
}

