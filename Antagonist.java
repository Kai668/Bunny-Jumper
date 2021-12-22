import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Antagonist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Antagonist extends Actor
{
    /**
     * Act - do whatever the Antagonist wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public Antagonist()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 120, image.getHeight() - 150);
        setImage(image);
    }
}
