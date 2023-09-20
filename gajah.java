import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gajah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gajah extends Actor
{
    /**
     * Act - do whatever the gajah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Gerakan aktor ke depan
        int rotationSpeed = Greenfoot.getRandomNumber(7) + 1;
        move(10);

        // Rotasi aktor secara acak saat mencapai ujung layar
        if (isAtEdge()) {
            turn(Greenfoot.getRandomNumber(360)); 
        }
    
        // Add your action code here.
    }
}
