class Book{
    public Book(){

    }
}

public class LifeOnTheGarbageCollectibleHeap {
    public static void main(String[] args) {
        Book b = new Book(); //book object 1
        Book c = new Book(); //book object 2

        Book d = c; //book object2, referring to same object
        //hold two different copies of same value

        c = b; //both b and c refer to same book object 1
    }
}
