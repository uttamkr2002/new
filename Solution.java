
import java.util.*;
class Solution {
    public static int[] findMaxRow(int mat[][], int N) {
        int max_count [] = new int [N];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
                max_count[i]=count;
            }
        }
        
        return max_count;
        // code here
    }
    
    public static void main(String [] args){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        N = sc.nextInt();
        int mat[][]= new int [N][N];
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=sc.nextInt(); 
            }
        }
        int a[]= findMaxRow(mat,N);
        
        //  a[] = findMaxRow(mat,N);
         
        System.out.println("now we are printing");
         for(int i=0;i<a.length;i++){
            if()
             System .out .println(a[i]);
         }

    }
}
  