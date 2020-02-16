import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Playground {

    int width;
    int height;


    public Playground() {

        Rectangle background = new Rectangle(0, 0, 800, 600);
        background.setColor(Color.WHITE);
        background.fill();

    }

    Rectangle obstacle = new Rectangle(800, 550, 50, 50);
        obstacle.setColor(Color.BLACK);
        obstacle.fill();

    public void moveObstacle() {
        obstacle.translate(-5, 0);
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    /*
public void translate​(double dx, double dy)
Specified by:
translate in interface Movable
Parameters:
dx - the amount by which to move in x-direction
dy - the amount by which to move in y-direction
     */

}