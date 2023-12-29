package problem_find_even_n_digit;

public class Main {
    public static void main(String[] args) {
       int[] nums = {12,345,2,6,7896};
       int evenNumber= 0;
       
    for (int n: nums){
      int count = 0;
      while(n > 0){
        count ++; 
         n/=10;
      }
      if(count%2==0)
       evenNumber++;
    }
    System.out.println(evenNumber);
    }
}
