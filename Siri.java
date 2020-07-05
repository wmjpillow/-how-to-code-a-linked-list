import java.io.*;
import java.util.*;

// Construct a Trie first to help search 
class TrieNode {
    public TrieNode[] children = new TrieNode[26];
    public String item = "";  
    // Initialize data structure here
    public TrieNode() {
    }
}
class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    // Inserts a word into the trie
    public void insert(String word) {
        TrieNode node = root;
        for (char C : word.toCharArray()) {
            if (node.children[C - 'A'] == null) {
                node.children[C - 'A'] = new TrieNode();
            }
            node = node.children[C - 'A'];
        }
        node.item = word;
    }
    // Return if the word is in the trie
    public boolean search(String word) {
        TrieNode node = root;
        for (char C : word.toCharArray()) {
            if (node.children[C - 'A'] == null) return false;
            node = node.children[C - 'A'];
        }
        return node.item.equals(word);
    }
    // Return if there is any word in the trie that starts with the given prefix
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char C : prefix.toCharArray()) {
            if (node.children[C - 'A'] == null) return false;
            node = node.children[C - 'A'];
        }
        return true;
    }
}

// Solution here
public class Siri {
    public static void main(String[] args) {
        char[][] board={{'R','A','E','L'}, {'M','O','F','S'}, {'T','E','O','K'}, {'N','A','T','I'}};
        // Implement a naive dictionary to check if a string is a valid word.
        String[] words={ "ROO","EFSK","EOFL","OETM","AOSL","AEFE","ROET","ROEOM","RA","AOEO","TRO" };
        System.out.println(findWords( board, words));
    }

    Set<String> res = new HashSet<String>();
    
    private static List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        Siri siri= new Siri();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                siri.DFS(board, visited, "", i, j, trie);
            }
        }
        return new ArrayList<String>(siri.res);
    }
    
    private void DFS(char[][] board, boolean[][] visited, String str, int x, int y, Trie trie) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) return;
        if (visited[x][y]) return;   
        str += board[x][y];
        if (!trie.startsWith(str)) return;
        // Add valid word
        if (trie.search(str) && str.length()>=3) {
            res.add(str);
        }
        // DFS (a word should not have multiple instances of the same cell.)
        visited[x][y] = true;
        DFS(board, visited, str, x - 1, y, trie);
        DFS(board, visited, str, x - 1, y - 1, trie);
        DFS(board, visited, str, x + 1, y, trie);
        DFS(board, visited, str, x + 1, y + 1, trie);
        DFS(board, visited, str, x - 1, y + 1, trie);
        DFS(board, visited, str, x + 1, y - 1, trie);
        DFS(board, visited, str, x, y - 1, trie);
        DFS(board, visited, str, x, y + 1, trie);
        visited[x][y] = false;
    }
};


// DiDi
class Solution {
    public static void main(String[] args) {
        String S="1A 2F 1C";
        int N=2;
        System.out.println(process(N, S));
    }
    private static int process(int N, String s){
        String[] positions= s.split(" ");
        Map<Integer, List<Character>> map= new HashMap<>();
        for(String position: positions){
           int key= position.charAt(0);
           if(map.containsKey(key)){
           map.get(key).add(position.charAt(1));}
           else{
           map.put(key,new ArrayList<>());
           map.get(key).add(position.charAt(1));}
        }
        int sum=0;
        int count=0;
        Solution solution= new Solution();
        for(Map.Entry<Integer, List<Character>> row : map.entrySet()){ 
          int value= solution.search(row.getValue());
          sum=sum+value;
          count=count+1;
        }
      sum=sum+(N-count)*3;
      return sum;
    }
    private int search(List<Character> list){
        int sum=0;
        Boolean BCDE= true;
        Boolean DEFG= true;
        Boolean FGHJ= true;
        for(int i=0; i<list.size(); i++){
           if(list.get(i)=='B' || list.get(i)=='C'){
               BCDE= false;
           }
           if(list.get(i)=='H' || list.get(i)=='J'){
               FGHJ= false;
           }
           if(list.get(i)=='D' || list.get(i)=='E'){
               BCDE= false;
               DEFG= false;
           }
           if(list.get(i)=='F' || list.get(i)=='G'){
               FGHJ= false;
               DEFG= false;
           }
        }
      if(BCDE== true ){sum=sum+1;}
      if(FGHJ== true ){sum=sum+1;}
      if(FGHJ== false && BCDE==false && DEFG== true){sum=sum+1;}
      return sum;
    }
  }


// DiDi
  class Solution {
    public static void main(String[] args) {
        int[] A= {0,5,4,3,4,5,12};
        // int[] A= {1,2,3,2,5,3,3,4};
        System.out.println(process(A));
    }
    private static int process(int[] A){
      int maxLength=0;
      int[] temp= new int[2];
      for(int i=0; i<A.length-1; i++){
        temp[0]= A[i];
        temp[1]= A[i];
        int length=1;
        for(int j= i+1; j<A.length; j++){
          length=length+1;
          if(A[j]==temp[0] || A[j]==temp[1]){continue;}
          else{
          if(temp[0]==temp[1]){ temp[1]=A[j];}
          else{ 
            length=length-1;
            break;}}
        }
        maxLength=Math.max(length, maxLength);
      }
      return maxLength;
    }
  }
  

  

