import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) {
        //vars
        String[] gameWords={"january","february","march"};        
        char userChar;
        int lives=6;
        boolean loseLife;
        int randomPick=(int)(Math.random()*gameWords.length);
        String playWord=gameWords[randomPick];
        StringBuffer displayBuff=new StringBuffer();
        String displayGuesses;        
        for(int i=0;i<playWord.length();i++){
            displayBuff.append("*");
        }
        displayGuesses=displayBuff.toString();
        //game logic
        //input
        do{
            loseLife=true;
            System.out.println("Hidden: "+displayGuesses);        
            userChar=(JOptionPane.showInputDialog(null, "Enter a guess").charAt(0));
            //checking guess against playWord
            for(int i=0;i<playWord.length();i++){
                if(playWord.charAt(i)==userChar){    
                    //update buffer with correct chars             
                    displayBuff.replace(i,i+1,userChar+"");
                    loseLife=false;                    
                }                                              
            }
            if(loseLife==true){
                lives--;
            }
            displayGuesses=displayBuff.toString();      
            System.out.println(displayGuesses);
            System.out.println("Lives: "+lives);
        }while(lives>0);
        System.out.println("Game over");       
    }
}
