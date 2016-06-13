
package Dictionary;
import java.util.Scanner;

public class Word extends Dictionary{
    private Scanner in = new Scanner(System.in);
    private String word;
    private Dictionary d = new Dictionary();
    
    public Word(){
        super();
    }
    
    public void inputWord(){
        System.out.println("Enter a word");
        word = in.nextLine();
    }
    
    public void sendAddWord(){
        super.addWord(word);
    }
    
    public void sendSeekWord(){
        super.seekWord(word);
    }
    
}
