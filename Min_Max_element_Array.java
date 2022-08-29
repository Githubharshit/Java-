import java.util.Scanner;

public class Min_Max_element_Array {

    // FUNCTION TO FIND MIN AND MAX
        static int [] findMinMax(int []a){
            int min = a[0];
            int max = a[0];

            for(int i=0;i<a.length;i++){
                if(min > a[i]){
                    min = a[i];
                }
                if(max < a[i]){
                    max = a[i];
                }
            }
            int [] result = new int[2];
            result[0] = max;
            result[1] = min;

            return result;
        }

        // FUNCTION TO FIND SECOND LARGEST ELEMENT
   static int secondLargest(int []arr , int max){
            int sl = -1;

            for (int i=0; i<arr.length; i++){

                if (arr[i] != max){
                    if(sl < arr[i]){
                        sl = arr[i];
                    }
                }

            }
        return sl;
    }

    static int secondMinimum(int []arr , int min){
        int sm = arr[0];

        for (int i=0; i<arr.length; i++){

            if (arr[i] != min){
                if(sm > arr[i]){
                    sm = arr[i];
                }
            }
        }
        return sm;
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Size of your Array: ");
            int n=sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements of your Array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int [] result = findMinMax(arr);

//            System.out.print("The Maximum element of the array is: "+ result[0]);
//            System.out.println("");
//            System.out.print("The Minimum element of the array is: "+ result[1]);

            // Second-largest element of Array

            //       int  sec_largest = secondLargest(arr , result[0]);
//            System.out.print("The second largest element of the array is: "+sec_largest);

            // Second-minimum element of the Array
          int sec_minimum = secondMinimum(arr,result[1]);
            System.out.print("The second minimum element of the array is: "+sec_minimum);




















        }
    }

