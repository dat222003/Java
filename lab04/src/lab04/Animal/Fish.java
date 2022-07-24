package lab04.lab04.Animal;

public class Fish extends Animal implements Pet {

    private String name= "unknown";


    Fish(){
        super(0);
    }

    Fish(String name) {
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
        System.out.println("Fish can't walk fish swim");
    }

    public void swim() {
        System.out.println("Fish swim");
    }

    public void play() {
        System.out.println("Fish play");
    }

    @Override
    public void eat() {
        System.out.println("Fish eat");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}
