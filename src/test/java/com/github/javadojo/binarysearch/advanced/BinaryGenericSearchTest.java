package com.github.javadojo.binarysearch.advanced;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BinaryGenericSearchTest {

    private final BinaryGenericSearch<Integer> integerObjectToTest =
        new BinaryGenericSearch<>();

    private final BinaryGenericSearch<String> stringObjectToTest =
        new BinaryGenericSearch<>();

    private final Integer[] testIntegerArray = new Integer[] {
        1, 3, 5, 7, 8, 9, 10, 12, 14, 17,
    };

    private final String[] testStringArray = new String[] {
        "Baden-Württemberg", "Bayern", "Berlin", "Brandenburg", "Bremen",
        "Hamburg", "Hessen", "Mecklenburg-Vorpommern", "Niedersachsen",
        "Nordrhein-Westfalen", "Rheinland-Pfalz", "Saarland", "Sachsen",
        "Sachsen-Anhalt", "Schleswig-Holstein", "Thüringen",
    };

    @Test(enabled = false)
    public void testIntegerFound() {
        Assert.assertTrue(integerObjectToTest.search(testIntegerArray, 1),
            "Expected the value 1 to be found.");
    }

    @Test(enabled = false)
    public void testIntegerNotFound() {
        Assert.assertFalse(integerObjectToTest.search(testIntegerArray, 2),
            "Expected the value 2 not to be found.");
    }

    @Test(enabled = false)
    public void testStringFound() {
        Assert.assertTrue(stringObjectToTest.search(testStringArray,
            "Thüringen"), "Expected the value \"Thüringen\" to be found.");
    }

    @Test(enabled = false)
    public void testStringNotFound() {
        Assert.assertFalse(stringObjectToTest.search(testStringArray, "München"),
            "Expected the value \"München\" not to be found.");
    }

}
