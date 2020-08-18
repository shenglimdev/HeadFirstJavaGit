public class DogTestDrive {
    public static void main(String[] args) {
        Dog2 one = new Dog2();
        Dog2 two = new Dog2();
        Dog2 three = new Dog2();

        one.size = 70;
        two.size = 8;
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
}
