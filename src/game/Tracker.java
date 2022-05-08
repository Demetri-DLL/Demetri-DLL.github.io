package game;

import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;
import org.jbox2d.common.Vec2;

/**
 * makes sure that the camera is following the player throughout all the gameplay
 */

public class Tracker implements StepListener {


    private GameView view;
    private Player player;
    public Tracker(GameView view, Player player){
        this.view=view;
        this.player = player;
    }

    /**
     * gets the player position and sets the view to the players current position
     * @param e
     */
    public void preStep (StepEvent e){}
    public void postStep(StepEvent e){
        view.setCentre(new Vec2(player.getPosition().x,-10));
    }

    public void updatePlayer(Player newPlayer){
        player = newPlayer;
    }
}
