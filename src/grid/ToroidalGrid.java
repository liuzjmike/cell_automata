package grid;

import java.util.Collection;

import cell.Cell;
import cell.CellConfig;
import cell.generator.CellGenerator;

/**
 * Grid with toroidal edges
 * @author Mike Liu
 * @author Bilva Sanaba
 */
public class ToroidalGrid extends Grid {

    public ToroidalGrid(int row, int col, Collection<CellConfig> cellConfig, CellGenerator generator) {
        super(row, col, cellConfig, generator);
    }
    
    public ToroidalGrid(Grid grid) {
        super(grid);
    }

    @Override
    protected void addNeighbor(int row, int col, Collection<Cell> neighbors) {
        neighbors.add(get(Math.floorMod(row, numRows()), Math.floorMod(col, numCols())));
    }

}
