import java.util.*; 
import java.io.*;

// Have the function ParallelSums(arr) take the array of integers stored in arr 
// which will always contain an even amount of integers, and determine how they 
// can be split into two even sets of integers each so that both sets add up to 
// the same number. If this is impossible return -1. If it's possible to split 
// the array into two sets, then return a string representation of the first set 
// followed by the second set with each integer separated by a comma and both sets 
// sorted in ascending order. The set that goes first is the set with the smallest 
// first integer.

// For example: if arr is [16, 22, 35, 8, 20, 1, 21, 11], then your program should 
// output 1,11,20,35,8,16,21,22

// Input: new int[] {1,2,3,4}
// Output: 1,4,2,3

// new int[] {1,2,1,5}
// Output: -1

// Input: new int[] {16, 22, 35, 8, 20, 1, 21, 11}
// Output: 1,11,20,35,8,16,21,22

class Solution{

    public List<Integer> ParallelSums(int[] arr) {
        // code goes here  
        Arrays.sort(arr);
        Solution solution= new Solution();
        solution.half(arr, 0, 0, arr.length/2);
        List<Integer> list= new ArrayList<>();
        int[] arr1= new int[arr.length/2];
        int[] arr2= new int[arr.length/2];
        for(int i=0; i<arr.length/2; i++){
           arr1[i]=arr[i];
        };
        for(int i=0; i<arr.length/2; i++){
           arr2[i]=arr[i+ arr.length/2];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr.length/2; i++){
           list.add(arr1[i]);
        };
        for(int i=0; i<arr.length/2; i++){
           list.add(arr2[i]);
        };
        return list;
      }
      public void half(int[] arr, int index, int sum, int high){
        int maxDistance= distance(arr);
        if(sum==maxDistance){
        swap(arr,index,high);}
        if(sum>maxDistance){return;}
        if(index>=arr.length/2){return;}
        else{
        for(int i=index; i<arr.length/2; i++){
          for(int j=arr.length/2; j<arr.length; j++){
            half(arr, index+1,sum+(arr[j]-arr[i])*2,j);
          }
        }}
        // return index;
        // return -1;
      }
      public int distance(int[] arr){
        int sum1=0;
        int sum2=0;
        for(int i=0; i<arr.length/2; i++){
          sum1=sum1+arr[i];
        }
        for(int i=arr.length/2; i<arr.length; i++){
          sum2=sum2+arr[i];
        }
        return sum2-sum1;
      }
      public void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
      }

  public static void main (String[] args) {  
    // keep this function call here     
    // Scanner s = new Scanner(System.in);
    // System.out.print(ParallelSums(s.nextLine())); 
    int[] arr= new int[] {16, 22, 35, 8, 20, 1, 21, 11};
    Solution answer= new Solution();
    System.out.println(answer.ParallelSums(arr));
  }

}