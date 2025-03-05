package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;

public class StringUtil {
    public static String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }


    public static String generateMD5Hex(String input) {
        return DigestUtils.md5Hex(input);
    }
}
