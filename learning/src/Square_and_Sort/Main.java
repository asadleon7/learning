package Square_and_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
       // Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
     int p1 = array.length/2;
     int p2 = array.length;
    //  for(int n: array){
    //     System.out.println(n);
    //  }
    int sn = array[0];
    for(int n =0; n<array.length; n++){
        if(sn>array[n])
          sn = array[n];
        }
    System.out.println(sn);
    }
}
