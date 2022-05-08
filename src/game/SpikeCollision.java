package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

/**
 * example of collision object click to expand
 */
public class SpikeCollision implements CollisionListener {
    private Player player;
    public SpikeCollision(Player s){
        this.player = s;
    }

    @Override
    /**
     * when a collision is detected that is of enemy spike
     * hitreg is called and decrements the players health.
     */
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof Spike) {
            player.HitReg();
            e.getOtherBody().destroy();
        }
        // if (player.getHitPoints()<=0) {

        //     player.destroy();
        // }

    }

}