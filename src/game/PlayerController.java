package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Manages aspects of player movement such as speed and jump height.
 */
public class PlayerController implements KeyListener{

    private static int WALKING_SPEED=10;
   // private float WALKING_SPEED = 10;
    private Player player;
    private float jmpHeight=10;
    private Game game;
    public PlayerController(Game game, Player player) {
        this.player = player;
        this.game= game;
    }

    /**
     * when 1 is pressed movement starts
     * when space is pressed player jumps
     * when escape is pressed menu is toggled
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
         if (code == KeyEvent.VK_1) {
            player.startWalking(WALKING_SPEED);
        } else if (code == KeyEvent.VK_SPACE){

            player.jump(jmpHeight);
        }
         else if (code ==KeyEvent.VK_ESCAPE){
             game.toggleMenu();
         }


    }

    /**
     * when called walking speed is increased
     */
    public static void speedIncrement(){
        WALKING_SPEED ++;
        System.out.println("speed up");
    }
    /**
     * when called walking speed is decreased
     */
    public static void speedDecrement(){
        WALKING_SPEED --;
        System.out.println("speed down");
    }



    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
    }

    @Override
    public void keyTyped(KeyEvent e){
    }

    public void updatePlayer(Player newPlayer){
        player = newPlayer;
    }


}

