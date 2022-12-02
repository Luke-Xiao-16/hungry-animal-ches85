import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * The world the hero elephant lives in.
 * 
 * @author Brady
 * @version Nov 11 2022
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
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        Apple apple = new Apple();
        addObject(apple, 300, 0);
    }
    
    /**
     * Create a new apple at random location at top of screen.
     */
    public void createApple()
    {
        Apple apple = new Apple();
        
        addObject(apple, 300, 0);
    }
    
    
}
