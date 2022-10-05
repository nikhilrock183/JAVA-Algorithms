public class lsearch {
    public static void main(String[] args) {
       int[] nums={23,25,87,1,5,6,96};
       int target=23;
       int ans=linearserch(nums,target);
        System.out.println(ans);
    }

static int linearserch(int[] arr, int target) {
if(arr.length==0){
    return-1;

}
for(int index=0;index<arr.length;index++){
    //check for every element at every index
    int element= arr[index];
    if(element==target){
//        return index;
        return element;

    }

}
// this line will execute when the target is not found
    return -1;
}}
