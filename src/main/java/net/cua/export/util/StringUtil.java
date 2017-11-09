package net.cua.export.util;

/**
 * Created by wanggq on 2017/9/30.
 */
public class StringUtil {
    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static boolean isNotEmpty(String s) {
        return s != null && s.length() > 0;
    }

    public static int indexOf(String[] array, String v) {
        if (v != null) {
            for (int i = 0; i < array.length; i++) {
                if (v.equals(array[i])) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (v == array[i]) {
                    return i;
                }
            }
        }
        return -1;
    }


    public static String uppFirstKey(String key) {
        char first = key.charAt(0);
        if (first >= 97 && first <= 122) {
            char[] _v = key.toCharArray();
            _v[0] -= 32;
            return new String(_v);
        }
        return key;
    }

    public static String lowFirstKey(String key) {
        char first = key.charAt(0);
        if (first >= 65 && first <= 90) {
            char[] _v = key.toCharArray();
            _v[0] += 32;
            return new String(_v);
        }
        return key;
    }
}