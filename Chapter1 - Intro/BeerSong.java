public class BeerSong {
    public static void main (String[] args){
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0){
            /* the problem with this if function here is that when placed before decreasing beerNum is that
            we will get one line of "1 bottles of beer on the wall.
            To fix this, we move the if function after the line "beerNum -=1"  */

            //Code to be moved
            /*
            if (beerNum == 1){
                word = "bottle"; // 1 beer left therefore singular
            } */

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum -= 1;

            if (beerNum == 1){
                word = "bottle"; // 1 beer left therefore singular
            }

            if (beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            } //end else
        } //end while
    }//end main method
}//end class