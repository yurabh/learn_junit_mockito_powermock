package com;

import org.junit.*;

public class ImitationListTest {

    private static ImitationList imitationList;

    @BeforeClass
    public static void beforeAllTests() {
        imitationList = new ImitationList();
    }

    @Before
    public void beforeEach() {
        System.out.println("\nBefore each\n");
        imitationList.setArray(new int[2]);
        imitationList.showArray();
    }

    @After
    public void afterEach() {
        System.out.println("\nAfter each\n");
        imitationList.showArray();
    }

    @Test
    public void shouldAddElementTest() {
        System.out.println("\nAddElement\n");
        imitationList.addElement(2);
        imitationList.addElement(3);
        imitationList.addElement(4);
        int[] array = imitationList.getArray();
        Assert.assertArrayEquals(array, new int[]{2, 3, 4, 0});
    }

    @Test
    public void shouldChangeElementByIndexTest() {
        System.out.println("\nchange element by Index\n");
        imitationList.addElement(1);
        imitationList.addElement(2);
        imitationList.addElement(3);
        imitationList.changeElementByIndex(1, 124);
        int[] array = imitationList.getArray();
        Assert.assertArrayEquals(array, new int[]{1, 124, 3, 0});
    }

    @Test
    public void shouldDeleteByIndexTest() {
        System.out.println("\nDelete By index\n");
        imitationList.addElement(1);
        imitationList.addElement(2);
        imitationList.addElement(3);
        imitationList.deleteByIndex(2);
        int[] array = imitationList.getArray();
        Assert.assertArrayEquals(array, new int[]{1, 2, 0});
    }

    @Test
    public void shouldIncreaseListTest() {
        System.out.println("\nShould Increase\n");
        imitationList.increaseList(2);
        int[] array = imitationList.getArray();
        Assert.assertArrayEquals(array, new int[]{0, 0, 0, 0});
    }

    @Test
    public void shouldDecreaseTest() {
        System.out.println("\nShould Decrease\n");
        imitationList.addElement(1);
        imitationList.addElement(2);
        imitationList.addElement(3);
        imitationList.decreaseList(2);
        int[] array = imitationList.getArray();
        Assert.assertArrayEquals(array, new int[]{1, 2});
    }

    @Test
    public void shouldSortBubbleSortArrayTest() {
        System.out.println("\nShould sort\n");
        imitationList.addElement(332);
        imitationList.addElement(12);
        imitationList.addElement(1020);
        imitationList.addElement(102);
        imitationList.bubbleSort();
        int[] array = imitationList.getArray();
        Assert.assertArrayEquals(array, new int[]{12, 102, 332, 1020});
    }

    @Test
    public void shouldAddArrayIntoArrayTest() {
        int[] array = {1, 2, 3, 4, 5};
        imitationList.addArray(array);
        int[] array1 = imitationList.getArray();
        Assert.assertArrayEquals(array1, new int[]{1, 2, 3, 4, 5, 0, 0, 0});
    }

    @Test
    public void shouldDeleteDuplicateTest() {
        imitationList.addElement(1);
        imitationList.addElement(2);
        imitationList.addElement(3);
        imitationList.addElement(4);
        imitationList.addElement(1);
        imitationList.deleteDuplicate();
        int[] array = imitationList.getArray();
        Assert.assertArrayEquals(array, new int[]{1, 2, 3, 4, 0, 0});
    }

    @Test
    public void shouldLinearTest() {
        imitationList.addElement(1);
        imitationList.addElement(32);
        imitationList.addElement(432);
        imitationList.addElement(535);
        imitationList.addElement(32);
        imitationList.searchLinear(535);
    }
}
