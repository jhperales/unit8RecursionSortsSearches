

/**
 * Write a description of class BubbleSorter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSorter
{
    public static int[] sort(int[] in){
        while(!isSorted(in)){
            for(int x=0; x<in.length-1; x++){
                int first = in[x];
                int second = in[x+1];
                if(first > second){
                    swap(in, x, x+1);
                }
            }
        }
        return in;
    }
    public static boolean isSorted(int[] arr){
        int lst = arr[0];
        for(int x=1; x<arr.length; x++){
            if(arr[x] < lst){
                return false;
            }
            lst = arr[x];
        }
        return true;
    }
        /**
    Swaps two entries of an array.
    @param a the array
    @param i the first position to swap
    @param j the second position to swap
     */
    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
