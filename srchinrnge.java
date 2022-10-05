public class srchinrnge {
    public static void main(String[] args) {
        int[] nums={23,25,87,1,5,6,96};
        int target=87;
        int ans=linearserch(nums,target,1,4);
        System.out.println(ans);
    }

    static int linearserch(int[] nums,int target, int start,int end) {
        if(nums.length==0){
            return-1;

        }
        for(int index=start;index<=end;index++){
            //check for every element at every index
            int element= nums[index];
            if(element==target){
        return index;
//                return element;

            }

        }
// this line will execute when the target is not found
        return -1;
    }}


