//https://www.yiibai.com/java_data_type/java_stringbuilder_stringbuffer.html


// length()  capacity()
public static void main(String[] args){
    StringBuilder sb= new StringBuilder(200);
    sb.append("hello");
    int len= sb.length();  //5
    int capacity= sb.capacity(); //200
}

//toString() 方法将 StringBuilder 内容作为String 类型的字符串值
public class Main{
    public static void main(String[] args){
        String s1= new String("Hello");
        StringBuilder sb= new StringBuilder(s1);
        sb.append(" java");
        String s2= sb.toString();  //Hello java
    }
}

//setLength() 
public class Main {
    public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("Hello");
      sb.setLength(7);
      sb.setLength(2);
    }
  }

  
  
  

