public class Test
{
    public static void main (String[] args)
    {
        int[] arr1 = {159,852,6598,751,565,565,559,213};
        Sorts.printArray(arr1);
        System.out.println();

        Sorts.ascendingSort(arr1);
        Sorts.printArray(arr1);
        System.out.println();
        System.out.println();

        String[] stringArr1 = {"Bob", "John", "Eric", "Steve", "Justin"};
        Sorts.printArray(stringArr1);
        System.out.println();
        Sorts.ascendingSort(stringArr1);
        Sorts.printArray(stringArr1);



    }


}
