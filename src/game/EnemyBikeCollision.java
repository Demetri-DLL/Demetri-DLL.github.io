package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class EnemyBikeCollision implements CollisionListener {
    private Player player;
    public EnemyBikeCollision(Player s){
        this.player = s;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof EnemyBike) {
            player.HitReg();
            e.getOtherBody().destroy();
        }
       // if (player.getHitPoints()<=0) {

       //     player.destroy();
       // }

    }

}
