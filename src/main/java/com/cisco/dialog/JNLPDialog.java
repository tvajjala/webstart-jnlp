package com.cisco.dialog;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 * This is simple Dialog. which we make signed jar and open through JNLP
 */
public class JNLPDialog {
    
    public JNLPDialog(String title) throws Exception {
        JDialog jd = new JDialog();
        jd.setSize(400, 400);
        centerLocation(jd);
        jd.setTitle(title);
        jd.getContentPane().add(new JLabel("Launching through JNLP Successful"));
        jd.setVisible(true);
        Thread.currentThread().sleep(10000);
        System.exit(0);
    }
    
    static void centerLocation(JDialog jd){
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - jd.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - jd.getHeight()) / 2);
        jd.setLocation(x, y);
    }
    
    public static void main(String[] args) throws Exception {
        String title = "Welcome to Java Network Launching Protocol";
      
        if (args.length > 1) {
            title = args[0];
        }
        
        new JNLPDialog(title);
    }
    
}