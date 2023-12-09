package problem_cosecutive_ones;

public class Main {
    public static void main(String[] args){
      int[] nums = {1,1,0,1,1,1,0,1,1};
       //1 <= nums.length <= 105
      int nextNum = 0;
      int consecutive = 0;
      int tempCons = 1;
      for(int n = 0; n< nums.length-1; n++){                
             if (nums[n] == nums[n+1]){
                 ++tempCons;
                if (tempCons>consecutive){
                    consecutive = tempCons;                                   
                }  
                 System.out.println("tempCons "+tempCons);
             }else{
                
                 tempCons= 1;
             }
        
      }
 System.out.println(consecutive);

    }
    
}
