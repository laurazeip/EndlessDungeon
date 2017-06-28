import java.util.*;
/**
 * Write a description of class GameInterface here.
 * 28.06.2017
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameInterface
{

    public GameInterface()
    {
        // initialise instance variables
        Start();
    }


    public void Start()
    {
        Scanner in = new Scanner(System.in);
       while (true){
           String[] out = new String[StringUtils.countMatches()]():
           processInput(in.next());
       }
    }
    
    public void processInput(String[] input){
        System.out.println(input);
        switch (input){
            case "quit":
                        System.exit(0);
                        break;
        }
        
    }
}
