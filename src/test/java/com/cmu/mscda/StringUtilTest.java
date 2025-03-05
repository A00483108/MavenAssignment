package com.cmu.mscda;

import com.smu.mscda.StringUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    @Test
    public void testCapitalize() {
        Assertions.assertEquals("Smu", StringUtil.capitalize("smu"));
        assertEquals("", StringUtil.capitalize(""));
        assertNull(StringUtil.capitalize(null));
    }

    @Test
    public void testGenerateMD5Hex() {
        String input = "smu";
        String expected = "3773300C2F413CC7136F8D74B305519C";
        assertEquals(expected, StringUtil.generateMD5Hex(input).toUpperCase());
    }
}
