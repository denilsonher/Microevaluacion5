package geometria;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

public class DrawingPanel extends JPanel {
    private Geometria2D figura;
    private Color colorTriangulo;

    public DrawingPanel(Geometria2D figura) {
        this.figura = figura;
        this.colorTriangulo = Color.BLUE;
        setPreferredSize(new Dimension(480, 480));
        setBackground(Color.WHITE);
    }

    public void setColorTriangulo(Color color) {
        this.colorTriangulo = color;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        if (figura instanceof Triangulo) {
            Triangulo triangulo = (Triangulo) figura;
            g2.setColor(colorTriangulo);

            Point p1 = triangulo.getP1();
            Point p2 = triangulo.getP2();
            Point p3 = triangulo.getP3();

            int[] xPoints = {p1.x, p2.x, p3.x};
            int[] yPoints = {p1.y, p2.y, p3.y};
            g2.fillPolygon(xPoints, yPoints, 3);
        }
    }
}