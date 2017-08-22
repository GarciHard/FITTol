package fittol.vista;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class FITTolSplash extends JFrame {
    
    private static FITTolSplash instance;
    private JLabel lblLogo;
    private JProgressBar pgbLoader;
    
    public FITTolSplash() {
        initFrame();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 101; i++) {
                    try {
                        sleep(35);
                        pgbLoader.setValue(i);
                    } catch (InterruptedException ex) {
                        System.err.println(ex);
                    }
                }
                instance.setVisible(false);
                FITTolLogin.getInstance().setVisible(true);
            }
        }.start();
    }
    
    private void initFrame() {
        setLayout(null);
        setSize(new Dimension(430, 486));
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        
        lblLogo = new JLabel();
        lblLogo.setSize(new Dimension(getWidth(), getHeight()));
        lblLogo.setIcon(new ImageIcon("src/fittol/imagenes/FITTolSplashScreen_v2.png"));
        lblLogo.setLocation(0, 0);
        
        pgbLoader = new JProgressBar();
        pgbLoader.setBackground(new Color(122, 255, 102, 255));
        pgbLoader.setSize(new Dimension(238, 20));
        pgbLoader.setLocation(167, 285);
        
        add(lblLogo);
        add(pgbLoader);
    }
    
    public static FITTolSplash getInstance() {
        if (instance == null) {
            instance = new FITTolSplash();
        }
        return instance;
    }
    
}
