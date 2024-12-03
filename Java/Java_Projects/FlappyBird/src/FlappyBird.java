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

    // Bird
    int birdX = boardWidth / 8;
    int birdY = boardHeight / 2;
    int birdWidth = 34;
    int birdHeight = 24;

    class Bird {
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        Bird(Image img) {
            this.img = img;
        }
    }

    // game logic
    Bird bird;

    FlappyBird() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        // setBackground(Color.blue);

        // Load images
        backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

        // System.out.println(backgroundImg);

        bird = new Bird(birdImg);
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // background
        g.drawImage(backgroundImg, 0, 0, boardWidth, boardHeight, null);
        // bird
        g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);
    }
}
