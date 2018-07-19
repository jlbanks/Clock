/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.AnimationTimer;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Jodi
 */
public class Display extends GridPane{
    private Number hou1;
    private Number hou2;
    private Number min1;
    private Number min2;
    private LocalDateTime nowTime;
    private char hourVal[];
    private char minVal[];
    private ColorPicker cp;
    
    public Display (){
        this.setHgap(30);
        this.setVgap(10);
        hou1 = new Number();
        hou2 = new Number();
        min1 = new Number();
        min2 = new Number();
        add(hou1,1,0);
        add(hou2,2,0);
        add(new Colon(),3,0);
        add(min1,4,0);
        add(min2,5,0);
        cp = new ColorPicker();
        this.setStyle(cp.getBgdColor());
    }
    
    public void LiveTime(){
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                hou1.clearNumber();
                hou2.clearNumber();
                min1.clearNumber();
                min2.clearNumber();
                nowTime = LocalDateTime.now();
                hourVal = String.valueOf(nowTime.getHour()).toCharArray();
                if (hourVal.length == 1){
                    hou1.makeNumber(0);
                    hou2.makeNumber(Integer.parseInt(String.valueOf(hourVal[0])));   
                } else {
                    hou1.makeNumber(Integer.parseInt(String.valueOf(hourVal[0])));
                    hou2.makeNumber(Integer.parseInt(String.valueOf(hourVal[1]))); 
                }
                minVal = String.valueOf(nowTime.getMinute()).toCharArray();
                if (minVal.length == 1){
                    min1.makeNumber(0);
                    min2.makeNumber(Integer.parseInt(String.valueOf(minVal[0])));   
                } else {
                    min1.makeNumber(Integer.parseInt(String.valueOf(minVal[0])));
                    min2.makeNumber(Integer.parseInt(String.valueOf(minVal[1]))); 
                }
            }
        }, 0, 5000);
        
    }

    /**
     * @return the hou1
     */
    public Number getHou1() {
        return hou1;
    }

    /**
     * @param hou1 the hou1 to set
     */
    public void setHou1(Number hou1) {
        this.hou1 = hou1;
    }

    /**
     * @return the hou2
     */
    public Number getHou2() {
        return hou2;
    }

    /**
     * @param hou2 the hou2 to set
     */
    public void setHou2(Number hou2) {
        this.hou2 = hou2;
    }

    /**
     * @return the min1
     */
    public Number getMin1() {
        return min1;
    }

    /**
     * @param min1 the min1 to set
     */
    public void setMin1(Number min1) {
        this.min1 = min1;
    }

    /**
     * @return the min2
     */
    public Number getMin2() {
        return min2;
    }

    /**
     * @param min2 the min2 to set
     */
    public void setMin2(Number min2) {
        this.min2 = min2;
    }
    
}
