package lab04.lab04.Animal;

public class Spider extends Animal {


    Spider(){
        super(8);
    }

    public Spider(int legs) {
        this.legs = legs;
    }

    @Override
    public void setName(String name) {

    }


    @Override
    public void walk() {
        System.out.println("Spider walk");
    }

    @Override
    public void eat() {
        System.out.println("Spider eat");
    }

    @Override
    public String toString() {
        return "Spider";
    }
}
