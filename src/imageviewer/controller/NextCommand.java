/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.controller;

import imageviewer.view.ImageDisplay;

/**
 *
 * @author aridai
 */
public class NextCommand implements Command {
    
    private final ImageDisplay display;
    
    public NextCommand(ImageDisplay imageDisplay) {
        
        this.display = imageDisplay;
    }

    @Override
    public void execute() {
        display.show(display.getCurrentImage().next());

    }
    
}
