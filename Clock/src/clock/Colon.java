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
public class Colon extends GridPane{
    private final int MAXROWS = 5;
    private final int MAXCOLS = 1;
    NumBlock blocks [][];
    
    public Colon(){
        blocks = new NumBlock [MAXCOLS][MAXROWS];
        for (int i=0; i<MAXCOLS; i++){
            for (int j=0; j<MAXROWS; j++){
                blocks [i][j] = new NumBlock();
                blocks [i][j].setPrefSize(64, 64);
                add(blocks[i][j],i,j);
            }
        }
        for (int i=0; i<MAXCOLS; i++){
            for (int j=0; j<MAXROWS; j++){
                if (j== ((MAXROWS)/2)-1 || j== ((MAXROWS)/2)+1){
                    blocks[i][j].toNumColor();
                }
            }
        }
    }
}
