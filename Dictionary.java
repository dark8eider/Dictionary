
package Dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {
    private File file;
    private Scanner in;

    public Dictionary(){
        file = new File("Dictionary.txt");
    try{
        in = new Scanner(file);
    }catch(FileNotFoundException e){
        System.out.println("File not found");
        }
    }
    
    public void addWord(String s){
        
    }
    
    public void seekWord(String word){
        String line = " ";//gets a line from file
        boolean isTrue = false;
        while(isTrue == false){//seeking for a word in file
            if (in.hasNext()){
            line = in.nextLine() + "\r\n";
            isTrue = line.startsWith(word);
            }
        }
        System.out.println(line);
    }
    
    
}
