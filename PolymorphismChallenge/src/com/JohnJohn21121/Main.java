package com.JohnJohn21121;

public class Main {

    public static void main(String[] args) {
	Car car = new Car(8, "Base Car");
        System.out.println(car.starEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

    Chevrolet chevrolet = new Chevrolet(8, "Camaro SS 2017");
        System.out.println(chevrolet.starEngine());
        System.out.println(chevrolet.accelerate());
        System.out.println(chevrolet.brake());

    Dodge dodge = new Dodge(6, "Caliber 2012");
        System.out.println(dodge.starEngine());
        System.out.println(dodge.accelerate());
        System.out.println(dodge.brake());

        Ferrari ferrari = new Ferrari(12, "Ferrari 250 Gt Berlinetta ");
        System.out.println(ferrari.starEngine());
        System.out.println(ferrari.accelerate());
        System.out.println(ferrari.brake());

    }



}


class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String starEngine(){
        return "Car -> Star engine";
    }

    public String accelerate(){
        return "Car -> Accelerate";
    }
    public String brake(){
        return "Car -> Brake";
    }
}

class Chevrolet extends Car{
    public Chevrolet(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String starEngine() {
        return getClass().getSimpleName()+" -> Star engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+" -> Accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+ " -> Brake";
    }
}

class Dodge extends Car{
        public Dodge(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String starEngine() {
            return getClass().getSimpleName() + " -> Star engine";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + " -> Accelerate";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName()+ " -> Brake";
        }
}

class Ferrari extends Car{
    public Ferrari(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String starEngine() {
        return getClass().getSimpleName()+ " -> Star engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+" -> Accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+ " -> Brake";
    }
}


