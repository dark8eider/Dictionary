package Dictionary;

import java.util.Scanner;

public class Interface {

    private Scanner in; //take's user input
    
    public Interface(){ //constructor
        in = new Scanner(System.in);
    }
    
    public void menu(){//realized menu of prorgram
        String instruction = "";//used for holding user input
        Word word = new Word();//gives access to dictionary methods
        boolean exit = false;// used to stop the program
        
        while (exit != true){//cycle for menu
            System.out.println("Enter instruction");
            instruction = in.next();//
            switch (instruction){//chek's what the programm shouls do
                case "seek":{// seek's for a word that user entered
                    word.inputWord();
                    System.out.println("Translating word...");
                    word.sendSeekWord();
                    break;
                }
                case "exit":{// exit the programm
                    exit = true;
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
       Interface start = new Interface();
       start.menu();
    }
    
}
