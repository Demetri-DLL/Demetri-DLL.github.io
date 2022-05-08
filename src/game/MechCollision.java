package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class MechCollision implements CollisionListener {
    private Player player;
    public MechCollision(Player s){
        this.player = s;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof Mech) {
            player.HitReg();
            e.getOtherBody().destroy();
        }
        // if (player.getHitPoints()<=0) {

        //     player.destroy();
        // }

    }

}