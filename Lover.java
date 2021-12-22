import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lover extends Actor
{
    /**
     * Act - do whatever the Lover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public Lover()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 90, image.getHeight() - 160);
        setImage(image);
    }
}
