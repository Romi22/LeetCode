package Problems.GFG.ArrayRotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateElementOneByOne {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of testCases: ");
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0)
        {
            System.out.println("Input the no. of array elements: ");

            int n = Integer.parseInt(br.readLine());

//            System.out.println("Input the array elements for Left Rotation: ");
//
//            String[] inputLine = br.readLine().trim().split(" ");
//
//            int[] arr = new int[n];
//
//            for(int i = 0; i < n; i++)
//            {
//                arr[i] = Integer.parseInt(inputLine[i]);
//            }
//
//            System.out.println("Input the no. of times of rotation");
//
//            int d = Integer.parseInt(br.readLine());
//
//            rotateLeft(arr,d,n);
//
//            System.out.println("Array after Left Rotation: ");
//
//            for(int i = 0; i < n; i++)
//            {
//                System.out.print(arr[i]+ " ");
//            }
//
//            System.out.println("");
//            System.out.println("Input the array elements for Right Rotation: ");
//
//            String[] inputLine2 = br.readLine().trim().split(" ");
//
//            int[] arr2 = new int[n];
//
//            for(int i = 0; i < n; i++)
//            {
//                arr2[i] = Integer.parseInt(inputLine2[i]);
//            }
//
//            System.out.println("Input the no. of times of rotation");
//
//            int d2 = Integer.parseInt(br.readLine());
//
//            rotateRight(arr2,d2,n);
//
//            System.out.println("Array after right Rotation: ");
//
//            for(int i = 0; i < n; i++)
//            {
//                System.out.print(arr2[i]+ " ");
//            }
//


            System.out.println("");
            System.out.println("Input the array elements for Left Rotation Optimized: ");

            String[] inputLine3 = br.readLine().trim().split(" ");

            int[] arr3 = new int[n];

            for(int i = 0; i < n; i++)
            {
                arr3[i] = Integer.parseInt(inputLine3[i]);
            }

            System.out.println("Input the no. of times of rotation");

            int d3 = Integer.parseInt(br.readLine());

            rotateLeftOptimised(arr3,d3,n);

            System.out.println("Array after left Rotation: ");

            for(int i = 0; i < n; i++)
            {
                System.out.print(arr3[i]+ " ");
            }

//            System.out.println("");
//            System.out.println("Input the array elements for Right Rotation Optimized: ");
//
//            String[] inputLine4 = br.readLine().trim().split(" ");
//
//            int[] arr4 = new int[n];
//
//            for(int i = 0; i < n; i++)
//            {
//                arr4[i] = Integer.parseInt(inputLine4[i]);
//            }
//
//            System.out.println("Input the no. of times of rotation");
//
//            int d4 = Integer.parseInt(br.readLine());
//
//            rotateRightOptimised(arr4,d4,n);
//
//            System.out.println("Array after right Rotation: ");
//
//            for(int i = 0; i < n; i++)
//            {
//                System.out.print(arr4[i]+ " ");
//            }
        }
    }

    public static void rotateArrayByOneLeft(int[] arr, int n)
    {
        int temp = arr[0];
       //shifts array element to the left by 1
        for(int i = 0; i < n-1; i++)
        {
            arr[i] = arr[i+1];
        }

        arr[n-1] = temp;
    }

    public static void rotateLeft(int[] arr, int d, int n)
    {
        for(int i = 0; i < d; i++)
        {
            rotateArrayByOneLeft(arr, n);
        }
    }

    public static void rotateRight(int[] arr, int d, int n)
    {
        for(int i = 0; i < d; i++)
        {
            rotateArrayByOneRight(arr, n);
        }
    }

    private static void rotateArrayByOneRight(int[] arr, int n) {
        int temp = arr[n-1];
        //shifts array element to the left by 1
        // 1 2 3 4 5 ->  5 1 2 3 4 ->  4 5 1 2 3
        for(int i = n-1; i > 0; i--)
        {
            arr[i] = arr[i-1];
        }

        arr[0] = temp;
    }

    public static void rotateLeftOptimised(int[] arr, int d, int n)
    {
        rotateDElementsOfArray_Left(arr,d,n);
        rotateRemainingArrayElements_Left(arr,d,n);
        rotateArray(arr,n);
    }

    public static void rotateDElementsOfArray_Left(int[] arr, int d, int n)
    {
        int k = 0;
        for(int i = d-1; i > k; i--)
        {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k++] = temp;

        }

        for(int r : arr)
            System.out.print(r+ " ");

        System.out.println();

    }

    private static void rotateRemainingArrayElements_Left(int[] arr, int d, int n) {
        int k = n-1;

        for(int i = d; i < k; i++)
        {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k--] = temp;
        }

        for(int r : arr)
            System.out.print(r+ " ");

        System.out.println();

    }

    private static void rotateArray(int[] arr, int n) {

        int k = n-1;

        for(int i = 0; i < k; i++)
        {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k--] = temp;
        }

        for(int r : arr)
            System.out.print(r+ " ");

        System.out.println();

    }

    private static void rotateRightOptimised(int[] arr, int d, int n)
    {
        rotateDElementsOfArray_Right(arr,d,n);
        rotateRemainingArrayElements_Right(arr,d,n);
        rotateArray(arr,n);
    }


    private static void rotateDElementsOfArray_Right(int[] arr, int d, int n) {

        int k = n-d;
        for(int i = n-1; i > k; i--)
        {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k++] = temp;
        }
    }

    private static void rotateRemainingArrayElements_Right(int[] arr, int d, int n) {

        int k = (n-d)-1;
        for(int i = 0; i < k; i++)
        {
            int temp = arr[k];
            arr[k--] = arr[i];
            arr[i] = temp;
        }
    }

}



