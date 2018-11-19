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
            System.out.print(v + ", ");

        System.out.println();

    }


}

