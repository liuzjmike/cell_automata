package cell;

import javafx.scene.paint.Color;

import cellsociety.Cell;

/**
 * Cell for Wa-Tor simulation
 * @author liuzj
 *
 */
public class watorCell extends Cell {

    public static final int WATER = 0;
    public static final int FISH = 1;
    public static final int SHARK = 2;
    public static final Color[] COLORS = {Color.BLUE, Color.BISQUE, Color.GREY};
    
    public watorCell() {
        super(WATER, COLORS[WATER]);
    }
    
    public void toWater() {
        setState(WATER, COLORS[WATER]);
    }
    
    public void toFish() {
        setState(FISH, COLORS[FISH]);
    }
    
    public void toShark() {
        setState(SHARK, COLORS[SHARK]);
    }
}
