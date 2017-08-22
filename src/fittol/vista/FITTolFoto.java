package fittol.vista;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;


/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class FITTolFoto extends JDialog implements ActionListener, WindowListener {
    
    private int valorImg = 0;
    private JButton btnTomarFoto;
    private JPanel pnlBackground;
    private Webcam webcam;
    private WebcamPanel pnlBackgroundFoto;
    
    public FITTolFoto(java.awt.Dialog parentFrame, boolean modal) {
        initFrame(parentFrame, modal);
    }
    
    private void initFrame(java.awt.Dialog parentFrame, boolean modal) {
        setTitle("Captura de fotos");
        setSize(new Dimension(300, 300));
        setResizable(false);
        setLocationRelativeTo(parentFrame);
        setModal(modal);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        addWindowListener(this);
        
        btnTomarFoto = new JButton("Tomar Foto");
        btnTomarFoto.addActionListener(this);
        
        webcam = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.VGA.getSize());
        
        pnlBackground = new JPanel(new BorderLayout());
        pnlBackground.setSize(getWidth(), getHeight());
        
        pnlBackgroundFoto = new WebcamPanel(webcam);
        pnlBackgroundFoto.setImageSizeDisplayed(true);
        pnlBackgroundFoto.setMirrored(true);
        //pnlBackgroundFoto.setSize(new Dimension(getWidth(), getHeight()));
        
        pnlBackground.add(pnlBackgroundFoto, BorderLayout.CENTER);
        pnlBackground.add(btnTomarFoto, BorderLayout.SOUTH);
        
        add(pnlBackground);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnTomarFoto) {
            BufferedImage image = webcam.getImage();
            try {
                ImageIO.write(image, "PNG", new File("src/fittol/imagenes/test.png"));
                this.webcam.close();
                this.dispose();
                setValorImg(1);
            } catch (Exception ex) {
                System.out.println("errorNvoCteFoto :" + ex);
            }
        }
    }
    
    private void setValorImg(int valorImg) {
        this.valorImg = valorImg;
    }
    
    public int getValorImg() {return valorImg;}

    @Override
    public void windowOpened(WindowEvent e) {this.webcam.open();}

    @Override
    public void windowClosing(WindowEvent e) {this.webcam.close();}

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
    
}
