
import java.awt.Color;
import java.awt.Label;
import javax.swing.ImageIcon;

        

public class AppTest extends javax.swing.JFrame {
    
    AllShapes shapecol = new AllShapes();

    public AppTest() {
        initComponents();
        
        btnBasic.setBorderPainted(false); 
	btnBasic.setContentAreaFilled(false); 
	btnBasic.setOpaque(false);
        btnBasic.setIcon(new ImageIcon(shapecol.getCircle()));
        btnBasic.repaint();
        Label.setIcon(new ImageIcon(AllShapes.getCircleB()));
        Label.setBounds(90, 100, 100, 100);
        Label.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnCircle = new javax.swing.JButton();
        btnSquare = new javax.swing.JButton();
        comboColor = new javax.swing.JComboBox<>();
        btnRectangle = new javax.swing.JButton();
        btnTriangle = new javax.swing.JButton();
        btnBasic = new javax.swing.JButton();
        Label = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnCircle.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        btnCircle.setText("Circle");
        btnCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircleActionPerformed(evt);
            }
        });

        btnSquare.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        btnSquare.setText("Square");
        btnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareActionPerformed(evt);
            }
        });

        comboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "white", "pink", "red", "yellow", "green", "black" }));
        comboColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboColorActionPerformed(evt);
            }
        });

        btnRectangle.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        btnRectangle.setText("Rectangle");
        btnRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectangleActionPerformed(evt);
            }
        });

        btnTriangle.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        btnTriangle.setText("Triangle");
        btnTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriangleActionPerformed(evt);
            }
        });

        btnBasic.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBasicActionPerformed(evt);
            }
        });

        Label.setAlignmentX(10.0F);
        Label.setAlignmentY(70.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCircle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSquare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBasic, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBasic, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCircle)
                    .addComponent(btnSquare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRectangle)
                    .addComponent(btnTriangle))
                .addGap(18, 18, 18)
                .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircleActionPerformed

        btnBasic.setBorderPainted(false); 
	btnBasic.setContentAreaFilled(false); 
	btnBasic.setOpaque(false);
        btnBasic.setIcon(new ImageIcon(AllShapes.getCircle()));
        btnBasic.repaint();
        Label.setIcon(new ImageIcon(AllShapes.getCircleB()));
        Label.setBounds(90, 82, 100, 100);
        Label.repaint();
    }//GEN-LAST:event_btnCircleActionPerformed

    private void btnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareActionPerformed
        btnBasic.setBorderPainted(false); 
	btnBasic.setContentAreaFilled(false); 
	btnBasic.setOpaque(false);
        btnBasic.setIcon(new ImageIcon(shapecol.getSquare()));
        Label.setIcon(new ImageIcon(shapecol.getSquareB()));
        Label.setBounds(90, 82, 100, 100);
        Label.repaint();
    }//GEN-LAST:event_btnSquareActionPerformed

    private void comboColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboColorActionPerformed
        Color shapeColor = AllShapes.stringToColor(comboColor.getSelectedItem().toString());
        shapecol.setCColor(shapeColor);
    }//GEN-LAST:event_comboColorActionPerformed

    private void btnRectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectangleActionPerformed
        btnBasic.setBorderPainted(false); 
	btnBasic.setContentAreaFilled(false); 
	btnBasic.setOpaque(false);
        btnBasic.setIcon(new ImageIcon(shapecol.getRectangle()));
        Label.setIcon(new ImageIcon(shapecol.getRectangleB()));
        Label.setBounds(90, 82, 100, 100);
        Label.repaint();
    }//GEN-LAST:event_btnRectangleActionPerformed

    private void btnTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriangleActionPerformed
        btnBasic.setBorderPainted(false); 
	btnBasic.setContentAreaFilled(false); 
	btnBasic.setOpaque(false);
        btnBasic.setIcon(new ImageIcon(shapecol.getTriangle()));
        Label.setIcon(new ImageIcon(shapecol.getTriangleB()));
        Label.setBounds(80, 65, 200, 200);
        Label.repaint();
    }//GEN-LAST:event_btnTriangleActionPerformed

    private void btnBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBasicActionPerformed
        System.out.println("Jestem wciśnięty.");
    }//GEN-LAST:event_btnBasicActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppTest().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JButton btnBasic;
    private javax.swing.JButton btnCircle;
    private javax.swing.JButton btnRectangle;
    private javax.swing.JButton btnSquare;
    private javax.swing.JButton btnTriangle;
    private javax.swing.JComboBox<String> comboColor;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
