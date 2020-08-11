// 第二题:reformat 一个字符串,两个输入参数(String str, int[] sizes)
// sizes[0] + size[1] + ... + size[sizes.length – 1] == str.length()
// 然后按照 sizes 中的每个值对字符串分组,分别调换 0 和 1 的位置,2 和 3 的位置...如果是
// 奇数组,则保留最后一个
// 例子:abcdefghi sizes = [3, 2, 2, 1, 1]
// Output: deabchfgi

import java.io.*;
import java.util.*;

// abc, de, fg, h ,i
// 0,   1,  2,  3, 4

class Solution {
  public static void main(String[] args) {
    String str="abcdefghi";
    int[] sizes={3,2,2,1,1};
    Solution solution= new Solution();
    
      System.out.println(solution.newstring(str, sizes));
  }
  private String newstring(String str, int[] sizes){
      String[] strs= new String[sizes.length];
      strs[0]= str.substring(0,sizes[0]);
      int index=sizes[0];
      for(int i=1; i<sizes.length; i++){
         strs[i]=str.substring(index,index+sizes[i]);
         index= index+sizes[i];
      }
      StringBuilder result= new StringBuilder();
      // for(String strl:strs){
      //    result.append(strl);
      // };
      for(int i=0; i<=strs.length/2; i++){
         if(2*i+1<strs.length){
         result.append(strs[2*i+1]);}
         result.append(strs[2*i]);
      }
      return result.toString();
  }
}


// 第一题:给定一个数字 n,要求输出在范围 0, 1, 2, ... , n 中数字 0,2,4 出现的频率
// 如:10 输出 4,因为有 0,2,4,10 (有一个 0)

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
    int n= 10;
    Solution solution= new Solution();
    
      System.out.println(solution.sum(n));
  }
  private int sum(int n){
    int sum=0;
    Solution solution= new Solution();
    for(int i=0; i<=n; i++){
      sum= sum+solution.count(i);
    }
    return sum;
  }
  private int count(int n){
    int number=n;
    int index=0;
    int times=0;
    if(number==0){times=1;}
    while(number>0){
      index=number%10;
      if(index==0 || index==2 || index==4){
        times=times+1;}
      number=number/10;
    }
    return times;
  }
}


