public class Dog extends Pet implements AnimalFoul {

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public void respond () {
        System.out.println("Hello, owner. I am " + Species.DOG + ". I miss you!");
    }
}
