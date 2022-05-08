package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Example of how level generation is done
 */
public class Level1 extends GameLevel{
    private SoundClip gameMusic;


    Image background;

    public Level1(Game game){
        super(game);

        background = new ImageIcon("data/resized-image-Promo.jpg").getImage();

        new EnemyBike(this).setPosition(new Vec2(80f,-25));
        new EnemyBike(this).setPosition(new Vec2(200f,-25));
        new EnemyBike(this).setPosition(new Vec2(45f,-25));
        new EnemyBike(this).setPosition(new Vec2(350f,-25));

        new MagicCoin(this).setPosition(new Vec2(360,-25));


/**
 * Plays this music throughout the level
 */
        try{
            gameMusic = new SoundClip("data/back1.wav" );
            gameMusic.loop();
        }catch (UnsupportedAudioFileException|IOException|
                LineUnavailableException e) {
            //code in here will deal with any errors
            //that might occur while loading/playing sound
            System.out.println(e);
        }

/**
 * creates the platfoms which the player moved on
 */
        
        Shape shape = new BoxShape(13, 5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(-60f, -30.0f));
        ground.addImage(new BodyImage("data/1.jpg",10));





        StaticBody ground1 = new StaticBody(this, shape);
        ground1.setPosition(new Vec2(-35f, -30.0f));
        ground1.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground2 = new StaticBody(this, shape);
        ground2.setPosition(new Vec2(-10f, -30.0f));
        ground2.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground3 = new StaticBody(this, shape);
        ground3.setPosition(new Vec2(15f, -30.0f));
        ground3.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground4 = new StaticBody(this, shape);
        ground4.setPosition(new Vec2(40f, -30.0f));
        ground4.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground5 = new StaticBody(this, shape);
        ground5.setPosition(new Vec2(60f, -30.0f));
        ground5.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground6 = new StaticBody(this, shape);
        ground6.setPosition(new Vec2(90f, -30.0f));
        ground6.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground7 = new StaticBody(this, shape);
        ground7.setPosition(new Vec2(115f, -30.0f));
        ground7.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground8 = new StaticBody(this, shape);
        ground8.setPosition(new Vec2(140f, -30.0f));
        ground8.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground9 = new StaticBody(this, shape);
        ground9.setPosition(new Vec2(165f, -30.0f));
        ground9.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground10 = new StaticBody(this, shape);
        ground10.setPosition(new Vec2(190f, -30.0f));
        ground10.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground111 = new StaticBody(this, shape);
        ground111.setPosition(new Vec2(215f, -32.0f));
        ground111.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground11 = new StaticBody(this, shape);
        ground11.setPosition(new Vec2(240f, -30.0f));
        ground11.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground12 = new StaticBody(this, shape);
        ground12.setPosition(new Vec2(265f, -30.0f));
        ground12.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground13 = new StaticBody(this, shape);
        ground13.setPosition(new Vec2(270f, -30.0f));
        ground13.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground113 = new StaticBody(this, shape);
        ground113.setPosition(new Vec2(295f, -30.0f));
        ground113.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground14 = new StaticBody(this, shape);
        ground14.setPosition(new Vec2(320f, -30.0f));
        ground14.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground15 = new StaticBody(this, shape);
        ground15.setPosition(new Vec2(345f, -30.0f));
        ground15.addImage(new BodyImage("data/1.jpg",10));

        StaticBody ground16 = new StaticBody(this, shape);
        ground16.setPosition(new Vec2(370f, -30.0f));
        ground16.addImage(new BodyImage("data/1.jpg",10));


        getPlayer().setPosition(new Vec2(-20,-18));


    }

    @Override
    public boolean isComplete() {
        if (getPlayer().getTransition()==1)
            return true;
        else
            return false;
    }

    @Override
    public Image getBackground() {
        return background;
    }

}
