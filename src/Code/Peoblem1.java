package Code;

public class Peoblem1 {

    public boolean Find(int target, int [][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int i = rows - 1;
        int j = 0;
        while (array != null && i >= 0 && j <= cols -1) {
            if (target == array[i][j]) { return true;}
            if (target > array[i][j]) {
                j++;
            } else {
                i--;
            }
        }
        return false;
    }
}
