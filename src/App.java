public class App {
    public static void main(String[] args) {
        //vars
        String[] gameWords={"january","february","march"};
        int lives=6;
        int randomPick=(int)(Math.random()*gameWords.length);
        String playWord=gameWords[randomPick];
        //game logic
        for(int i=0;i<gameWords.length;i++){
            System.out.println(gameWords[i]);
        }
        System.out.println("Play: "+playWord);
    }
}
