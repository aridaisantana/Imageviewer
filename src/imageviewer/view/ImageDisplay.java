/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.view;

import imageviewer.model.Image;

/**
 *
 * @author aridai
 */
public interface ImageDisplay {
    
    public void show(Image image);

    public Image getCurrentImage();
    
}
