public class AnimalBehavior {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Mouse mouse = new Mouse();
        Chicken chicken = new Chicken();
        Duck duck = new Duck();

        System.out.println("Cat: " + cat.walk() + ", " + cat.talk() + ", " + cat.eat());
        System.out.println("Dog: " + dog.walk() + ", " + dog.talk() + ", " + dog.eat());
        System.out.println("Mouse: " + mouse.walk() + ", " + mouse.talk() + ", " + mouse.eat());
        System.out.println("Chicken: " + chicken.walk() + ", " + chicken.talk() + ", " + chicken.eat());
        System.out.println("Duck: " + duck.walk() + ", " + duck.talk() + ", " + duck.eat());
    }
}
