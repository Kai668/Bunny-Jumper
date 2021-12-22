import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckpointFlag extends Actor
{
    /**
     * Act - do whatever the Flag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        detectFlag();
    }
    
    public void detectFlag()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2 + 1, CheckpointFlag.class);
    }
    
    public CheckpointFlag()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 5, image.getHeight() + 10);
        setImage(image);
    }
}
