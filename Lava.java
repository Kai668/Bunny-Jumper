import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lava here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lava extends Actor
{
    /**
     * Act - do whatever the Lava wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        detectLava();
    }
    
    public void detectLava()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2 + 1, Lava.class);
    }
    
    public Lava()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 74, image.getHeight() + 25);
        setImage(image);
    }
}
