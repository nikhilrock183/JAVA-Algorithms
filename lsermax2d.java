public class lsermax2d {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,5},
                {52,25,78},
                {63,90,70},
                {40,1,6}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++) {
                if (arr[row][col]>max) {
                    max=arr[row][col];
                }
            }
    }
        return max;  }

}
