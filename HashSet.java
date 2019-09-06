// http://www.ishenping.com/ArtInfo/1176094.html

// hashset.add(E e)：返回boolean型，如果此 set 中尚未包含指定元素，
// 则添加指定元素；如果此 set 已包含该元素，则该调用不更改 set 并返回 false

public static char findFirstRepeat(String A, int n){
    char[] a= A.toCharArray();
    HashSet hs= new HashSet<>();
    for(int i=0;i<n;i++){
        if(!hs.add(a[i])){
            return a[i];
        }
    }
    return 0;
}



//Java中的HashMap是以键值对 key-value 的形式来存储元素的
//https://blog.csdn.net/wxgxgp/article/details/79194360
