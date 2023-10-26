package OOP2;

import java.awt.*;
import java.util.List;
import javax.swing.*;

/**
 * Die Klasse {@code GfDisplay} stellt eine grafische Darstellung für verschiedene geometrische Formen bereit.
 * Sie erbt von {@link JPanel} und implementiert das {@link GfDisplayInterface} Interface.
 * Diese Klasse ermöglicht es, eine Liste von {@link ShapeDrawer}-Objekten zu zeichnen.
 *
 * Beispiel zur Verwendung:
 * <pre>
 *     // Erstellen Sie eine Liste von ShapeDrawers
 *     List<ShapeDrawer> shapes = new ArrayList<>();
 *     shapes.add(new RectangleShape(50, 50, 100, 50)); // Rechteck mit Position (50, 50), Breite 100 und Höhe 50
 *     shapes.add(new CircleShape(150, 50, 60)); // Kreis mit Mittelpunkt (150, 50) und Radius 60
 *
 *     // Initialisieren Sie das GfDisplay mit der Liste von ShapeDrawers
 *     GfDisplay.initDisplay(shapes);
 * </pre>
 *
 * @see JPanel
 * @see GfDisplayInterface
 * @see ShapeDrawer
 * @see RectangleShape
 * @see CircleShape
 * @see TriangleShape
 * @see EllipseShape
 */
public class GfDisplay extends JPanel implements GfDisplayInterface {
    private List<ShapeDrawer> shapeDrawers;

    /**
     * Konstruktor für die GfDisplay-Klasse.
     *
     * @param shapeDrawers Die Liste von {@link ShapeDrawer}-Objekten, die gezeichnet werden sollen.
     */
    public GfDisplay(List<ShapeDrawer> shapeDrawers) {
        this.shapeDrawers = shapeDrawers;
    }

    /**
     * Zeichnet die Formen aus der übergebenen Liste von {@link ShapeDrawer}-Objekten.
     *
     * @param g Das {@link Graphics}-Objekt zum Zeichnen der Formen.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawShapes(shapeDrawers, g);
    }

    /**
     * Zeichnet die Formen aus der übergebenen Liste von {@link ShapeDrawer}-Objekten auf dem gegebenen Graphics-Objekt.
     *
     * @param shapes Die Liste von {@link ShapeDrawer}-Objekten, die gezeichnet werden sollen.
     * @param g Das {@link Graphics}-Objekt zum Zeichnen der Formen.
     */
    @Override
    public void drawShapes(List<ShapeDrawer> shapes, Graphics g) {
        for (ShapeDrawer shapeDrawer : shapes) {
            shapeDrawer.draw(g);
        }
    }

    /**
     * Initialisiert ein JFrame-Fenster und zeigt die gezeichneten Formen an.
     *
     * @param shapeDrawers Die Liste von {@link ShapeDrawer}-Objekten, die gezeichnet werden sollen.
     */
    public static void initDisplay(List<ShapeDrawer> shapeDrawers) {
        JFrame frame = new JFrame("GfDisplay Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        GfDisplay gfDisplay = new GfDisplay(shapeDrawers);
        frame.add(gfDisplay);
        frame.setVisible(true);
    }
}
