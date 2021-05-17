import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanLevel1 extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    Pacman pacman = new Pacman();
    
    public PacmanLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(864, 672, 1); //corrections for 72*56 wall, fits all on a 12*12 grid
        for(int x=0;x<12;x++)
        {
            this.addObject(new Wall(), 36+(72*x), 23);
        }
        for(int x=0;x<12;x++)
        {
            this.addObject(new Wall(), 36+(72*x), 649);
        }
        for(int x=0;x<4;x++)
        {
            this.addObject(new Wall(), 36, 79+(56*x));
        }
        //left column of walls (2)
        for(int x=0;x<4;x++)
        {
            this.addObject(new Wall(), 36, 593-(56*x));
        }
        for(int x=0;x<4;x++)
        {
            this.addObject(new Wall(), 828, 79+(56*x));
        }
        for(int x=0;x<4;x++)
        {
            this.addObject(new Wall(), 828, 593-(56*x));
        }
        for(int x=0;x<6;x++)
        {
            this.addObject(new Wall(), 252+(72*x), 191);
        }
        for(int x=0;x<4;x++)
        {
            this.addObject(new Wall(), 252, 247+(56*x));
        }
        for(int x=0;x<4;x++)
        {
            this.addObject(new Wall(), 612, 247+(56*x));
        }
        for(int x=0;x<2;x++)
        {
            this.addObject(new Wall(), 252+(72*x), 471);
        }
        for(int x=0;x<2;x++)
        {
            this.addObject(new Wall(), 612-(72*x), 471);
        }

        this.addObject(new BigDot(), 144, 336);
        this.addObject(new BigDot(), 720, 336);
        //Small Dots
        this.addObject(new SmallDot(), 144, 112);
        this.addObject(new SmallDot(), 144*2, 112);
        this.addObject(new SmallDot(), 144*3, 112);
        this.addObject(new SmallDot(), 144*4, 112);
        this.addObject(new SmallDot(), 144*5, 112);
        this.addObject(new SmallDot(), 144, 560);
        this.addObject(new SmallDot(), 144*2, 560);
        this.addObject(new SmallDot(), 144*3, 560);
        this.addObject(new SmallDot(), 144*4, 560);
        this.addObject(new SmallDot(), 144*5, 560);
        //fruits
        this.addObject(new Strawberry(), 72*5, 56*6);
        this.addObject(new Cherries(), 72*7, 56*6);

        addObject(new Pacman(),432,332);
    }
}
