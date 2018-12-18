public class Board {
    public Tile[] board_tiles;
    public Board(Tile[] input_board){
        board_tiles = new Tile[input_board.length];
        board_tiles = input_board;
    }
    public boolean isValidboard(Tile[][] board){
        for (int x = 0; x < board.length; x++){
            if (!isValidSet(board[x]) && !isValidRun(board[x])){
                return false;
            }
        }
        return true;

    }
    public boolean isValidSet(Tile[] set{
        //int set_number = set[0].number;
        return true;

    }

    public boolean isValidRun(Tile[] run){
        return true;

    }
}

