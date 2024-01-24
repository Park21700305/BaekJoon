public class Solution {
    private int size;
    private int count;
    private int[] positions;

    public int solution(int n) {
        size = n;
        count = 0;
        positions = new int[n]; // 각 행의 퀸의 열 위치를 저장

        placeQueen(0);
        return count;
    }

    private void placeQueen(int row) {
        if (row == size) {
            count++;
            return;
        }

        for (int col = 0; col < size; col++) {
            if (isSafe(row, col)) {
                positions[row] = col;
                placeQueen(row + 1);
            }
        }
    }

    private boolean isSafe(int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = positions[prevRow];
            
            if (prevCol == col || Math.abs(prevCol - col) == Math.abs(prevRow - row)) {
                return false;
            }
        }
        return true;
    }
}
