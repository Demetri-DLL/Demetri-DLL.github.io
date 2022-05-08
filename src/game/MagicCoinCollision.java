package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

/**
 * Add collision on magic coin object which will transition into next level
 * Calls goToNextLevel Function
 * @author Demetri
 */
public class MagicCoinCollision implements CollisionListener {
    private Player player;
    GameLevel currentLevel;
    Game game;


    public MagicCoinCollision(GameLevel level,Game game){
       currentLevel = level;
       this.game= game;
    }

    /**
     * goes to the next Level on coin collision
     * @param e
     */
    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof MagicCoin) {
            //if (currentLevel.isComplete())
                game.goToNextLevel();
                Player.scoreUp();
        }
        // if (player.getHitPoints()<=0) {

        //     player.destroy();
        // }

    }

}
