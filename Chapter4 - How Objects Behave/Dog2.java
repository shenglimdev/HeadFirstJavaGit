public class Dog2 {
    int size;
    String name;

    public void bark(){
        if (size > 60){
            System.out.println("Bork Bork");
        }  else if (size > 14){
            System.out.println("Ruff Ruff");
        }  else {
            System.out.println("Yip Yip");
        }
    }
}
