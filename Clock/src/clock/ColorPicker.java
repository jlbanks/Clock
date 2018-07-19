/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import javafx.scene.paint.Color;

/**
 *
 * @author Jodi
 */
public class ColorPicker {
    //private String bgdColor;
    //private String numColor;
    private String bgdColor;
    private String numColor;
    
    public ColorPicker(){
        this.bgdColor = "-fx-background-color: BLACK";
        this.numColor = "-fx-background-color: RED";
        //bgdColor = Color.BLACK;
        //numColor = Color.RED;
    }

    /**
     * @return the bgdColor
     */
    public String getBgdColor() {
        return bgdColor;
    }

    /**
     * @param bgdColor the bgdColor to set
     */
    public void setBgdColor(String bgdColor) {
        this.bgdColor = bgdColor;
    }
    
//    public String BgdColorString() {
//        return "-fx-background-color:" + ;
//    }

    /**
     * @return the numColor
     */
    public String getNumColor() {
        return numColor;
    }

    /**
     * @param numColor the numColor to set
     */
    public void setNumColor(String numColor) {
        this.numColor = numColor;
    }
    
//    public String NumColorString() {
//        return "-fx-background-color:"
//    }
}
