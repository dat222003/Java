package lab04.lab04.Animal;

public abstract class Animal {

    public int legs;

    Animal(){
        this.legs = 1;
    }

    Animal(int legs){
        this.legs = legs;
    }

    public abstract void setName(String name);

    public abstract void walk();

    public abstract void eat();


}
