
package Dictionary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    
    public void addWord(String s){// writes word and its translation into file
        PrintWriter output; //used for writing in file some info
        try{
           output = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
           output.println(s);
           output.close(); 
        }catch(FileNotFoundException e){//catching all possible for this method exceptions
            System.out.println("OOOps file not found");
        }catch(IOException r){
            System.out.println("OOOpppsss IO exception");
        }
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
