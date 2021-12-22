import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platform2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        detectPlatform();
    }
    
    public void detectPlatform()
    {
         Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2 + 1, Platform.class);
    }
    
    public Platform()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 80, image.getHeight() + 10);
        setImage(image);
    }
}
