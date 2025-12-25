package runpolymorphism;

public class Dog extends Animal {
    public void makeSound() {
        System.out.println("the dog is barking");
    }


    public static void main(String[] args) {
        Animal obj1 = new cat();
        Animal obj2 = new Dog();
        obj1.makeSound();
        obj2.makeSound();
    }
}