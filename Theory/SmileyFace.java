import java.awt.*;
import java.applet.*;

public class SmileyFace extends Applet {
    public void paint(Graphics g) {
        // Draw the circle for the face
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 200, 200);

        // Draw the eyes
        g.setColor(Color.black);
        g.fillOval(90, 100, 30, 30);
        g.fillOval(180, 100, 30, 30);

        // Draw the mouth
        g.fillArc(75, 150, 150, 70, 0, -180);

        /*<applet code="SmileyFace.class" width="300" height="300"></applet>*/
    }
}
