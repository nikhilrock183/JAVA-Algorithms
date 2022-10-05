public class lserchminnum {
    public static void main(String[] args) {
        int[] arr={23,25,87,1,5,6,96};
        int target=23;
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans=arr[0];
        for(int index=0;index<arr.length;index++){
            //check for every element at every index
            if(arr[index]<ans){
                ans=arr[index];
            }
//        return index;

    }
        return ans;
    }}
