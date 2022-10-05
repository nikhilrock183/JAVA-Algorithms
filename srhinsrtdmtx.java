public class srhinsrtdmtx {
    public static void main(String[] args) {

    }

    static int search(int[][] matrix,int target){
        int rows=matrix.length;






        int cols=matrix[0].length;
        if(rows==1){
            return binarysearch(matrix,00,cols-1,target);
        }
        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;
        while(rstart<(rend-1)){
            int mid=rstart+(rend-rstart)/2;
            if(matrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            if(matrix[mid][mid]<target) {
                rstart = mid;

            }
            else{
                rend=mid;
            }
            if(matrix[rstart][cmid]==target){
                return new int[]{rstart+1,cmid};

            }
            if(target<=matrix[rstart][cmid-1]){
                return binaryserach(matrix,rstart,0,cmid-1,target);
            }
            if(target>=matrix[rstart][cmid-1]){
                return binaryserach(matrix,rstart,0,cmid-1,target);
            }
            if(target<=matrix[rstart][cmid+1]){
                return binaryserach(matrix,rstart+1,0,cmid-1,target);
            }
            else{
                return binarysearch(matrix,rstart+1,cmid+1,cols-1,target);
        }
        }

    }
    }

