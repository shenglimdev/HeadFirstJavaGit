class Boook{
    public Boook() {

    }
}
public class LifeAndDeathOnTheHeap {
    public static void main(String[] args) {
        Boook b = new Boook(); //boook object 1
        Boook c = new Boook(); //boook object 2

        b = c; //assign value of c to b, now boook object 1 is abandoned -> eligible for garbage collection

        c = null; //assign value null to c, this makes c null reference (doesn't refer to anything)
        // still reference variable, another boook can still be assign to it
    }
}
