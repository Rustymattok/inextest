package ru.makarov.logic;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LibVerSortTest {

    @Test
    public void arraySortedVersionsWithDifference() {
       String[] list = {"1.2.1","1.1.1"};
       LibVerSort libVerSort = new LibVerSort();
       libVerSort.arraySortedVersions(list);
       Assert.assertEquals("1.1.1",list[0]);
    }

    @Test
    public void arraySortedVersionsWithEquelsValues() {
        String[] list = {"1.2.1","1.1.1","1.1.1","1.3.1"};
        LibVerSort libVerSort = new LibVerSort();
        libVerSort.arraySortedVersions(list);
        Assert.assertEquals("1.1.1",list[0]);
        Assert.assertEquals("1.1.1",list[1]);
        Assert.assertEquals("1.2.1",list[2]);
        Assert.assertEquals("1.3.1",list[3]);
    }
}