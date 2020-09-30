package ru.makarov.logic;

import java.util.Arrays;

public class LibVerSort {

    private String[] list;

    public LibVerSort() {

    }

    public String[] arraySortedVersions(String[] list){
       Arrays.sort(list);
       return list;
    }

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof LibVerSort)) return false;
        LibVerSort that = (LibVerSort) object;
        return Arrays.equals(getList(), that.getList());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getList());
    }
}
