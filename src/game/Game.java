package game;

import city.cs.engine.*;

import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

/**
 * Your main game entry point
 */
public class Game {


    private boolean gameOver;
    GameView view;
    GameLevel currentLevel;
    private JFrame frame;
    private boolean menuVisible;
    private ControlPanel controlPanel;

    PlayerController controller;

    /** Initialise a new Game. */
    public Game() {

    menuVisible = false;
        gameOver=false;

        //1. make an empty game world
        //World world = new World();
        currentLevel = new Level1(this);



        //3. make a view to look into the game world
        //UserView view = new UserView(world, 800, 800);
        view = new GameView(this,currentLevel, 1920,1080);


        //optional: draw a 1-metre grid over the view
        // view.setGridResolution(1);


        controller = new PlayerController(this,currentLevel.getPlayer());
        view.addKeyListener(controller);



        view.addMouseListener(new GiveFocus(view));

     Tracker tracker =new Tracker(view, currentLevel.getPlayer());
     currentLevel.addStepListener(tracker);



        //4. create a Java window (frame) and add the game
        //   view to it
        frame = new JFrame("City Game");
        frame.add(view);

        controlPanel = new ControlPanel();
        //frame.add(controlPanel.mainPanel, BorderLayout.NORTH);

        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);

        //optional: uncomment this to make a debugging view
         JFrame debugView = new DebugViewer(currentLevel, 500, 500);

        // start our game world simulation!
        currentLevel.start();





    }

    public void goToNextLevel(){
/**
 * This method changes levels by stopping the current level and creating the new world and new view
  *@version 1.2
 */
        if(currentLevel instanceof Level1) {
            currentLevel.stop();

            currentLevel = new Level2(this);

            view.setWorld(currentLevel);

            controller.updatePlayer(currentLevel.getPlayer());

            Tracker tracker = new Tracker(view, currentLevel.getPlayer());
            currentLevel.addStepListener(tracker);

            currentLevel.start();
        }
        else if (currentLevel instanceof Level2){
            currentLevel.stop();

            currentLevel = new Level3(this);

            view.setWorld(currentLevel);

            controller.updatePlayer(currentLevel.getPlayer());

            Tracker tracker = new Tracker(view, currentLevel.getPlayer());
            currentLevel.addStepListener(tracker);

            currentLevel.start();

        }
        else if(currentLevel instanceof Level3){
            System.out.println("Well done! Game complete.");
            System.exit(0);
        }


    }


    /** Run the game. */
    public static void main(String[] args) {

        new Game();


    }
    public boolean isGameOver(){
    return gameOver;
    }

    public void toggleMenu () {
        if (menuVisible) {
            frame.remove(controlPanel.mainPanel);
            menuVisible = false;
            frame.pack();
        }
        else{
            frame.add(controlPanel.mainPanel, BorderLayout.NORTH);
            menuVisible = true;
            frame.pack();
        }
    }

}
