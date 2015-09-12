import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }
    
    public void inspect(Coin coin) {
        System.out.println("Inside Inspector");
        System.out.println(coin);
        
        if (coin.getClass() == Quarter.class) {
            System.out.println("Valid Coin");
            List<Picker> pickers = getWorld().getObjects(Picker.class);
            System.out.println(pickers);
            
            int choosePicker = Greenfoot.getRandomNumber(pickers.size());
            
            Picker chosenPicker = pickers.get(choosePicker);
            
            chosenPicker.pick();
            
        }
        else {
            System.out.println("Invalid Coin");
        }
    }
}