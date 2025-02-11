public class ArrayAdd{
    public static void main (String[] args){
        int [] myArray = {1,2,3,4};
        myArray = addElement(myArray,5);
        myArray = addElement( myArray, 9);

        
        for ( int val : myArray)
        System.out.println(val + " ");

    }
    public static int [] addElement (int[] arr, int val)
    {
        int [] temp = new int [arr.length+1];
        for ( int i = 0; i< arr.length ; i++ )
        {
            temp [i] = arr[i];
        }
        temp [temp.length-1] = val;
        return temp;

    }
}
    
