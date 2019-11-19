package com.company;

public class Main {

    public static int[] BubbleSort(int[] Array)
    {

        while (!isSorted(Array))
        {
            for (int i = 0; i < Array.length - 1; i++)
            {
                if (Array[i] > Array[i + 1])
                {
                    swap(Array, i, i + 1);
                }
            }
        }

        return Array;

    }

    public static int[] QuickSort(int[] Array)
    {

        for (int i = 0; i < Array.length - 1; i++)
        {
            int StartIndex = i;
            int queue = StartIndex + 1;

            for (int k = queue; k < Array.length - 1; k++)
            {
                if (Array[k] < Array[StartIndex])
                {
                    swap(Array, k, queue);
                    queue++;
                }
            }

            swap(Array, StartIndex, queue);
        }

        return Array;

    }

    public static int BinarySearch(int[] Array, int L, int R, int point)
    {

        int middle = L + (R - L) / 2;

        if (R >= L)
        {
            if (point == Array[middle])
            {
                return middle;
            }
            else if (point < Array[middle])
            {
                //left side
                return BinarySearch(Array, L, middle - 1, point);
            }
            else
            {
                //right side
                return BinarySearch(Array, middle + 1, R, point);
            }
        }

        return -1;

    }


    public static boolean isSorted(int[] Array)
    {

        for(int i = 0; i < Array.length - 1; i++)
        {
            if(Array[i] > Array[i + 1])
            {
                return false;
            }
        }

        return true;

    }

    public static void swap(int[] Array, int i1, int i2)
    {

        int temp = Array[i1];
        Array[i1] = Array[i2];
        Array[i2] = temp;

    }

    public static void PrintArray(int[] Array)
    {

        String text = "";

        for(int i = 0; i < Array.length - 1; i++)
        {
            text += Array[i] + " ";
        }

        System.out.println(text);

    }

    public static void main(String[] args) {

        int[] NOTSorted = {61, 90, 23, 15, 97, 9, 25, 55, 80, 71, 0, 17, 25, 20, 27, 78};
        int[] BubbleSorted = BubbleSort(NOTSorted);
        int[] QuickSorted = QuickSort(NOTSorted);

        System.out.println("Bubble sorted");
        PrintArray(BubbleSorted);

        System.out.println("QuickSorted");
        PrintArray(QuickSorted);

        int point = 9;
        int result = BinarySearch(QuickSorted, 0, QuickSorted.length - 1, point);

        System.out.println("Searching " + point);
        System.out.println("Result index " + result);

    }
}
