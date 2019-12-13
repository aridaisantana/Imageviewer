/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.PopupMenu;
import java.io.IOException;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author aridai
 */
public class Main extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main().execute();
    }

    private void execute() {
        
        setVisible(true);
    }
    
    
    public Main() throws IOException  {
        setTitle("Image Viewer");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(imagePanel());
        add(toolbar(), BorderLayout.SOUTH);
    }


    private JPanel imagePanel() {
        Image image = new FileImageLoader("/home/aridai/Pictures").load();
        PanelImageDisplay panel = new PanelImageDisplay();
        this.imageDisplay = panel;
        panel.show(image);
        return panel;
    }

    private JPanel toolbar() {
        
    }
    
}
