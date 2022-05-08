package game;

import city.cs.engine.*;

import java.awt.*;

/**
 * This is the class that game levels follow. All game levels will be derrived from this.
 */
public abstract class GameLevel extends World {


    private Player player;
    public GameLevel(Game game){
        super();
        //2. populate the GameWorld with bodies (ex: platforms, collectibles, characters)

        //3. create enemies


        //make a ground platforms--- will fix this in future





        /* make a suspended platform
        Shape platformShape = new BoxShape(3, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-8, -4f));
*/
        //make a character (with an overlaid image)

        player = new Player(this);
       EnemyBikeCollision touch = new EnemyBikeCollision(player);
        player.addCollisionListener(touch);

        MagicCoinCollision col = new MagicCoinCollision(this,game);
        player.addCollisionListener(col);

        MechCollision mee = new MechCollision(player);
        player.addCollisionListener(mee);

        SpikeCollision fin = new SpikeCollision(player);
        player.addCollisionListener(fin);
    }
    public abstract boolean isComplete();

    public Player getPlayer(){
        return player;}



    public abstract Image getBackground();
}
