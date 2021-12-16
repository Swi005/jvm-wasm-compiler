package com.structures;

public class Demo
{
    public static int Foo(int foo)
    {
        int bar = foo+2;
        return bar;
    }
    public static int Bar()
    {
        int[] nums = {1,2,3};
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            c += nums[i];
        }
        return c;
    }
}
