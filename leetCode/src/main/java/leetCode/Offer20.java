package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/13 7:56
 */
public class Offer20 {
    public boolean isNumber(String s) {
        int length = s.length();
        boolean hasNum = false;
        boolean hasE = false;
        boolean hasSign = false;
        boolean hasDot = false;
        int index = 0;
        while (index < length && s.charAt(index) == ' ') {
            index++;
        }
        while (index < length) {
            while (index < length && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                index++;
                hasNum = true;
            }
            if (index == length) {
                break;
            }
            char c = s.charAt(index);
            if (c == 'e' || c == 'E') {
                if (hasE || !hasNum) {
                    break;
                }
                hasE = true;
                hasNum = false;
                hasSign = false;
                hasDot = false;
            } else if (c == '+' || c == '-') {
                if (hasNum || hasSign || hasDot) {
                    break;
                }
                hasSign = true;
            } else if (c == '.') {
                if (hasDot || hasE) {
                    break;
                }
                hasDot = true;
            } else {
                break;
            }
            index++;
        }
        while (index < length && s.charAt(index) == ' ') {
            index++;
        }
        return index == length && hasNum;
    }
}
