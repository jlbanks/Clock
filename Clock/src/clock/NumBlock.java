/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

/**
 *
 * @author Jodi
 */
public class NumBlock extends StackPane{
    ColorPicker cp;
    public NumBlock(){
        this.setBorder(new Border(new BorderStroke(Color.hsb(Color.BLACK.getHue(), Color.BLACK.getSaturation(), Color.BLACK.getBrightness()), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
        cp = new ColorPicker();
    }
    
    public void toBgdColor(){ //sets background color
        this.setStyle(cp.getBgdColor());
    }
    
    public void toNumColor(){ //Sets Number Color
        this.setStyle(cp.getNumColor());
    }
}
