
import java.awt.Color;
import java.awt.Label;
import javax.swing.ImageIcon;

        

public class AppTest extends javax.swing.JFrame {
    
    AllShapes shapecol = new AllShapes();

    public AppTest() {
        initComponents();
        Label.setBounds(70, 80, 100, 100);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBasic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCircle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRectangle, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSquare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTriangle, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBasic, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCircle)
                    .addComponent(btnSquare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRectangle)
                    .addComponent(btnTriangle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
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
        Label.setBounds(70, 80, 100, 100);
        //Label.repaint();
    }//GEN-LAST:event_btnCircleActionPerformed

    private void btnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareActionPerformed
        btnBasic.setBorderPainted(false); 
	btnBasic.setContentAreaFilled(false); 
	btnBasic.setOpaque(false);
        btnBasic.setIcon(new ImageIcon(shapecol.getSquare()));
        Label.setIcon(new ImageIcon(shapecol.getCircleB()));
        Label.setBounds(50, 10, 100, 100);
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
        Label.setIcon(new ImageIcon(shapecol.getCircleB()));
        Label.setBounds(50, 10, 100, 100);
        Label.repaint();
    }//GEN-LAST:event_btnRectangleActionPerformed

    private void btnTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriangleActionPerformed
        btnBasic.setBorderPainted(false); 
	btnBasic.setContentAreaFilled(false); 
	btnBasic.setOpaque(false);
        btnBasic.setIcon(new ImageIcon(shapecol.getTriangle()));
        Label.setIcon(new ImageIcon(shapecol.getTriangleB()));
        Label.setBounds(50, 10, 100, 100);
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
