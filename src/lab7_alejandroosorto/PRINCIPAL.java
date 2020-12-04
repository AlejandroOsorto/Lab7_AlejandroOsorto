package lab7_alejandroosorto;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class PRINCIPAL extends javax.swing.JFrame
{

    
    
    ArrayList ListaUsuarios = new ArrayList();
    
    //SuperUsuario
    String nombreSU = "Carlos";
    String apellidoSU = "Vallejo";
    String usuarioSU = "ca.vallejo";
    String contraSU = "compi123";
    //------------
    
    public PRINCIPAL()
    {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        JD_Registrar = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CT_Nombre_REG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CT_Apellido_REG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CT_NombreUsuario_REG = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BTN_Registrar_REG = new javax.swing.JButton();
        BTN_Cancelar_REG = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CT_Contra_REG = new javax.swing.JPasswordField();
        JD_SU_Ventana = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        CB_Alumnos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CT_NombreUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BTN_InicSes = new javax.swing.JButton();
        BTN_Registrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CT_Contra = new javax.swing.JPasswordField();

        JD_Registrar.setTitle("Registrar Usuario");

        jPanel2.setBackground(new java.awt.Color(181, 209, 228));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre de Usuario:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contraseña: ");

        BTN_Registrar_REG.setText("Registrarse");
        BTN_Registrar_REG.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_Registrar_REGMouseClicked(evt);
            }
        });

        BTN_Cancelar_REG.setText("Cancelar");
        BTN_Cancelar_REG.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_Cancelar_REGMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("REGISTRAR NUEVO USUARIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BTN_Cancelar_REG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Registrar_REG))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CT_Nombre_REG, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(CT_Apellido_REG)
                            .addComponent(CT_NombreUsuario_REG)
                            .addComponent(CT_Contra_REG))))
                .addGap(117, 117, 117))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CT_Nombre_REG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CT_Apellido_REG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CT_NombreUsuario_REG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CT_Contra_REG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Registrar_REG)
                    .addComponent(BTN_Cancelar_REG))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout JD_RegistrarLayout = new javax.swing.GroupLayout(JD_Registrar.getContentPane());
        JD_Registrar.getContentPane().setLayout(JD_RegistrarLayout);
        JD_RegistrarLayout.setHorizontalGroup(
            JD_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JD_RegistrarLayout.setVerticalGroup(
            JD_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JD_SU_Ventana.addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowActivated(java.awt.event.WindowEvent evt)
            {
                JD_SU_VentanaWindowActivated(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(105, 125, 138));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Variable", "Tipo"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lista Alumnos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CB_Alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_Alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JD_SU_VentanaLayout = new javax.swing.GroupLayout(JD_SU_Ventana.getContentPane());
        JD_SU_Ventana.getContentPane().setLayout(JD_SU_VentanaLayout);
        JD_SU_VentanaLayout.setHorizontalGroup(
            JD_SU_VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JD_SU_VentanaLayout.setVerticalGroup(
            JD_SU_VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");

        jPanel1.setBackground(new java.awt.Color(165, 179, 189));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre de Usuario:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña:");

        BTN_InicSes.setText("Iniciar Sesión");
        BTN_InicSes.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_InicSesMouseClicked(evt);
            }
        });

        BTN_Registrar.setText("Registrarse");
        BTN_Registrar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_RegistrarMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("INICIAR SESIÓN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CT_NombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(CT_Contra)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BTN_Registrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTN_InicSes))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel8)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CT_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CT_Contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_InicSes)
                    .addComponent(BTN_Registrar))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_RegistrarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_RegistrarMouseClicked
    {//GEN-HEADEREND:event_BTN_RegistrarMouseClicked
        // TODO add your handling code here:
        JD_Registrar.setModal(true);
        JD_Registrar.pack();
        JD_Registrar.setLocationRelativeTo(this);
        JD_Registrar.setVisible(true);
        
    }//GEN-LAST:event_BTN_RegistrarMouseClicked

    private void BTN_Registrar_REGMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_Registrar_REGMouseClicked
    {//GEN-HEADEREND:event_BTN_Registrar_REGMouseClicked
        // TODO add your handling code here:
        if (CT_Nombre_REG.getText().isBlank() || CT_Apellido_REG.getText().isBlank() || CT_NombreUsuario_REG.getText().isBlank() || CT_Contra_REG.getText().isBlank())
        {
            JOptionPane.showMessageDialog(JD_Registrar, "Uno o mas campos están vacíos.");
        }
        else
        {
            String nuevoNombre = CT_Nombre_REG.getText();
            String nuevoApellido = CT_Apellido_REG.getText();
            String nuevoUsuario = CT_NombreUsuario_REG.getText();
            String nuevaContraseña = CT_Contra_REG.getText();

            Usuario User = new Usuario(nuevoNombre, nuevoApellido, nuevoUsuario, nuevaContraseña);

            AdminUsuario AU = new AdminUsuario("./Users.aos");
            AU.CargarArchivo();
            AU.setUsuario(User);
            AU.ModificarArchivo();

            JOptionPane.showMessageDialog(this, "Usuario creado exitosamente.");

            CT_Nombre_REG.setText("");
            CT_Apellido_REG.setText("");
            CT_NombreUsuario_REG.setText("");
            CT_Contra_REG.setText("");
            JD_Registrar.dispose();

        }
        
    }//GEN-LAST:event_BTN_Registrar_REGMouseClicked

    private void BTN_Cancelar_REGMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_Cancelar_REGMouseClicked
    {//GEN-HEADEREND:event_BTN_Cancelar_REGMouseClicked
        // TODO add your handling code here:
        JD_Registrar.dispose();
        
    }//GEN-LAST:event_BTN_Cancelar_REGMouseClicked

    private void BTN_InicSesMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_InicSesMouseClicked
    {//GEN-HEADEREND:event_BTN_InicSesMouseClicked
        // TODO add your handling code here:
        boolean nCheck = false, cCheck = false;
        
        AdminUsuario AU = new AdminUsuario("./Users.aos");
        AU.CargarArchivo();
        ListaUsuarios = AU.getListaUsuarios();
        
        for (int i = 0; i < ListaUsuarios.size(); i++)        
        {
            if (CT_NombreUsuario.getText().equals(((Usuario)ListaUsuarios.get(i)).getUsuario()) && CT_Contra.getText().equals(((Usuario)ListaUsuarios.get(i)).getContraseña()))
            {
                nCheck = true;
                cCheck = true;
            }
        }
        
        
        if (CT_NombreUsuario.getText().equals(usuarioSU) && CT_Contra.getText().equals(contraSU))
        {
            CT_NombreUsuario.setText("");
            CT_Contra.setText("");
                        
            JOptionPane.showMessageDialog(this, "Ha iniciado sesión como el ingeniero, bienvenido.");
            
            JD_SU_Ventana.setModal(true);
            JD_SU_Ventana.pack();
            JD_SU_Ventana.setLocationRelativeTo(this);
            JD_SU_Ventana.setVisible(true);
        }
        else
        {
            if (nCheck == true && cCheck == true)
            {
                CT_NombreUsuario.setText("");
                CT_Contra.setText("");

                JOptionPane.showMessageDialog(this, "Ha iniciado sesión, bienvenido.");
            } 
            else
            {
                JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrectos");
            }
        }
        
    }//GEN-LAST:event_BTN_InicSesMouseClicked

    private void JD_SU_VentanaWindowActivated(java.awt.event.WindowEvent evt)//GEN-FIRST:event_JD_SU_VentanaWindowActivated
    {//GEN-HEADEREND:event_JD_SU_VentanaWindowActivated
        // TODO add your handling code here:
        AdminUsuario AU = new AdminUsuario("./Users.aos");
        
        AU.CargarArchivo();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(AU.getListaUsuarios().toArray());
        CB_Alumnos.setModel(modelo);
    }//GEN-LAST:event_JD_SU_VentanaWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Cancelar_REG;
    private javax.swing.JButton BTN_InicSes;
    private javax.swing.JButton BTN_Registrar;
    private javax.swing.JButton BTN_Registrar_REG;
    private javax.swing.JComboBox<String> CB_Alumnos;
    private javax.swing.JTextField CT_Apellido_REG;
    private javax.swing.JPasswordField CT_Contra;
    private javax.swing.JPasswordField CT_Contra_REG;
    private javax.swing.JTextField CT_NombreUsuario;
    private javax.swing.JTextField CT_NombreUsuario_REG;
    private javax.swing.JTextField CT_Nombre_REG;
    private javax.swing.JDialog JD_Registrar;
    private javax.swing.JDialog JD_SU_Ventana;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
