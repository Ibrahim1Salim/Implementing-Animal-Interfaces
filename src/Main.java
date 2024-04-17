public class Main {
    public static void main(String[] args) {
        Flyable bat = new Bat();
        Flyable bird = new Bird();
        Swimable fish = new Fish();

        bat.fly();
        fish.swim();
        bird.fly();
    }
}