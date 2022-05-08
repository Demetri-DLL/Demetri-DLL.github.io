package game;
import city.cs.engine.*;

import javax.swing.*;
import java.awt.*;

/**
 * Puts the view onto the current game level Methods in this class draw the basic GUI elements.
 */
public class GameView extends UserView{

    private Game game;
    GameLevel currentLevel;
    public GameView(Game game, GameLevel w, int width, int height) {
        super(w, width, height);
        currentLevel = w;
        this.game=game;
    }

@Override
public void setWorld(World w){
        super.setWorld(w);
        currentLevel = (GameLevel)w;
}

    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(currentLevel.getBackground(), 0, 0, this);
    }


/*
    @Override
    protected void paintForeground(Graphics2D g){
        Font font = new Font("Arial",Font.BOLD,200);

        g.setFont(font);
        g.setColor(Color.red);
        g.drawString("health="+player.getHitpoints(),700,700);
    }
*/
@Override
protected void paintForeground(Graphics2D g) {
    if(game.isGameOver()){
        g.drawString("gameOver",this.getWidth()/2,this.getHeight()/2);
    }
    g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
    g.drawString("Health: " + Player.getHitPoints(), 10, 20);
    g.drawString("Score: " + Player.getScore(), 100, 20);


}
}
