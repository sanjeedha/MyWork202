import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void pick() {
        World world = getWorld();
        
        int chooseGumball = Greenfoot.getRandomNumber(3);
        if (chooseGumball == 0)
        {
            
            RedGumball rg = new RedGumball();
            world.addObject(rg, 500, 500);
            System.out.println("REd Gumball added");
        }
        else if (chooseGumball == 1)
        {
            
            GreenGumball gg = new GreenGumball();
            world.addObject(gg, 500, 500);
            System.out.println("green Gumball added");
        }
        
        else
        {
            BlueGumball bg = new BlueGumball();
            world.addObject(bg, 500, 500);
            System.out.println("Blue Gumball added");
        }
            
    }
}
