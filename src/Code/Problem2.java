package Code;

/*
    请实现一个函数，将一个字符串中的空格替换成“%20”。
    例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

public class Problem2 {

    public static String replaceSpace(StringBuffer str) {

        if (str == null || str.length() <= 0) {
            return "";
        }

        int oldStrLength = str.length();
        int numOfBlock = 0; // 空格的数量
        for (int i = 0; i < oldStrLength; i++) {
            if (str.charAt(i) == ' ') {
                numOfBlock++;
            }
        }

        int newStrLength = oldStrLength + numOfBlock * 2;
        int indexOfOld = oldStrLength - 1;
        int indexOfNew = newStrLength - 1;
        str.setLength(newStrLength);

        while (indexOfOld >= 0 && indexOfNew > indexOfOld) {
            if (str.charAt(indexOfOld) == ' ') {
                str.setCharAt(indexOfNew--, '0');
                str.setCharAt(indexOfNew--, '2');
                str.setCharAt(indexOfNew--, '%');
            } else {
                str.setCharAt(indexOfNew--, str.charAt(indexOfOld));
            }
            indexOfOld--;
        }
        return str.toString();

    }
}
