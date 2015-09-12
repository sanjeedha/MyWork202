import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    Message m = new Message();
    Actor lastCoin;
    
    
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }
    
    public void displayMessage(String msg) {
        MouseInfo mouse = Greenfoot.getMouseInfo();  
        int mouseX=mouse.getX();  
        int mouseY=mouse.getY(); 
        
        World world = getWorld();
        
        if (m.getWorld() != null) {
            world.removeObject(m);
        }
        
        GreenfootImage gi;
        gi = new GreenfootImage(100, 100);
        gi.setColor( java.awt.Color.RED ) ;
        gi.fill() ;
        gi.setColor( java.awt.Color.BLACK ) ;
        gi.drawString( msg, 0, 50 );
        
        world.addObject( m, mouseX, mouseY ) ;
        m.setImage(gi);
    }
    
    public void inspectCoin() {
        List<Inspector> inspectors = getWorld().getObjects(Inspector.class);
        Inspector inspector = inspectors.get(0);
        System.out.println(inspector);
        inspector.inspect((Coin)lastCoin);
    }

    public void act() 
    {   
        Actor coin;
        //coin = getOneIntersectingObject( Coin.class ) ;
        coin = getOneObjectAtOffset(10, 10, Coin.class ) ;
        if ( coin != null )
        {
            System.out.println( coin.toString() ) ;

          
            lastCoin = coin;
            
            World world = getWorld();
            world.removeObject( coin ) ;
            
            displayMessage("Have Coin!");
        }

        if(Greenfoot.mousePressed(this)) {    
            System.out.println( "Clicked!" ) ;
            
            if (lastCoin != null) {
                displayMessage("Crank Turned!");
                inspectCoin();
            }
            else {
                displayMessage("No coin in the slot! Cannot turn crank");
            }
            
        }
        
        
    }    
}
