package game;

import city.cs.engine.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Controls and holds all the properties of the player like model and size as well at health and score.
 */
public class Player extends Walker {
    private static final Shape playerShape = new BoxShape(1,2);
    private static final BodyImage image = new BodyImage("data/idle_1.v2.png", 4);
    private static int HitPoints;
    private static int score=0;
    //public boolean gameOver=false;

    /**
     * creates audio file for audio use
     */
    private int transition=0;
    //private int HitPoints;
    private static SoundClip grunt;
    static{
    try{
        grunt = new SoundClip("data/grunt.wav" );
    }catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        //code in here will deal with any errors
        //that might occur while loading/playing sound
        System.out.println(e);
    }}

    public Player(World world){
        super(world, playerShape);
        this.addImage(image);
        HitPoints = 3;
    }

    public static int getHitPoints() {
        return HitPoints;
    }
    /**
     * Responsible for decrementing the player hitpoint when they collide with an object.
     */
    public void HitReg(){
        HitPoints--;
        grunt.play();
        System.out.println("Health ="+HitPoints);
        if (HitPoints<=0){
            destroy();
        }

    }

    public static int getScore() {
        return score;
    }

    public static void scoreUp(){
        score ++;

    }


    public int getTransition() {
        return transition;
    }





}
