package ru.unn.agile.sorting.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {

    private final double delta = 0.001;

    @Test
    public void canCreateSorting() {
        assertNotNull(new Sorting());
    }

    @Test
    public void canCreateSortingWithDirection() {
        String direction = "asc";
        assertNotNull(new Sorting(direction));
    }

    @Test
    public void canSortTwoNumbers() {
        int numbers[] = {2,1};
        Sorting sorting = new Sorting();
        assertArrayEquals(new int[]{1,2},sorting.sort(numbers));
    }

    @Test
    public void canSortTwoNumbersDesc() {
        int numbers[] = {1,2};
        Sorting sorting = new Sorting("desc");
        assertArrayEquals(new int[]{2,1},sorting.sort(numbers));
    }
}
