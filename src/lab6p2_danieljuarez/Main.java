/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_danieljuarez;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {

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

        AdminPane = new javax.swing.JDialog();
        AdminTabbedPane = new javax.swing.JTabbedPane();
        ItemsTab = new javax.swing.JPanel();
        ItemsScrollPane = new javax.swing.JScrollPane();
        TableItems = new javax.swing.JTable();
        NombreItem = new javax.swing.JLabel();
        tf_NombreItem = new javax.swing.JTextField();
        PrecioItem = new javax.swing.JLabel();
        tf_PrecioItem = new javax.swing.JTextField();
        TipoItem = new javax.swing.JLabel();
        cb_TipoItem = new javax.swing.JComboBox<>();
        GuardarItemButton = new javax.swing.JButton();
        CasaTab = new javax.swing.JPanel();
        PufflesTab = new javax.swing.JPanel();
        JuegosTab = new javax.swing.JPanel();
        PantallaAdmin = new javax.swing.JLabel();
        ClubPenguin = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        Contraseña = new javax.swing.JLabel();
        tf_Contraseña = new javax.swing.JTextField();
        EntrarButton = new javax.swing.JButton();

        TableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ItemsScrollPane.setViewportView(TableItems);
        if (TableItems.getColumnModel().getColumnCount() > 0) {
            TableItems.getColumnModel().getColumn(0).setResizable(false);
            TableItems.getColumnModel().getColumn(1).setResizable(false);
            TableItems.getColumnModel().getColumn(2).setResizable(false);
        }

        NombreItem.setText("Nombre");

        tf_NombreItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NombreItemActionPerformed(evt);
            }
        });

        PrecioItem.setText("Precio");

        TipoItem.setText("Tipo");

        cb_TipoItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sombreros", "Gafas", "Bufanda", "Chaqueta", "Pantalon", "Zapatos" }));
        cb_TipoItem.setSelectedIndex(-1);

        GuardarItemButton.setText("Guardar");
        GuardarItemButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarItemButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ItemsTabLayout = new javax.swing.GroupLayout(ItemsTab);
        ItemsTab.setLayout(ItemsTabLayout);
        ItemsTabLayout.setHorizontalGroup(
            ItemsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItemsTabLayout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addGroup(ItemsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TipoItem)
                    .addComponent(PrecioItem)
                    .addComponent(tf_PrecioItem, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(NombreItem)
                    .addComponent(tf_NombreItem)
                    .addComponent(cb_TipoItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GuardarItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117))
            .addGroup(ItemsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItemsTabLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ItemsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(260, 260, 260)))
        );
        ItemsTabLayout.setVerticalGroup(
            ItemsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsTabLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(NombreItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_NombreItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrecioItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_PrecioItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TipoItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_TipoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(GuardarItemButton)
                .addContainerGap())
            .addGroup(ItemsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItemsTabLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(ItemsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        AdminTabbedPane.addTab("Items", ItemsTab);

        javax.swing.GroupLayout CasaTabLayout = new javax.swing.GroupLayout(CasaTab);
        CasaTab.setLayout(CasaTabLayout);
        CasaTabLayout.setHorizontalGroup(
            CasaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        CasaTabLayout.setVerticalGroup(
            CasaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        AdminTabbedPane.addTab("Casa", CasaTab);

        javax.swing.GroupLayout PufflesTabLayout = new javax.swing.GroupLayout(PufflesTab);
        PufflesTab.setLayout(PufflesTabLayout);
        PufflesTabLayout.setHorizontalGroup(
            PufflesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        PufflesTabLayout.setVerticalGroup(
            PufflesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        AdminTabbedPane.addTab("Puffles", PufflesTab);

        javax.swing.GroupLayout JuegosTabLayout = new javax.swing.GroupLayout(JuegosTab);
        JuegosTab.setLayout(JuegosTabLayout);
        JuegosTabLayout.setHorizontalGroup(
            JuegosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        JuegosTabLayout.setVerticalGroup(
            JuegosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        AdminTabbedPane.addTab("Juegos", JuegosTab);

        PantallaAdmin.setText("Pantalla de Administracion");

        javax.swing.GroupLayout AdminPaneLayout = new javax.swing.GroupLayout(AdminPane.getContentPane());
        AdminPane.getContentPane().setLayout(AdminPaneLayout);
        AdminPaneLayout.setHorizontalGroup(
            AdminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PantallaAdmin)
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(AdminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPaneLayout.createSequentialGroup()
                    .addContainerGap(11, Short.MAX_VALUE)
                    .addComponent(AdminTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        AdminPaneLayout.setVerticalGroup(
            AdminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PantallaAdmin)
                .addContainerGap(275, Short.MAX_VALUE))
            .addGroup(AdminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPaneLayout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(AdminTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ClubPenguin.setText("Club Penguin");

        Nombre.setText("Nombre");

        Contraseña.setText("Contraseña");

        EntrarButton.setText("Entrar");
        EntrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ClubPenguin)
                    .addComponent(Nombre)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contraseña)
                    .addComponent(tf_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntrarButton))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ClubPenguin)
                .addGap(38, 38, 38)
                .addComponent(Nombre)
                .addGap(11, 11, 11)
                .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(EntrarButton)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarButtonMouseClicked
        if (tf_Nombre.getText().equals(useradmin) && tf_Contraseña.getText().equals(passwordadmin)) {
            JOptionPane.showMessageDialog(this, "LogIn", "Bienvenido Admin", JOptionPane.PLAIN_MESSAGE);
            tf_Nombre.setText("");
            tf_Contraseña.setText("");
            AdminPane.setModal(true);
            AdminPane.pack();
            AdminPane.setLocationRelativeTo(this);
            AdminPane.setVisible(true);
        }
    }//GEN-LAST:event_EntrarButtonMouseClicked

    private void tf_NombreItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NombreItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NombreItemActionPerformed

    private void GuardarItemButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarItemButtonMouseClicked
        String NombreItem = tf_NombreItem.getText();
        String PrecioItem = tf_PrecioItem.getText();
        String TipoItem = cb_TipoItem.getSelectedItem().toString();
        Item i = new Item();
    }//GEN-LAST:event_GuardarItemButtonMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AdminPane;
    private javax.swing.JTabbedPane AdminTabbedPane;
    private javax.swing.JPanel CasaTab;
    private javax.swing.JLabel ClubPenguin;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JButton EntrarButton;
    private javax.swing.JButton GuardarItemButton;
    private javax.swing.JScrollPane ItemsScrollPane;
    private javax.swing.JPanel ItemsTab;
    private javax.swing.JPanel JuegosTab;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NombreItem;
    private javax.swing.JLabel PantallaAdmin;
    private javax.swing.JLabel PrecioItem;
    private javax.swing.JPanel PufflesTab;
    private javax.swing.JTable TableItems;
    private javax.swing.JLabel TipoItem;
    private javax.swing.JComboBox<String> cb_TipoItem;
    private javax.swing.JTextField tf_Contraseña;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_NombreItem;
    private javax.swing.JTextField tf_PrecioItem;
    // End of variables declaration//GEN-END:variables
    ArrayList<Pinguino> Users;
    String useradmin = "p", passwordadmin = "p";

}
