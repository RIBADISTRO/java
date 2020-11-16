
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class vista extends javax.swing.JFrame {
   
Thread tiempo1 = new Thread(){
public void run(){

    
try { 
    int seg;
    for(seg=100;seg<=100;seg++){
    verde.setValue(seg=100);tiempo1.sleep(3000);
    verde.setValue(seg=0);tiempo1.sleep(100);
    ambar.setValue(seg=100);tiempo1.sleep(500);
   ambar.setValue(seg=0);tiempo1.sleep(100);
   rojo.setValue(seg=100);tiempo1.sleep(3000);
   rojo.setValue(seg=0);
   tiempo1.sleep(100);
  
   ambar.setValue(seg=0);tiempo1.sleep(100);
    }
    
}catch(Exception e){
}
}
};
Thread tiempo2 = new Thread(){
public void run(){

    
try { 
    int seg;
    for(seg=100;seg<=100;seg++){
    rojo2.setValue(seg=100);tiempo2.sleep(3000);
    rojo2.setValue(seg=0);tiempo2.sleep(100);
    
   ambar2.setValue(seg=0);tiempo2.sleep(100);
   verde2.setValue(seg=100);tiempo2.sleep(3000);
   verde2.setValue(seg=0);
   tiempo2.sleep(100);
  ambar2.setValue(seg=100);tiempo2.sleep(500);
   ambar2.setValue(seg=0);tiempo2.sleep(100);
    }
    
}catch(Exception e){
}
}
};
   

    
   
    public vista() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        verde = new javax.swing.JProgressBar();
        ambar = new javax.swing.JProgressBar();
        rojo = new javax.swing.JProgressBar();
        verde2 = new javax.swing.JProgressBar();
        ambar2 = new javax.swing.JProgressBar();
        rojo2 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        verde.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 80, 94, 32));

        ambar.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(ambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 130, 94, 38));

        rojo.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 192, 94, 35));

        verde2.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(verde2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 69, 32));

        ambar2.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(ambar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 69, 30));

        rojo2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(rojo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 69, 35));

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 20, 20));

        jLabel1.setFont(new java.awt.Font("IncisedBlackWide", 2, 36)); // NOI18N
        jLabel1.setText("Semaforo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setForeground(new java.awt.Color(153, 255, 51));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
      tiempo1.start();
      tiempo2.start();
  
  
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(calcu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            // Logger.getLogger(calcu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            // Logger.getLogger(calcu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            // Logger.getLogger(calcu.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ambar;
    private javax.swing.JProgressBar ambar2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar rojo;
    private javax.swing.JProgressBar rojo2;
    private javax.swing.JProgressBar verde;
    private javax.swing.JProgressBar verde2;
    // End of variables declaration//GEN-END:variables
}
