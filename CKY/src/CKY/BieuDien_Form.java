/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CKY;

import static CKY.Grammar.TachCuPhap;
import static CKY.Grammar.arr_Cky;
import static CKY.Grammar.arr_Tu;
import static CKY.Grammar.getNonTerLeft;
import static CKY.Grammar.getTerLeft;
import java.awt.Button;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

/**
 *
 * @author leeco
 */
public class BieuDien_Form extends javax.swing.JFrame {

    private int pnlCkyHeight = 0;
    private int pnlCkyWidth = 0;
    private int pnlHeadHeight = 0;
    private int pnlHeadWidth = 0;
    private int pnlLeftHeight = 0;
    private int pnlLeftWidth = 0;
    private int pnlRightHeight=0;
    private int   pnlRightWidth=0;
    private String cau;
    private String dsCuPhap;

    /**
     * Creates new form BieuDien_Form
     */
    public BieuDien_Form() {
        initComponents();

    }

    public BieuDien_Form(String cau, String dsCuPhap) {
        this.cau = cau;
        this.dsCuPhap = dsCuPhap;
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        pnlCkyHeight = pnlCky.getHeight();
        pnlCkyWidth = pnlCky.getWidth();

        pnlHeadHeight = pnlHeader.getHeight();
        pnlHeadWidth = pnlHeader.getWidth();

        pnlLeftHeight = pnlLeft.getHeight();
        pnlLeftWidth = pnlLeft.getWidth();
        pnlRightHeight = pnlRight.getHeight();
        pnlRightWidth = pnlRight.getWidth();
//        Load();
//        CKY(this.cau, this.dsCuPhap);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpnl = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        pnlLeft = new javax.swing.JPanel();
        pnlCky = new javax.swing.JPanel();
        pnlRight = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHeader.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        pnlLeft.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        pnlCky.setBackground(new java.awt.Color(204, 255, 204));
        pnlCky.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                pnlCkyComponentResized(evt);
            }
        });

        javax.swing.GroupLayout pnlCkyLayout = new javax.swing.GroupLayout(pnlCky);
        pnlCky.setLayout(pnlCkyLayout);
        pnlCkyLayout.setHorizontalGroup(
            pnlCkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlCkyLayout.setVerticalGroup(
            pnlCkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlRight.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JpnlLayout = new javax.swing.GroupLayout(Jpnl);
        Jpnl.setLayout(JpnlLayout);
        JpnlLayout.setHorizontalGroup(
            JpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnlLayout.createSequentialGroup()
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCky, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        JpnlLayout.setVerticalGroup(
            JpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(JpnlLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCky, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlCkyComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlCkyComponentResized
        pnlCkyHeight = pnlCky.getHeight();
        pnlCkyWidth = pnlCky.getWidth();
        pnlHeadHeight = pnlHeader.getHeight();
        pnlHeadWidth = pnlHeader.getWidth();

        pnlLeftHeight = pnlLeft.getHeight();
        pnlLeftWidth = pnlLeft.getWidth();
        pnlRightHeight = pnlRight.getHeight();
        pnlRightWidth = pnlRight.getWidth();
         Load();
        CKY(this.cau, this.dsCuPhap);
    }//GEN-LAST:event_pnlCkyComponentResized

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
            java.util.logging.Logger.getLogger(BieuDien_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BieuDien_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BieuDien_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BieuDien_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BieuDien_Form().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpnl;
    private javax.swing.JPanel pnlCky;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    // End of variables declaration//GEN-END:variables

    private void Load() {
        int soLuongTu = Grammar.arr_Tu(cau).length;
        String[] text = Grammar.arr_Tu(cau);
        DrawHeader(pnlHeader, pnlHeadWidth, pnlHeadHeight, soLuongTu, text);
        DrawLeft(pnlLeft, pnlLeftWidth, pnlLeftHeight, soLuongTu, text);
        DrawTop(pnlRight, pnlRightWidth, pnlRightHeight, soLuongTu, text);
        //DrawPanel(pnlCky,pnlCkyWidth, pnlCkyHeight, soLuongTu);
    }

    public void DrawPanel(JPanel jp, int w, int h, int soLuongTu) {
        int wi = w / soLuongTu;
        int he = h / soLuongTu;
        for (int i = 0; i < soLuongTu; i++) {
            for (int j = 0; j < soLuongTu; j++) {
                Point p = new Point(i * wi, j * he);
                DrawButton(jp, p, wi, he, Color.YELLOW, "");
            }
        }
    }

    public void DrawHeader(JPanel jp, int w, int h, int soLuongTu, String[] text) {
        for (int i = 0; i < soLuongTu; i++) {
            int wi = w / soLuongTu;
            Point p = new Point(i * wi, 0);
            DrawButton(jp, p, wi, h, Color.BLUE,text[i]);
        }
    }

    public void DrawTop(JPanel jp, int w, int h, int soLuongTu, String[] text){
        for (int i = 0; i < soLuongTu; i++) {
            int wi = w / soLuongTu;
            Point p = new Point(i * wi, 0);
            int k=i+1;
            DrawButton(jp, p, wi, h, Color.BLUE,k+"");
        }
    }
    public void DrawLeft(JPanel jp, int w, int h, int soLuongTu, String[] text) {
        for (int i = 0; i < soLuongTu; i++) {
            int he = h / soLuongTu;
            Point p = new Point(0, i * he);
            DrawButton(jp, p, w, he, Color.BLUE, i + "");
        }
    }

    public void DrawButton(JPanel jp, Point p, int w, int h, Color c, String text) {
        JButton btn = new JButton();
        btn.setBackground(c);
        btn.setSize(w, h);
        btn.setLocation(p);
        btn.setText(text);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(Jpnl,text,"Chi tiết",JOptionPane.PLAIN_MESSAGE);
            }
        });
        jp.add(btn);
    }

    public void CKY(String cau, String dsCuPhap) {
        String[] dsTu = arr_Tu(cau);
        int soLuongTu = dsTu.length;
        
        ArrayList<String>[][] ketHop=arr_Cky(soLuongTu);
        
        ArrayList<String>[][] cky = arr_Cky(soLuongTu);
        TreeMap<Integer, ArrayList<String>> grammar = TachCuPhap(dsCuPhap);

        for (int i = 0; i < soLuongTu; i++) {
            String tu = dsTu[i];
            ArrayList<String> left = getTerLeft(tu, grammar);
            for(int lt=0;lt<left.size();lt++){
                cky[i][i].add(left.get(lt));
                ketHop[i][i].add("");
            }
            for (int j = i - 1; j >= 0; j--) {
                for (int k = j; k < i; k++) {
                    for(int s1=0;s1<cky[k][j].size();s1++){
                       for(int s2=0;s2<cky[i][k+1].size();s2++ ){
                           if(!cky[k][j].get(s1).equals("")&& !cky[i][k+1].get(s2).equals("")){
                               ArrayList<String> ntl=getNonTerLeft(cky[k][j].get(s1),cky[i][k + 1].get(s2),grammar);
                               for(int ntlItem =0;ntlItem<ntl.size();ntlItem++){
                                   cky[i][j].add(ntl.get(ntlItem));
                                   int x1=j;
                                   int y1=k+1;
                                   int x2=k+1;
                                   int y2=i+1;
                                   ketHop[i][j].add("[("+x1+","+y1+")+("+x2+","+y2+")]");
                               }
                           }
                       }
                    }
                }
            }
        }
        for (int i = 0; i < soLuongTu; i++) {
            for (int j = 0; j < soLuongTu; j++) {
                String text="";
                for(int k=0;k<cky[i][j].size();k++){
                    if(!text.equals("")){
                        text=text+","+cky[i][j].get(k)+ketHop[i][j].get(k);
                    }else{
                        text=text+cky[i][j].get(k)+ketHop[i][j].get(k);
                    }
                    
                    
                }
                DrawButton(pnlCky, new Point(i * pnlCkyWidth / soLuongTu, j * pnlCkyHeight / soLuongTu),
                    pnlCkyWidth / soLuongTu, pnlCkyHeight / soLuongTu, Color.YELLOW, text);
            }

        }
    }

}