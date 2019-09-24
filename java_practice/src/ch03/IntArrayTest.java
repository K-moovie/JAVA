
package ch03;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class IntArrayTest {
    public static final int MAX_NUMS = 1000;
    
    public void test(){
        int[] nums;
        long sum = 0;
        
        nums = new int[MAX_NUMS];
        for(int i =0; i < MAX_NUMS; i++){
            nums[i] = (int)(Math.random()*100);
            sum = sum+nums[i];
        }
        System.out.println("평균 1: "+(float)sum/MAX_NUMS);
        
        this.calculateSumUsingWrapper(nums);
    }
    private void calculateSumUsingWrapper(int[] nums){
        OptionalInt sum = java.util.Arrays.stream(nums).reduce((x,y)->(x+y));
        OptionalDouble  avg = java.util.Arrays.stream(nums).average();
        if(sum.isPresent()&&avg.isPresent()){
            System.out.printf("합계 = %d, 평균2 : %f%n",sum.getAsInt(),avg.getAsDouble());
        }
    }
}
