import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Sun sun = new Sun();
        addObject(sun,553,60);
        sun.setLocation(535,58);

        Cloud cloud = new Cloud();
        addObject(cloud,42,22);
        cloud.setLocation(43,29);

        Cloud cloud2 = new Cloud();
        addObject(cloud2,142,92);
        cloud2.setLocation(140,87);

        Cloud cloud3 = new Cloud();
        addObject(cloud3,415,14);
        cloud3.setLocation(413,10);

        Cloud cloud4 = new Cloud();
        addObject(cloud4,288,51);
        cloud4.setLocation(295,49);

        Cloud cloud5 = new Cloud();
        addObject(cloud5,360,120);
        cloud5.setLocation(360,121);
        cloud2.setLocation(177,85);

        Cloud cloud6 = new Cloud();
        addObject(cloud6,188,63);
        cloud6.setLocation(190,67);
        cloud6.setLocation(190,84);

        Cloud cloud7 = new Cloud();
        addObject(cloud7,72,129);
        cloud7.setLocation(6,119);

        Cloud cloud8 = new Cloud();
        addObject(cloud8,514,156);
        cloud8.setLocation(598,111);

        Cloud cloud9 = new Cloud();
        addObject(cloud9,515,61);
        cloud9.setLocation(515,61);

        Cloud cloud10 = new Cloud();
        addObject(cloud10,472,151);
        cloud10.setLocation(484,143);
        cloud10.setLocation(510,150);

        Cloud cloud11 = new Cloud();
        addObject(cloud11,510,150);
        cloud10.setLocation(506,142);
        cloud10.setLocation(520,152);

        Dirt dirt = new Dirt();
        addObject(dirt,47,348);
        dirt.setLocation(17,382);

        Dirt dirt2 = new Dirt();
        addObject(dirt2,88,359);
        dirt2.setLocation(52,382);

        Dirt dirt3 = new Dirt();
        addObject(dirt3,98,355);
        dirt3.setLocation(87,382);

        Dirt dirt4 = new Dirt();
        addObject(dirt4,544,370);
        dirt4.setLocation(544,370);

        Dirt dirt5 = new Dirt();
        addObject(dirt5,540,371);
        dirt5.setLocation(540,371);

        Dirt dirt16 = new Dirt();
        addObject(dirt16,576,348);
        dirt16.setLocation(540,382);

        Dirt dirt17 = new Dirt();
        addObject(dirt17,580,364);
        dirt17.setLocation(575,382);

        Dirt dirt18 = new Dirt();
        addObject(dirt18,540,337);
        dirt18.setLocation(603,382);

        Protagonist protagonist = new Protagonist();
        addObject(protagonist,15,348);

        Lava lava = new Lava();
        addObject(lava,148,381);
        lava.setLocation(157,382);

        Lava lava2 = new Lava();
        addObject(lava2,271,384);
        lava2.setLocation(262,382);

        Lava lava3 = new Lava();
        addObject(lava3,374,381);
        lava3.setLocation(368,382);

        Lava lava4 = new Lava();
        addObject(lava4,466,383);
        lava4.setLocation(474,382);

        Platform platform = new Platform();
        addObject(platform,139,319);
        platform.setLocation(151,318);

        Platform platform2 = new Platform();
        addObject(platform2,237,269);
        platform2.setLocation(274,270);
        platform2.setLocation(275,265);

        Platform platform3 = new Platform();
        addObject(platform3,392,287);
        platform3.setLocation(437,264);

        Platform platform4 = new Platform();
        addObject(platform4,482,341);
        platform4.setLocation(500,347);

        CheckpointFlag checkpointFlag = new CheckpointFlag();
        addObject(checkpointFlag,404,240);
        checkpointFlag.setLocation(410,236);

        platform4.setLocation(507,345);
        platform4.setLocation(518,310);

        cloud10.setLocation(529,150);

        Coin coin = new Coin();
        addObject(coin,74,349);

        Spikes spikes = new Spikes();
        addObject(spikes,156,301);
        spikes.setLocation(150,300);

        removeObject(dirt2);
        removeObject(dirt3);
        cloud10.setLocation(553,150);
        dirt.setLocation(500,388);
        dirt.setLocation(46,388);
        dirt2.setLocation(500,488);
        dirt3.setLocation(500,388);
        dirt4.setLocation(500,388);
        dirt5.setLocation(500,388);

        removeObject(coin);
        checkpointFlag.setLocation(527,282);
    }
}