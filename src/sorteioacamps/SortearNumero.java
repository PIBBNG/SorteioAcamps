/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteioacamps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Lucas
 */
public class SortearNumero extends javax.swing.JFrame {

    FazSorteio sortear = new FazSorteio();
    Timer t;
    int timer_flag = 11;
    
    public SortearNumero() {
        initComponents();
            t = new javax.swing.Timer(300, (ActionEvent e) -> {
                if(timer_flag < 5){
                    numero_sorteado.setText("???");
                    if (numero_sorteado.isVisible() == true) {
                        timer_flag++;
                        numero_sorteado.setVisible(false);
                    }else{
                        numero_sorteado.setVisible(true);
                    }
                } else {
                    numero_sorteado.setVisible(true);      
                    t.stop();
                    int num_max = 0;
                    int num_min = 0;
                    timer_flag = 11;
                    
                    try{
                        
                        num_max = Integer.parseInt(numero_maximo.getText());
                        num_min = Integer.parseInt(numero_minimo.getText());
                        
                    } catch(NumberFormatException ex) {
                        
                        erro_inteiro.setText("Os campos devem conter somente números inteiros!");
                    
                    }
                    
                    if(num_min <= num_max){
                        int num_sorteado = sortear.sorteio_numero(num_min, num_max);
                        
                        if(num_sorteado < 10){
                            
                            numero_sorteado.setText("00" + Integer.toString(num_sorteado));
                            
                        } else if(num_sorteado >= 10 && num_sorteado <= 99){
                            
                            numero_sorteado.setText("0"+ Integer.toString(num_sorteado));
                            
                        } else {
                            
                            numero_sorteado.setText(Integer.toString(num_sorteado));
                            
                        }
                        
                    } else {
                        
                        erro_inteiro.setText("Os inteiros devem ser inseridos em forma crescente!");
                        
                    }
              
                }
        });             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero_minimo = new javax.swing.JTextField();
        numero_maximo = new javax.swing.JTextField();
        fazer_sorteio = new javax.swing.JButton();
        numero_sorteado = new javax.swing.JLabel();
        voltar_inicio = new javax.swing.JButton();
        limpar_sorteio = new javax.swing.JButton();
        erro_inteiro = new javax.swing.JLabel();
        sortear_entre = new javax.swing.JLabel();
        entre_e_x = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sortear um Número");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numero_minimo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        numero_minimo.setForeground(new java.awt.Color(0, 133, 178));
        numero_minimo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_minimo.setText("0");
        numero_minimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_minimoActionPerformed(evt);
            }
        });
        getContentPane().add(numero_minimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 60, 30));

        numero_maximo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        numero_maximo.setForeground(new java.awt.Color(0, 133, 178));
        numero_maximo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_maximo.setText("0");
        numero_maximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_maximoActionPerformed(evt);
            }
        });
        getContentPane().add(numero_maximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 60, 30));

        fazer_sorteio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/sortear_v2.jpg"))); // NOI18N
        fazer_sorteio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fazer_sorteio.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/sortear_v.jpg"))); // NOI18N
        fazer_sorteio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazer_sorteioActionPerformed(evt);
            }
        });
        getContentPane().add(fazer_sorteio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 100, 30));

        numero_sorteado.setFont(new java.awt.Font("Showcard Gothic", 1, 160)); // NOI18N
        numero_sorteado.setForeground(new java.awt.Color(0, 133, 178));
        numero_sorteado.setText("???");
        getContentPane().add(numero_sorteado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        voltar_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/voltar_v.jpg"))); // NOI18N
        voltar_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_inicioActionPerformed(evt);
            }
        });
        getContentPane().add(voltar_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 90, 20));

        limpar_sorteio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/limpar_v.jpg"))); // NOI18N
        limpar_sorteio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpar_sorteio.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/limpar_v2.jpg"))); // NOI18N
        limpar_sorteio.setEnabled(false);
        limpar_sorteio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_sorteioActionPerformed(evt);
            }
        });
        getContentPane().add(limpar_sorteio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 100, 30));

        erro_inteiro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        erro_inteiro.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(erro_inteiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 380, 40));

        sortear_entre.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        sortear_entre.setForeground(new java.awt.Color(0, 133, 178));
        sortear_entre.setText("Sortear entre");
        getContentPane().add(sortear_entre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        entre_e_x.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        entre_e_x.setForeground(new java.awt.Color(0, 133, 178));
        entre_e_x.setText("e");
        getContentPane().add(entre_e_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        Numero.setFont(new java.awt.Font("Arial Black", 0, 56)); // NOI18N
        Numero.setForeground(new java.awt.Color(0, 133, 178));
        Numero.setText("Número:");
        getContentPane().add(Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/1.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero_minimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_minimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_minimoActionPerformed

    private void numero_maximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_maximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_maximoActionPerformed

    private void voltar_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_inicioActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_voltar_inicioActionPerformed

    private void limpar_sorteioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_sorteioActionPerformed

        numero_sorteado.setText("???");
        erro_inteiro.setText("");
        fazer_sorteio.setEnabled(true);
        limpar_sorteio.setEnabled(false);
    }//GEN-LAST:event_limpar_sorteioActionPerformed

    private void fazer_sorteioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazer_sorteioActionPerformed
        timer_flag = 0;
        t.start();
        limpar_sorteio.setEnabled(true);
        fazer_sorteio.setEnabled(false);

    }//GEN-LAST:event_fazer_sorteioActionPerformed

    
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
            java.util.logging.Logger.getLogger(SortearNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortearNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortearNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortearNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortearNumero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel background;
    private javax.swing.JLabel entre_e_x;
    private javax.swing.JLabel erro_inteiro;
    private javax.swing.JButton fazer_sorteio;
    private javax.swing.JButton limpar_sorteio;
    private javax.swing.JTextField numero_maximo;
    private javax.swing.JTextField numero_minimo;
    private javax.swing.JLabel numero_sorteado;
    private javax.swing.JLabel sortear_entre;
    private javax.swing.JButton voltar_inicio;
    // End of variables declaration//GEN-END:variables
}
