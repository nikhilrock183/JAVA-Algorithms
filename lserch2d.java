import java.util.Arrays;

public class lserch2d {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,5},
                {52,25,78},
                {63,90,70},
                {40,1,6}
        };
        int target=5;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][]arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1};

    }
}
