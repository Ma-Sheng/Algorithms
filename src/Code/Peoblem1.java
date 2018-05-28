package Code;

/*
    在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
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
