/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.model;

/**
 *
 * @author aridai
 */
public interface Image {

    public String name();
    public byte[] data();
    public Image next();
    public Image prev();
    
}
