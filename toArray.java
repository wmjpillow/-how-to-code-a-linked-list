//https://www.cnblogs.com/meng72ndsc/archive/2010/12/22/1914191.html
// ArrayList：我们可以将其看作是能够自动增长容量的数组。
// 利用ArrayList的toArray()返回一个数组。
// Arrays.asList()返回一个列表。

public class ArrayListTest{
    public static void main(String[] args){
        List all= new ArrayList();
        all.add("java");
        all.add("world");
        System.out.println(all);
    }
}


//[java,world]