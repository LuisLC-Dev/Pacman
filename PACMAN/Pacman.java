import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacman extends Actor
{
    /**
     * Act - do whatever the Pacman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int currentImage;
    private int counter;
    private int score=0;

    public Pacman()
    {
        setImage("images/pacmanbocaAbierta.png");
    }

    public void act() 
    {
        
        getWorld().showText("Score: " + score, 810,23);
        
        moveMouth();

        Warp();

        omnom();

        handleDirection();
        
       

    }    

    public int getScore()
    {
        return score;
    }

    public void handleDirection()
    {
        int x = getX();
        int y = getY();
        int OFFSET = 5;

        if(Greenfoot.isKeyDown("right"))
        {
            Actor collide=getOneObjectAtOffset(38,0,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
            }
            setLocation(x + OFFSET, y);
            //setRotation(0);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            Actor collide=getOneObjectAtOffset(-38,0,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
            }
            setLocation(x - OFFSET, y);
            //setRotation(-180);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            Actor collide=getOneObjectAtOffset(0,-38,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
            }
            setLocation(x, y - OFFSET);
            //setRotation(-90);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            Actor collide=getOneObjectAtOffset(0,38,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
            }
            setLocation(x, y + OFFSET);
            //setRotation(-270);
        }
    }

    public void moveMouth()
    {
        if(counter==0)
        {
            if(currentImage==0)
            {
                setImage("pacmanbocaCerrada.png");
            }else if(currentImage==1)
            {
                setImage("pacmanbocaAbierta.png");
            }
            currentImage = (currentImage + 1) % 2;
        }
        counter = (counter + 1)%10;
    }

    public void Warp()
    {
        int x = getX();
        int y = getY(); 

        if(x>=826)
        {
            setLocation(38,y);
            //setRotation(0);
        }else if(x<=38)
        {
            setLocation(826,y);
            //setRotation(180);
        }
    }

    public void omnom()
    {
        if(isTouching(Item.class))
        {
            Item item=(Item)getOneIntersectingObject(Item.class);
            score+=item.getScore();
            removeTouching(Item.class);
        }
    }
}