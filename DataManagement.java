import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.Charset;
/**
 * Write a description of class DataManagement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataManagement
{

    public DataManagement()
    {

    }

    public static boolean saveData(Object data, String filename){
        try{
            PrintWriter writer = new PrintWriter(/*System.getProperty("user.dir") +*/ filename, "UTF-8");
            writer.println(data.toString());
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
    
    public static <T> T readData(String filename){
        
        try{
            Charset charset = Charset.forName("ISO-8859-1");
            List<String> in = Files.readAllLines(Paths.get(System.getProperty("user.dir") , filename), charset);
            String out = "";
            for(String s : in){
                out += s;
            }
            return (T) out;
        } catch (IOException e) {
            return null;
        }
    }
}
