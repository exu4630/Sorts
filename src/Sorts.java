public class Sorts
{
    public static void ascendingSort(int[] arr)
    {
        for(int i = 0; i<arr.length - 1; i++)
        {
            int lowPosition = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < arr[lowPosition])
                {
                    lowPosition = j;
                }
            }
            swap(i,lowPosition,arr);
        }
    }
    private static void swap(int indexOne, int indexTwo, int[] arr)
    {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    public static void printArray(int[] arr)
    {
        for(int v : arr)
            System.out.print(v + " ");


    }



    public static void ascendingSort(String[] arr)
    {
        for(int i = 0; i<arr.length - 1; i++)
        {
            int lowPosition = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[j].compareTo(arr[lowPosition]) < 0)
                {
                    lowPosition = j;
                }
            }
            swap(i,lowPosition,arr);
        }
    }
    private static void swap(int indexOne, int indexTwo, String[] arr)
    {
        String temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    public static void printArray(String[] arr)
    {
        for(String s : arr)
            System.out.print(s + " ");

    }


}

