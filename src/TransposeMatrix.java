import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row size of the 2D Array:");
        int rowsize=scanner.nextInt();
        System.out.println("Enter the column size of the 2D Array:");
        int colsize=scanner.nextInt();
        int array[][]=new int[rowsize][colsize];
        System.out.println("Enter the Array Elements row wise:");
        for (int i = 0; i < rowsize; i++) {
            for(int j=0;j<colsize;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        transpose(array,rowsize,colsize);

    }

    private static void transpose(int[][] array, int rowsize, int colsize) {
        int result[][]=new int[colsize][rowsize];
        int temp=0;
        for(int i=0;i<rowsize;i++){
            for(int j=0;j<colsize;j++){
                if(i<j){
                    temp=array[i][j];
                    array[i][j]=array[j][i];
                    array[j][i]=temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
