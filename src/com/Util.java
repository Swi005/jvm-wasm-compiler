package com;

import java.util.regex.Pattern;

public class Util
{
    public static String encodeString(String str)
    {
        return Pattern.compile("\\^\\.\\>\\<\\/").matcher(str).replaceAll("_");
    }
}
