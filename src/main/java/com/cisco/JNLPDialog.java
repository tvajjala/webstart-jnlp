package com.cisco;

import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 */
public class JNLPDialog{
    
    public JNLPDialog() throws Exception {
        
        JDialog jd = new JDialog();
        jd.setSize(200,100);
        jd.setLocation(100,100);
        jd.setTitle("Hello JNLP!");
        jd.getContentPane().add(new JLabel("Launching Test Successful."));
        jd.setVisible(true);
        Thread.currentThread().sleep(10000);
        System.exit(0);
    }
    
    
    public static void main(String[] args) throws Exception {
        new JNLPDialog();
    }
    
}