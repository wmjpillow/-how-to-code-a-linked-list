// Binary Search
// https://zh.wikipedia.org/wiki/二分搜索算法

public static int binarySearch( int[] arr, int start, int end, int hkey){
    if(start>end)
       return -1;

    int mid= start+(end-start)/2;
    if (arr[mid]> hkey)
       return binarySearch(arr, start, mid-1, hkey);
    if (arr[mid]<hkey)
       return binarySearch(arr, mid+1, end, hkey);
    return mid;
}


//java while 
Public static int binarySearch( int[] arr, int start, int end, int hkey){
    int result = -1;

    while (start<=end){
        int mid= start+(end-start)/2;
        if(arr[mid]>hkey)
           end= mid-1;
        else if(arr[mid]<hkey)
           start= mid+1;
        else{
            result= mid;
            break;
        }
    }
    return result;
}


//https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/discuss/85173/Share-my-thoughts-and-Clean-Java-Code
// The key point for any binary search is to figure out the "Search Space". For me, I think there are two kind of "Search Space" -- index and range(the range from the smallest number to the biggest number). Most usually, when the array is sorted in one direction, we can use index as "search space", when the array is unsorted and we are going to find a specific number, we can use "range".

// Let me give you two examples of these two "search space"

// index -- A bunch of examples -- https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/ ( the array is sorted)
// range -- https://leetcode.com/problems/find-the-duplicate-number/ (Unsorted Array)
