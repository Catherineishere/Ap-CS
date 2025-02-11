import java.util.Scanner;
public class ArrayFun {

    public static void main (String[] args)
    {
        System.out.println("Hello World");
        int[] intArray = new int[3]; // declare and initialize integer array
        System.out.println(intArray[0]);

        intArray[0] = (int) (Math.random()*7 + 1);
        intArray[1] = (int) (Math.random()*7 + 1);
        intArray[2] = (int) (Math.random()*7 + 1);

        System.out.println( intArray[0]);
        System.out.println( intArray[1]);
        System.out.println( intArray[2]);


        int [] l2 = new int [50];
        for(int i = 0; i<50; i++ )
        {
            l2[i] = 2*(i+1);
        }
        System.out.println(l2[0]);

        String [] nameR = new String [4];
        nameR[0] = "Catherine";
        nameR[1] = "Isaiah";
        nameR[2] = "Sam";
        nameR[3] = "Hannah";
        System.out.println(nameR[0]);
        System.out.println(nameR[1]);
        System.out.println(nameR[2]);
        System.out.println(nameR[3]);


        boolean stop = false;
        Scanner scan = new Scanner (System.in);

        System.out.println(pickStudent(nameR));

        while (!stop)
        {
            System.out.println(pickStudent(nameR));
            System.out.println("press Y to pick again");
            String choice = scan.nextLine();
            if ( ! "y".equals(choice));
            stop = true;




        }
        scan.close();

        Fraction[] fracList = {new Fraction (3,4), new Fraction (5,12)};
        System.out.println(fracList[1]);


    }
    public static String pickStudent(String[] sList)
    {
        return sList [(int)(Math.random()*4)];

    }

    
}
