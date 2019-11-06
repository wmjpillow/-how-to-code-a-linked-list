//一个数字,求所有位数的乘积减去所有位数的和。
public static int test(int i){
    int product=1;
    int sum=0;
    while(i!=0){
        int digit=i%10;
        i/=10;

        product*=digit;
        sum+=digit;
    }
    return product-sum;
}

//GoodTurple
public GoodTurple(int[] nums){
    int result=0;
    if(nums.length<3){return 0;}
    int pre1=nums[0];
    int pre2=nums[1];
    for(int i=2;i<nums.length;i++){
   //if (nums[i] != pre1 && nums[i] != pre2 && pre1 != pre2) {
        if(nums[i]==pre1 || nums[i]==pre2 || pre1==pre2){
            result++;
        }
        pre1=pre2;
        pre2=nums[i];
    }
    return result;
}

// Find the most common elements in a list
public static List<Integer> findMostCommon(int[] A){
    Map<Integer,Integer> map= new HashMap<Integer,Integer>();
    int maxVal=0;
    for(int a: A){
        map.put(a,map.getOrDefault(a,0)+1);
        maxVal=Math.max(maxVal,map.get(a));
    }
    List<Integer> res=new ArrayList<>();
    for(int num: map.keySet()){
        if(map.get(num)==maxVal){
            res.add(num);
        }
    }
    return res;
}

//Find how many numbers have even digit in a list.
public static int findEvenDigit(int[] a){
    int res=0;
    for(int num:a){
        String s=Integer.toString(num);
        if(s.length()%2==0){
            res++;
        }
    }
    return res;
}

//Words is Valid
public static int wordsValid(String[] words, char[] letters){
    Set<Character> set= new HashSet<>();
    for(char c : letters){
        set.add(Character.toLowerCase(c));
    }
    int res=0;
    for(String word: words){
        char[] wordChar= word.toCharArray();
        boolean isValid= true;
        for(int i=0;i<wordChar.length;i++){
            char curr=wordChar[i];
            if(Character.isLowerCase(curr)||Character.isUpperCase(curr)){
                curr=Character.toLowerCase(curr);
                if(!set.contains(curr)){
                    isValid= false;
                    break;
                }
            }
        }
        if(isValid){
            res++;
        }
    }
    return res;
}

//Broken keyboard
public static brkenKeyboard(String a, char[] b){
    Set<Character> set= new HashSet<>();
    for(char c:b){
        set.add(c);
    }
    int res=0;
    String[] temp=a.split(" ");
    for(String s: temp){
        char[] sChar=s.toCharArray();
        boolean isln=true;
        for(char ch: sChar){
            ch=Character.toLowerCase(ch);
            if(!set.contains(ch)){
                isln=false;
                break;
            }
        }
        if(isln){res++;}
    }
    return res;
}

//maxRibbon
public static int maxRibbon(int[] A, int k){
    int hi=0;
    int lo=0; 
    int res=0;
    for(int i=0; i<A.length; i++){
        hi+=A[i];
    }
    while(lo<=hi){
        int mid=(lo+hi)/2;
        int part=0;
        for(int i=0; i<A.length; i++){
            part+=A[i]/mid;
        }
        if(part>=k){
            res=Math.max(res,mid);
            lo=mid+1;
        }
        else{hi=mid-1;}
    }
    return res;
}

//rotate Diagonal
public static void rotateDiagnoal(int[][] matrix, int k){
    int n=matrix.length;
    for(int s=0;s<k;s++){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(i!=j && i+j !=n-1){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                if(i!=j && i+j != n-1){
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[i][n-j-1];
                    matrix[i][n-j-1]=temp;
                }
            }
        }
    }
}

//divide Substring
public static int divideSubString( String s, int k){
    int res=0;
    int total= Integer.parseInt(s);
    Set<Integer> set= new HashSet<Integer>();
    for( int i=0; i<s.length()-k+1; i++){
        String temp= s.substring(i,i+k);
        int num= Integer.parseInt(temp);
        System.out.println(num);
        System.out.println(total);
        if(!set.contains(num) && num!=0){
            if(total%num == 0){
                res++;
            }
        }
        set.add(num);
    }
    return res;
}

//remove Exact One Digit
public static int removeExactOneDigit(String s1, String s2){
    if(s1==null && s2== null){return 0;}
    if(s1== null){return s2.length();}
    if(s2==null){return 0;}
    if(s1.length()==0 && s2.length()==0){return 0;}
    if(s1.length()==0){return s2.length();}
    else if(s2.length()==0){return 0;}
    int len1= s1.length();
    int len2= s2.length();
    int s1Arrow= 0;
    int s2Arrow= 0;
    int res = 0;
    if(s1.charAt(0)<s2.charAt(0)){
        res=(s1.length()-1)+(s2.length()-1);
        if(compareStringVal(s1.substring(1),s2)>0){res++;}
        if(compareStringVal(s1,s2.substring(1))>0){res++;}
    }
    else if(s1.charAt(s1Arrow)==s2.charAt(s2Arrow)){
        res=removeExactOneDigit(s1.substring(1),s2.substring(1));
        if(compareStringVal(s1.substring(1),s2)>0){res++;}
        if(compareStringVal(s1,s2.substring(1))>0){res++;}
    }
    else{if(compareStringVal(s1.substring(1),s2)>0){res=1;}
        else{ res=0;}}
    return res;
    }

public static int compareStringVal(String s1, String s2){
    int len1= s1.length();
    int len2= s2.length();
    int s1Arrow= 0;
    int s2Arrow= 0;
    while(s1Arrow< len1 && s2Arrow<len2){
        if(s1.charAt(s1Arrow)<s2.charAt(s2Arrow)){
            return 1;
        } else if(s1.charAt(s1Arrow)== s2.charAt(s2Arrow)){
            s1Arrow++;
            s2Arrow++;
        }else { return -1;}
    }
    if(s1Arrow<len1){return -1;}
    else{return 1;}
}

//Longest Equal SubArray
public static int longestEqualSubArray(int[] a){
    for(int i=0; i<a.length; i++){
        if(a[i]==0){ a[i]= -1;}
    }
    int[] prefixSum= new int[a.length+1];
    for(int i=0; i<a.length; i++){
        prefixSum[i+1]= prefixSum[i]+a[i];
    }
    int res=0;
    for( int i=0; i<a.length; i++){
        for( int j=1; j<=a.length; i++){
            if(prefixSum[i]==prefixSum[j]){
                res= Math.max(res,i-j);
            }
        }
    }
    return res;
}





