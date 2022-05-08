package game;

import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;

public class Level2 extends GameLevel{

    Image background;

    public Level2(Game game){
        super(game);

        background = new ImageIcon("data/background2.jpg").getImage();




        Shape shape = new BoxShape(13, 5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(-60f, -30.0f));
        ground.addImage(new BodyImage("data/level2plat.png",10));


        StaticBody ground1 = new StaticBody(this, shape);
        ground1.setPosition(new Vec2(-35f, -30.0f));
        ground1.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground2 = new StaticBody(this, shape);
        ground2.setPosition(new Vec2(-10f, -30.0f));
        ground2.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground3 = new StaticBody(this, shape);
        ground3.setPosition(new Vec2(15f, -30.0f));
        ground3.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground4 = new StaticBody(this, shape);
        ground4.setPosition(new Vec2(40f, -30.0f));
        ground4.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground5 = new StaticBody(this, shape);
        ground5.setPosition(new Vec2(65f, -30.0f));
        ground5.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground6 = new StaticBody(this, shape);
        ground6.setPosition(new Vec2(90f, -30.0f));
        ground6.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground7 = new StaticBody(this, shape);
        ground7.setPosition(new Vec2(115f, -30.0f));
        ground7.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground8 = new StaticBody(this, shape);
        ground8.setPosition(new Vec2(140f, -30.0f));
        ground8.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground9 = new StaticBody(this, shape);
        ground9.setPosition(new Vec2(165f, -30.0f));
        ground9.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground10 = new StaticBody(this, shape);
        ground10.setPosition(new Vec2(190f, -30.0f));
        ground10.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground111 = new StaticBody(this, shape);
        ground111.setPosition(new Vec2(215f, -30.0f));
        ground111.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground11 = new StaticBody(this, shape);
        ground11.setPosition(new Vec2(240f, -30.0f));
        ground11.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground12 = new StaticBody(this, shape);
        ground12.setPosition(new Vec2(265f, -30.0f));
        ground12.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground13 = new StaticBody(this, shape);
        ground13.setPosition(new Vec2(290f, -30.0f));
        ground13.addImage(new BodyImage("data/level2plat.png",10));

        StaticBody ground113 = new StaticBody(this, shape);
        ground113.setPosition(new Vec2(315f, -30.0f));
        ground113.addImage(new BodyImage("data/level2plat.png",10));


        Shape square = new BoxShape(1.5f, 1.5f);
        StaticBody crate1  = new StaticBody(this,square);
        crate1.setPosition(new Vec2(70,-23.5f));
        crate1.addImage(new BodyImage("data/crate2.png",3.5f));

        StaticBody crate2  = new StaticBody(this,square);
        crate2.setPosition(new Vec2(73,-23.5f));
        crate2.addImage(new BodyImage("data/crate2.png",3.5f));

        StaticBody crate3  = new StaticBody(this,square);
        crate3.setPosition(new Vec2(76,-23.5f));
        crate3.addImage(new BodyImage("data/crate2.png",3.5f));

        StaticBody crate4  = new StaticBody(this,square);
        crate4.setPosition(new Vec2(79,-23.5f));
        crate4.addImage(new BodyImage("data/crate2.png",3.5f));

        StaticBody crate5  = new StaticBody(this,square);
        crate5.setPosition(new Vec2(72,-23.5f));
        crate5.addImage(new BodyImage("data/crate2.png",3.5f));

        StaticBody crate6  = new StaticBody(this,square);
        crate6.setPosition(new Vec2(79,-20.5f));
        crate6.addImage(new BodyImage("data/crate2.png",3.5f));


        StaticBody crate7  = new StaticBody(this,square);
        crate7.setPosition(new Vec2(175,-23.5f));
        crate7.addImage(new BodyImage("data/crate2.png",3.5f));

        StaticBody crate8  = new StaticBody(this,square);
        crate8.setPosition(new Vec2(200,-23.5f));
        crate8.addImage(new BodyImage("data/crate2.png",3.5f));

        StaticBody crate9  = new StaticBody(this,square);
        crate9.setPosition(new Vec2(225,-23.5f));
        crate9.addImage(new BodyImage("data/crate2.png",3.5f));

        StaticBody crate10  = new StaticBody(this,square);
        crate10.setPosition(new Vec2(250,-23f));
        crate10.addImage(new BodyImage("data/crate2.png",3.5f));

        StaticBody crate11  = new StaticBody(this,square);
        crate11.setPosition(new Vec2(275,-17.5f));
        crate11.addImage(new BodyImage("data/crate2.png",3.5f));

        StaticBody crate12  = new StaticBody(this,square);
        crate12.setPosition(new Vec2(300,-22.5f));
        crate12.addImage(new BodyImage("data/crate2.png",3.5f));



        new Mech(this).setPosition(new Vec2(100,-20));
        new Mech(this).setPosition(new Vec2(150,-20));

        new MagicCoin(this).setPosition(new Vec2(310,-25));

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
