private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
    
    //black square never gets labeled
    if(blackSquares[r][c]){
        return false;
    }
    //top row and left column is always labeled
    return (r == 0 || c == 0 || blackSquares[r-1][c] || blackSquares[r][c-1]);
}
