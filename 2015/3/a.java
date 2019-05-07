public int getValueAt(int row, int col){
    for(SparseArrayEntry x : entries){
        if(x.getRow() == row && x.getCol() == col){
            return x.getValue();
        }
    }
    return 0;
}
