package lab04.lab04.Animal;

public class Cat extends Animal implements Pet{

    private String name= "unknown";


    Cat(){
        super(4);
    }

    Cat(String name) {
        this();
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("Cat walk");
    }

    @Override
    public void play() {
        System.out.println("Cat play");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}
