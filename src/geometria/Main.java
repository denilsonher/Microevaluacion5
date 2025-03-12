package geometria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(100, 400);
        Point p2 = new Point(400, 400);
        Point p3 = new Point(250, 100);

        Triangulo triangulo = new Triangulo(p1, p2, p3);
        DrawingPanel panel = new DrawingPanel(triangulo);

        JButton cambiarColorButton = new JButton("Cambiar Color");
        cambiarColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color nuevoColor = JColorChooser.showDialog(null, "Selecciona un color", Color.BLUE);
                if (nuevoColor != null) {
                    panel.setColorTriangulo(nuevoColor);
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(cambiarColorButton);

        JFrame frame = new JFrame("Dibujar Triángulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}