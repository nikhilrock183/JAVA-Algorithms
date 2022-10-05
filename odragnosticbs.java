public class odragnosticbs {
    public static void main(String[] args) {
        int [] arr={1,1,2,3,4,5,6,7,8};
        int target=5;
        int ans=orderagnosticbs(arr,target);
        System.out.println(ans);
    }
    static int orderagnosticbs(int[] arr,int target){

        int start=0;
        int end=arr.length-1;
        int mid=start+(end+start)/2;
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc =true;

        }else{
            isAsc=false;
        }

        if(arr[mid]==target){
            return mid;
        }
        if(isAsc){
            if(target<arr[mid]){
                end=mid-1;

            }else if(target>arr[mid]){
                start=mid+1;

            }
            else{
                if(target<arr[mid]){
                    end=mid-1;

                }else if(target>arr[mid]){
                    start=mid+1;

            }
        }
    }

return -1;
    }}
