package drawing;

import java.awt.Color;
import java.awt.Graphics;

public class DrawPanel extends javax.swing.JPanel {
    
    private Color drawColor = new Color(0, 255, 0);
    
    public DrawPanel(){
        initComponents();
        setSize(300, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g){
        setOpaque(false);
        g.setColor(drawColor);
        g.fillOval(100, 100, 50, 50);
    }
    
    public void setColor(Color c){
        drawColor = c;
        repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
