public class lsearchstr {
    public static void main(String[] args) {
        String name="Nikhil";
        char target= 'k';
        System.out.println(search(name,target));
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;

        }
      for(int index=0;index<str.length();index++){
            //check for every element at every index
            if(target==str.charAt(index)){
//      return index;
//        for(char ch:str.toCharArray()){
//            if(ch==target){
//                return true;
//
//            }

        }
// this line will execute when the target is not found
//        return false;
    }
//        return 0;
        return false;
    }}


