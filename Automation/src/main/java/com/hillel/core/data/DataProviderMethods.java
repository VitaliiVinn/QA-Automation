package com.hillel.core.data;

import org.testng.annotations.DataProvider;

public class DataProviderMethods {
    @DataProvider()
    public static Object [][] data() {
        return new Object[][]{
                {"John", "john@kib.kf", "0567521255", "tg", "PHP"},
                {"Vasya", "jn@kib.kf", "0567661255", "vb", "JAVA"},
                {"Petr", "hn@kib.kf", "0667521255", "tg", "JS"}
        };
    }
}
