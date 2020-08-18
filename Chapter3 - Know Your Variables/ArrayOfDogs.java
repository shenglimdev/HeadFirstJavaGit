class Dog {
    int size;
    String name;
    public Dog(){

    }

    public void bark(){
        System.out.println("Bork");
    }

    public void eat(){
        System.out.println("Nom");
    }

    public void chaseCat(){
        System.out.println("Chase");
    }
}

public class ArrayOfDogs {
    public static void main(String[] args) {
        Dog[] pets;

        pets = new Dog[7];

        for (int i = 0; i < 7; i++){
            pets[i] = new Dog();
        }

        Dog fido = new Dog();
        fido.name = "Fido";

        fido.bark();
        fido.chaseCat();

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[0].name = "Dido";
        myDogs[0].bark();
    }
}
