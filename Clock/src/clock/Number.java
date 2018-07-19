/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import javafx.scene.layout.GridPane;

/**
 *
 * @author Jodi
 */
public class Number extends GridPane{
    
    private final int MAXROWS = 5;
    private final int MAXCOLS = 4;
    NumBlock blocks [][];
    
    public Number(){
        blocks = new NumBlock [MAXCOLS][MAXROWS];
        for (int i=0; i<MAXCOLS; i++){
            for (int j=0; j<MAXROWS; j++){
                blocks [i][j] = new NumBlock();
                blocks [i][j].setPrefSize(64, 64);
                add(blocks[i][j],i,j);
            }
        }
        
    }
    
    public void clearNumber(){
        for (int i=0; i<MAXCOLS; i++){
            for (int j=0; j<MAXROWS; j++){
                blocks [i][j].toBgdColor();
            }
        }
    }
    
    public void makeNumber(int num){
        if(num==0){
            blocks[0][0].toNumColor();
            blocks[0][1].toNumColor();
            blocks[0][2].toNumColor();
            blocks[0][3].toNumColor();
            blocks[0][4].toNumColor();
            blocks[1][0].toNumColor();
            blocks[1][4].toNumColor();
            blocks[2][0].toNumColor();
            blocks[2][4].toNumColor();
            blocks[3][0].toNumColor();
            blocks[3][1].toNumColor();
            blocks[3][2].toNumColor();
            blocks[3][3].toNumColor();
            blocks[3][4].toNumColor();
        } else if (num==1){
            blocks[3][0].toNumColor();
            blocks[3][1].toNumColor();
            blocks[3][2].toNumColor();
            blocks[3][3].toNumColor();
            blocks[3][4].toNumColor();
        } else if (num==2){
            blocks[0][0].toNumColor();
            blocks[0][2].toNumColor();
            blocks[0][3].toNumColor();
            blocks[0][4].toNumColor();
            blocks[1][0].toNumColor();
            blocks[1][2].toNumColor();
            blocks[1][4].toNumColor();
            blocks[2][0].toNumColor();
            blocks[2][2].toNumColor();
            blocks[2][4].toNumColor();
            blocks[3][0].toNumColor();
            blocks[3][1].toNumColor();
            blocks[3][2].toNumColor();
            blocks[3][4].toNumColor();
        } else if (num==3){
            blocks[0][0].toNumColor();
            blocks[0][2].toNumColor();
            blocks[0][4].toNumColor();
            blocks[1][0].toNumColor();
            blocks[1][2].toNumColor();
            blocks[1][4].toNumColor();
            blocks[2][0].toNumColor();
            blocks[2][2].toNumColor();
            blocks[2][4].toNumColor();
            blocks[3][0].toNumColor();
            blocks[3][1].toNumColor();
            blocks[3][2].toNumColor();
            blocks[3][3].toNumColor();
            blocks[3][4].toNumColor();
        } else if (num==4){
            blocks[0][0].toNumColor();
            blocks[0][1].toNumColor();
            blocks[0][2].toNumColor();
            blocks[1][2].toNumColor();
            blocks[2][2].toNumColor();
            blocks[3][0].toNumColor();
            blocks[3][1].toNumColor();
            blocks[3][2].toNumColor();
            blocks[3][3].toNumColor();
            blocks[3][4].toNumColor();
        } else if (num==5){
            blocks[0][0].toNumColor();
            blocks[0][1].toNumColor();
            blocks[0][2].toNumColor();
            blocks[0][4].toNumColor();
            blocks[1][0].toNumColor();
            blocks[1][2].toNumColor();
            blocks[1][4].toNumColor();
            blocks[2][0].toNumColor();
            blocks[2][2].toNumColor();
            blocks[2][4].toNumColor();
            blocks[3][0].toNumColor();
            blocks[3][2].toNumColor();
            blocks[3][3].toNumColor();
            blocks[3][4].toNumColor();
        } else if (num==6){
            blocks[0][0].toNumColor();
            blocks[0][1].toNumColor();
            blocks[0][2].toNumColor();
            blocks[0][3].toNumColor();
            blocks[0][4].toNumColor();
            blocks[1][0].toNumColor();
            blocks[1][2].toNumColor();
            blocks[1][4].toNumColor();
            blocks[2][0].toNumColor();
            blocks[2][2].toNumColor();
            blocks[2][4].toNumColor();
            blocks[3][0].toNumColor();
            blocks[3][2].toNumColor();
            blocks[3][3].toNumColor();
            blocks[3][4].toNumColor();
        } else if (num==7){
            blocks[0][0].toNumColor();
            blocks[1][0].toNumColor();
            blocks[2][0].toNumColor();
            blocks[3][0].toNumColor();
            blocks[3][1].toNumColor();
            blocks[3][2].toNumColor();
            blocks[3][3].toNumColor();
            blocks[3][4].toNumColor();
        } else if (num==8){
            blocks[0][0].toNumColor();
            blocks[0][1].toNumColor();
            blocks[0][2].toNumColor();
            blocks[0][3].toNumColor();
            blocks[0][4].toNumColor();
            blocks[1][0].toNumColor();
            blocks[1][2].toNumColor();
            blocks[1][4].toNumColor();
            blocks[2][0].toNumColor();
            blocks[2][2].toNumColor();
            blocks[2][4].toNumColor();
            blocks[3][0].toNumColor();
            blocks[3][1].toNumColor();
            blocks[3][2].toNumColor();
            blocks[3][3].toNumColor();
            blocks[3][4].toNumColor();
        } else if (num==9){
            blocks[0][0].toNumColor();
            blocks[0][1].toNumColor();
            blocks[0][2].toNumColor();
            blocks[0][4].toNumColor();
            blocks[1][0].toNumColor();
            blocks[1][2].toNumColor();
            blocks[1][4].toNumColor();
            blocks[2][0].toNumColor();
            blocks[2][2].toNumColor();
            blocks[2][4].toNumColor();
            blocks[3][0].toNumColor();
            blocks[3][1].toNumColor();
            blocks[3][2].toNumColor();
            blocks[3][3].toNumColor();
            blocks[3][4].toNumColor();
        } else {
            for (int i=0; i<MAXCOLS; i++){
                for (int j=0; j<MAXROWS; j++){
                    blocks[i][j].toBgdColor();
                }
            }
        }
    }
    
    
}
