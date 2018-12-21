/** Invariants

 1. Pieces include numbers 1 - 13,
 2. With 4 colors Red, Black, Orange, Blue
 3. 2 pieces of each letter color combination
 4. There are two jokers

 Note: Can make it compatible with more colors later
 Color mappings: Black = 1, Blue = 2, Orange = 3, Red = 4
 Tile mappings: Unused = 1, Set = 2, Run = 3
 */

public class Game {
    Game() {

    }
    public int countNumber(Tile[][] board, int number){
        int count = 0;
        for (int x = 0; x < board.length; x++){
            for (int y = 0; y < board[x].length; y++){
                if (board[x][y].number == number){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isGroupPossible(Tile[][] board, Tile hand){
        if (countNumber(board, hand.number) >=2){
            return true;
        }else{
            return false;
        }

    }

    public Tile[][] breakRuns(Run input){
        for ()
    }
}

