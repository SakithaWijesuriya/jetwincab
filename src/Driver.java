/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snwijesuriya
 */
public class Driver extends javax.swing.JFrame {

    /**
     * Creates new form jDriver
     */
    public Driver() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(657, 400));
        setMinimumSize(new java.awt.Dimension(657, 400));
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel2.setMaximumSize(new java.awt.Dimension(660, 373));
        jPanel2.setMinimumSize(new java.awt.Dimension(660, 373));
        jPanel2.setLayout(null);

        jLabel1.setText("Driver Name");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(77, 107, 59, 14);

        jLabel2.setText("Driver ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(77, 84, 43, 14);

        jLabel3.setText("Driver");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(271, 18, 29, 14);

        jLabel4.setText("Driver Nic");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(77, 133, 46, 14);

        jLabel5.setText("Address");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(77, 159, 39, 22);

        jLabel6.setText("Gender");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(77, 195, 35, 14);

        jLabel7.setText("Telephone Number");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(77, 230, 90, 14);

        jLabel8.setText("Mobile Number");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(77, 268, 70, 14);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(177, 81, 284, 20);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(177, 192, 284, 20);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(177, 133, 284, 20);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(177, 227, 284, 20);
        jPanel2.add(jTextField5);
        jTextField5.setBounds(177, 107, 284, 20);
        jPanel2.add(jTextField6);
        jTextField6.setBounds(177, 160, 284, 20);
        jPanel2.add(jTextField7);
        jTextField7.setBounds(177, 50, 284, 20);
        jPanel2.add(jTextField8);
        jTextField8.setBounds(177, 265, 284, 20);

        jLabel9.setText("Driver Join Date");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(77, 299, 77, 14);

        jLabel10.setText("Driver Status");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(77, 53, 63, 14);

        jButton1.setText("Submit");
        jPanel2.add(jButton1);
        jButton1.setBounds(177, 349, 65, 23);

        jButton2.setText("Clear");
        jPanel2.add(jButton2);
        jButton2.setBounds(272, 349, 71, 23);

        jButton3.setText("Close");
        jPanel2.add(jButton3);
        jButton3.setBounds(370, 349, 69, 23);
        jPanel2.add(jDateChooser1);
        jDateChooser1.setBounds(180, 300, 290, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-3, 0, 660, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
