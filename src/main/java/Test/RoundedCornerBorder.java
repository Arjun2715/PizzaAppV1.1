/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author arjun
 */
public class RoundedCornerBorder extends AbstractBorder{
    private Color color;
    private int thickness = 0;
    private int radii = 20;

    public RoundedCornerBorder(Color color) {
        this.color = color;
    }

    public RoundedCornerBorder(Color color, int thickness, int radii) {
        this.color = color;
        this.thickness = thickness;
        this.radii = radii;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(color);
        g2d.setStroke(new java.awt.BasicStroke(thickness));
        g2d.draw(new RoundRectangle2D.Double(x, y, width - 1, height - 1, radii, radii));
        g2d.dispose();
    }
    
}
