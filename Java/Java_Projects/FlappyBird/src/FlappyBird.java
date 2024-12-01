import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList; //pipes
import java.util.Random; // pipe placement randomize
import javax.swing.*;

public class FlappyBird extends Panel {
    int boardWidth = 360;
    int boardHeight = 640;

    // Images Varibles
    Image backgroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;


    FlappyBird() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        // setBackground(Color.blue);

        // load images
        backgroundImg = new ImageIcon(getClass().getResource("/flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("/flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("/toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("/bottompipe.png")).getImage();
    }
}
