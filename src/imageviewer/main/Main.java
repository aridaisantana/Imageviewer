/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.main;

import imageviewer.controller.Command;
import imageviewer.controller.NextCommand;
import imageviewer.controller.PrevCommand;
import imageviewer.persistance.file.FileImageLoader;
import imageviewer.model.Image;
import imageviewer.view.swing.PanelImageDisplay;
import imageviewer.view.ImageDisplay;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class Main extends JFrame {
    private Map<String, Command> commands;
    private ImageDisplay imageDisplay;

    public static void main(String[] args) throws IOException {
        new Main().execute();
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

    private void execute() {
        commands = createCommands();
        setVisible(true);
    }

    private JPanel imagePanel() {
        Image image = new FileImageLoader("/home/aridai/Pictures").load();
        PanelImageDisplay panel = new PanelImageDisplay();
        this.imageDisplay = panel;
        panel.show(image);
        return panel;
    }

    private JPanel toolbar() {
        JPanel panel = new JPanel();
        panel.add(button("prev"));
        panel.add(button("next"));
        return panel;
    }

    private JButton button(String name) {
        JButton button = new JButton(name);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                commands.get(name).execute();
            }
        });
        return button;
    }

    private Map<String, Command> createCommands() {
        HashMap<String, Command> map = new HashMap<>();
        map.put("next", new NextCommand(imageDisplay));
        map.put("prev", new PrevCommand(imageDisplay));
        return map;
    }
    
    
    
}