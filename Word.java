
package Dictionary;
import java.util.Scanner;

public class Word extends Dictionary{
    private Scanner in = new Scanner(System.in);//for input
    private String word;//for keeping inputed word
    
    public Word(){
        super();
    }
    
    public void inputWord(){//takes word's input from user 
        System.out.println("Enter a word");
        word = in.nextLine();
    }
    
    public void sendAddWord(){//sending word to SuperClass for adding it into dictionary
        super.addWord(word);
    }
    
    public void sendSeekWord(){//sending word to SuperClass for seek for it meaning into dictionary
        super.seekWord(word);
    }
    
}
