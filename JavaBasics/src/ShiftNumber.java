import java.util.Arrays;

public class ShiftNumber {

 public static void main(String args[]) {
  int arr[] = { 8, 9, 0, 4, 0, 6, 1 };

  ShiftNumber.pushZerosToEnd(arr);
  System.out.println(Arrays.toString(arr));
 }

 public static void pushZerosToEnd(int arr[]) {
  int counter = 0;
  int n = arr.length;

  for (int i = 0; i < n; i++) {
   if (arr[i] != 0) {
    arr[counter++] = arr[i];

   }
         
  }
  System.out.println(counter);
  while (counter < n) {
   arr[counter++] = 0;
  }

 }
}
