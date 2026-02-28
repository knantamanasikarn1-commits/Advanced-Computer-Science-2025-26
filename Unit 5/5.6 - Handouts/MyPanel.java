import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    final Color GRASS_GREEN = new Color(124, 252, 0);
    final Color HOUSE_BROWN = new Color(182, 142, 101);
    final Color WINDOW_BLUE = new Color(109, 151, 151);
    final Color DOOR_BROWN = new Color(125, 88, 57);
    final Color ROOF_RED = new Color(161, 71, 67);

    public MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setSize(500, 500);
    }

    public void paint(Graphics g) {
        // to-do: draw the house!

        // Adds shapes to an ArrayList, converting them all to Polygons
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        // building
        shapes.add(new Rectangle(125, 125, 250, 250, HOUSE_BROWN, Color.black, 5));
        // shapes.add(new Rectangle(125, 125, 250, 250));
        // shapes.get(0).setFillColor(HOUSE_BROWN);
        // shapes.get(0).setStrokeColor(Color.black);
        // shapes.get(0).setStrokeWidth(5);

        // door
        shapes.add(new Rectangle(175, 250, 50, 125, DOOR_BROWN, Color.black, 5));
        // shapes.get(1).setFillColor(DOOR_BROWN);
        // shapes.get(1).setStrokeColor(20, 20, 20);
        // shapes.get(1).setStrokeWidth(5);

        // roof
        // shapes.add(new Triangle(new int[]{125, 250, 375}, new int[]{125, 75, 125}));
        shapes.add(new Triangle(new int[]{100, 250, 400}, new int[]{125, 50, 125}));
        shapes.get(2).setFillColor(ROOF_RED);
        shapes.get(2).setStrokeColor(Color.black);
        shapes.get(2).setStrokeWidth(5);

        // sun
        shapes.add(new Circle(50, 50, 50));
        shapes.get(3).setFillColor(Color.yellow);
        shapes.get(3).setStrokeColor(Color.orange);
        shapes.get(3).setStrokeWidth(5);

        // window
        shapes.add(new Square(280, 180, 50));
        shapes.get(4).setFillColor(Color.cyan);
        shapes.get(4).setStrokeColor(Color.black);
        shapes.get(4).setStrokeWidth(5);

        // grass
        shapes.add(new Rectangle(0, 380, 500, 120));
        shapes.get(5).setFillColor(GRASS_GREEN);
        shapes.get(5).setStrokeColor(GRASS_GREEN);
        shapes.get(5).setStrokeWidth(5);

        // Draws all the shapes in the ArrayList using that shape's draw method
        for (Shape p : shapes) {
            p.draw(g);
        }

    }

}
