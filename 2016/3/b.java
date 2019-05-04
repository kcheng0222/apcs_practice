public Crossword(boolean[][] blackSquares){
    puzzle = new Square[blackSquares.length][blackSquares[0].length];
    int count = 0;

    for(int r = 0; r < blackSquares.length; r++){
        for(int c = 0; c < blackSquares[0].length; c++){
            if(toBeLabeled(r, c, blackSquares)){
                puzzle[r][c] = new Square(false, count);
                count += 1
            }
            else{
                puzzle[r][c] = new Square(blackSquares[r][c], 0);
            }
        }
    }
}
