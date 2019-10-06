//https://stackoverflow.com/questions/29172164/adding-integers-to-an-int-array


int[] num= new int[args.length];
for(int i=0;i<args.length;i++){
    int neki= Integer.parseInt(args[i]);
    num[i]= neki;
}

//the add() method is available for Collections like List and Set.
List<Integer> num= new ArrayList<>();
for(String s: args){
    int neki= Integer.parseInt(s);
    num.add(neki);
}
