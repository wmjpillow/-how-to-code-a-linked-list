import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


class Solution {
  public static void main(String[] args) {
    int N= 9;
    List<Integer> list= Arrays.asList(6,3,1,2,27,5,7,8,2);
    Solution solution= new Solution();
    System.out.println(solution.subtract(N, list));
  }
  private int subtract(int N, List<Integer> list){
    int[] sub= new int[N-1];
    for(int i=1; i<list.size(); i++){
       sub[i-1]=list.get(i)-list.get(i-1);
    };
    int maxSum= Integer.MIN_VALUE;
    int sum=0;
    for(int i=0; i<N-1; i++){
       if(sub[i]<0){ sum=0;
         maxSum= Math.max(sum,maxSum);}
       else{ sum=sum+sub[i];
           maxSum=Math.max(sum,maxSum);}
    }
    return maxSum;
  }
}

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


class Solution {
  public static void main(String[] args) {
    int[] array= {1,2,1,2,5,4,2};
    Solution solution= new Solution();
    System.out.println(Arrays.toString(solution.judge(array)));
  }
  private Boolean[] judge(int[] array){
    Boolean[] results= new Boolean[array.length-2];
    for(int i=1; i<array.length-1; i++){
       if((array[i]-array[i-1])*(array[i]-array[i+1])>0){
         results[i-1]=true;}
       // if(array[i]>array[i-1] && array[i]>array[i+1]){
       //   results[i-1]=true;}
       // if(array[i]<array[i-1] && array[i]<array[i+1]){
       //   results[i-1]=true;}
       else{results[i-1]=false;}
    }
    return results;
  }
}
