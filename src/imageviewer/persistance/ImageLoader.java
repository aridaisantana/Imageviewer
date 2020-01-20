/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.persistance;

import imageviewer.model.Image;

/**
 *
 * @author aridai
 */
public interface ImageLoader {
    
    public Image load();
}
