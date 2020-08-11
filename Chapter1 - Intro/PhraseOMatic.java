public class PhraseOMatic {
    public static void main (String[] args){
        String[] wordListOne = {"24/7","multiTier","30,000 foot","B-to-B","win-win","frontend", "web-based","pervasive", "smart", "sixsigma","critical-path", "dynamic"};
        String[] wordListTwo = {"empowered","sticky","value-added", "oriented", "centric", "distributed","clustered","branded","outside-the-box","positioned","networked", "focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " ";

        System.out.println("what we need is a " + phrase);
    }
}
