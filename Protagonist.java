import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Protagonist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Protagonist extends Actor
{
    private int hSpeed = 5;
    private int vSpeed = 2;
    private int acceleration = 1;
    private int jumpStrength = 16;
    private int speed = 4;
    private boolean jumping;
    private boolean alive;
    private int coinsCollected = 0;
    
    GreenfootImage[] walkRight = new GreenfootImage[3];
    GreenfootImage[] walkLeft = new GreenfootImage[3];
    private int animCounter = 0;
    Win Win = new Win();
    
    public Protagonist()
    {
        intAnimationSprites();
    }
    
    /**
     * Act - do whatever the Protagonist wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeys();
        checkFall();
        win();
        die();
    }
    
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
            animateRunRight();
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
            animateRunLeft();
        }
        
        if (Greenfoot.isKeyDown("up") && onPlatform())
        {
            jump();
        }
    }
    
    public void jump()
    {
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        Fall();
    }
    
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
        animateRunRight();
    }
    
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
        animateRunLeft();
    }
    
    public void Fall()
    {
        setLocation (getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        jumping = true;
    }
    
    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        
        setLocation(getX(), newY);
        jumping = false;
    }
    
    public void moveToFloor(Actor Platform)
    {
        int PlatformHeight = Platform.getImage().getHeight();
        int newY = Platform.getY() - (PlatformHeight + getImage().getHeight())/2;
        
        setLocation(getX(), newY);
        jumping = false;
    }
    
    public void checkFall()
    {
        if(onPlatform()) 
        {
            vSpeed = 2;
        } 
        else 
        {
            Fall();
        }
    }
    
    public boolean onPlatform()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 2, Platform.class);
        if(under == null)
        {
            jumping = true;
            return false;
        }
        else
        {
            moveToFloor(under);
            return true;
        }
    }
    
    public void intAnimationSprites()
    {
        for (int i = 0; i < 3; i++)
        {
            String filename =  "Black Bunny in a Box" + i + ".png";
            walkRight[i] = new GreenfootImage(filename);
        }
        
        for (int i = 0; i < 3; i++)
        {
            String filename =  "Black Bunny in a Box" + i + ".png";
            walkLeft[i] = new GreenfootImage(filename);
            walkLeft[i].mirrorHorizontally();
        }
    }
    
    public void animateRunRight()
    {
        setImage(walkRight[animCounter++ % 3]);
        GreenfootImage image = getImage();
    }
    
    public void animateRunLeft()
    {
        setImage(walkLeft[animCounter++ % 3]);
        GreenfootImage image = getImage();
    }
    
    public void pickupCoin()
    {
       if (isTouching(Coin.class))
       {
           removeTouching(Coin.class);
           coinsCollected++;
       }
    }
    
    public void Alive()
    {
        if (isTouching(Lava.class))
        {
            alive = false;
        }
        else
        {
            alive = true;
        }
        
        if (isTouching(Spikes.class))
        {
            alive = false;
        }
        else
        {
            alive = true;
        }
    }
    
    public void win()
    {
        if(isTouching(CheckpointFlag.class))
        {
            Greenfoot.setWorld(Win);
        }
    }
    
    public void die()
    {
        if(isTouching(Lava.class))
        {
            setLocation(15,348);
        }
        
        if(isTouching(Spikes.class))
        {
            setLocation(15,348);
        }
    }
}
