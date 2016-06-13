
package Dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {
    private File file;
    private Scanner in;

    public Dictionary(){
        file = new File("src/Dictionary/Dictionary.txt");
    try{
        in = new Scanner(new File("src/Dictionary/Dictionary.txt"));
    }catch(FileNotFoundException e){
        System.out.println("File not found");
        }
    }
    
    public void addWord(String s){
        
    }
    
    public void seekWord(String word){
        String line = " ";//keeps a line from file
        if(in.nextLine()!=null){
        line = in.nextLine();}
        System.out.println(line);
       /* boolean isTrue = false;
        while(isTrue == false){//seeking for a word in file
            if (in.nextLine()!= null){
            line = in.nextLine() + "\r\n";
            isTrue = line.startsWith(word);
            }
        }
        System.out.println(line);*/
    }
    
    
}
