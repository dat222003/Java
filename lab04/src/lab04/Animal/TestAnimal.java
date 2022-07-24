package lab04.lab04.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal spider = new Spider();
        System.out.println(spider);
        spider.walk();
        spider.eat();

        Pet cat;
        cat = new Cat();
        System.out.println(cat);
        cat.setName("Cat");
//        cat.eat();
//        cat.walk(); // not in contract
        cat.play();
        System.out.println(cat);

    }

}
