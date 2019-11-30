//https://my.oschina.net/CasparLi/blog/361859

Pattern p= Pattern.complie("\\w+");
p.pattern();   // return "\w+"


//Pattern.split 方法用于分隔字符串，并返回一个string[]
Pattern p= Pattern.compile("\\d+");
String[] str= p.split()

//Pattern.matcher(String regex,CharSequence input)是一个静态方法,
//用于快速匹配字符串,该方法适合用于只匹配一次,且匹配全部字符串.
Pattern.matches("\\d+","2223");    //true
Pattern.matches("\\d+","2223aa");   //false,需要匹配到所有字符串才能返回true,这里aa不能匹配到
Pattern.matches("\\d+","22bb23");     //false,需要匹配到所有字符串才能返回true,这里bb不能匹配到

