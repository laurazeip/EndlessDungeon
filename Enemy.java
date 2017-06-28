import java.util.*;
/**
 * Write a description of class Enemy here.
 * 
 * @author (Colin) 
 * @version (28.06.2017)
 */
public class Enemy
{
    private String name;
    private String description;
    private int hitPoints;
    private int minDamage;
    private int maxDamage;
    private static Random random = new Random();

    /**
     * Constructor for objects of class Enemy
     */
    public Enemy(String name, String description, int hitPoints, int minDamage, int maxDamage)
    {
       this.name = name;
       this.description = description;
       this.minDamage = minDamage;
       this.maxDamage = maxDamage;
       this.hitPoints = hitPoints;
      
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    //public int sampleMethod(int y)
    {
        
    }
}
