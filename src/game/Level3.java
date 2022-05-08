package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Level3 extends GameLevel{


    Image background;

    public Level3(Game game){
        super(game);

        background = new ImageIcon("data/background3.png").getImage();



        new MagicCoin(this).setPosition(new Vec2(260,-25));

        new Spike(this).setPosition(new Vec2(150,-20));
        new Spike(this).setPosition(new Vec2(190,-20));
        new Spike(this).setPosition(new Vec2(230,-20));



        Shape shape = new BoxShape(13, 5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(-60f, -30.0f));
        ground.addImage(new BodyImage("data/level3plat.png",10));



        StaticBody ground1 = new StaticBody(this, shape);
        ground1.setPosition(new Vec2(-35f, -30.0f));
        ground1.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground2 = new StaticBody(this, shape);
        ground2.setPosition(new Vec2(-10f, -28.0f));
        ground2.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground3 = new StaticBody(this, shape);
        ground3.setPosition(new Vec2(15f, -26.0f));
        ground3.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground4 = new StaticBody(this, shape);
        ground4.setPosition(new Vec2(40f, -24.0f));
        ground4.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground5 = new StaticBody(this, shape);
        ground5.setPosition(new Vec2(60f, -22.0f));
        ground5.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground6 = new StaticBody(this, shape);
        ground6.setPosition(new Vec2(90f, -24.0f));
        ground6.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground7 = new StaticBody(this, shape);
        ground7.setPosition(new Vec2(115f, -26.0f));
        ground7.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground8 = new StaticBody(this, shape);
        ground8.setPosition(new Vec2(140f, -28.0f));
        ground8.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground9 = new StaticBody(this, shape);
        ground9.setPosition(new Vec2(165f, -30.0f));
        ground9.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground10 = new StaticBody(this, shape);
        ground10.setPosition(new Vec2(190f, -32.0f));
        ground10.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground111 = new StaticBody(this, shape);
        ground111.setPosition(new Vec2(215f, -34.0f));
        ground111.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground11 = new StaticBody(this, shape);
        ground11.setPosition(new Vec2(240f, -38.0f));
        ground11.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground12 = new StaticBody(this, shape);
        ground12.setPosition(new Vec2(265f, -40.0f));
        ground12.addImage(new BodyImage("data/level3plat.png",10));

        StaticBody ground13 = new StaticBody(this, shape);
        ground13.setPosition(new Vec2(270f, -40.0f));
        ground13.addImage(new BodyImage("data/level3plat.png",10));


        new MagicCoin(this).setPosition(new Vec2(290,-29));


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
