/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snwijesuriya
 */
public class Supplier extends javax.swing.JFrame {

    /**
     * Creates new form Supplier
     */
    public Supplier() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(642, 412));

        jPanel1.setMaximumSize(new java.awt.Dimension(642, 412));
        jPanel1.setMinimumSize(new java.awt.Dimension(642, 412));
        jPanel1.setLayout(null);

        jLabel1.setText("Supplier ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 40, 52, 14);

        jLabel2.setText(" Title");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 70, 23, 14);

        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 100, 27, 14);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 99, 0, 0);

        jLabel5.setText("NIC");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 130, 18, 14);

        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 190, 40, 14);

        jLabel7.setText("Telephone Number");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 220, 90, 14);

        jLabel8.setText("Maobile Number");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 250, 80, 14);

        jLabel9.setText("Email");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 280, 24, 14);

        jLabel10.setText("Join Date");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 310, 45, 14);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 70, 226, 20);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 40, 226, 20);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 100, 226, 20);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(170, 130, 226, 20);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(170, 160, 226, 20);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(170, 190, 226, 20);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(170, 250, 226, 20);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(170, 220, 226, 20);

        jLabel11.setText("Address");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 160, 39, 14);

        jButton1.setText("Close");
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 340, 73, 23);

        jButton2.setText("Submit");
        jPanel1.add(jButton2);
        jButton2.setBounds(140, 340, 73, 23);

        jButton3.setText("Clear");
        jPanel1.add(jButton3);
        jButton3.setBounds(240, 340, 73, 23);

        jLabel12.setText("Supplier");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(250, 10, 38, 14);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(170, 310, 250, 20);
        jPanel1.add(jTextField11);
        jTextField11.setBounds(170, 280, 226, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
