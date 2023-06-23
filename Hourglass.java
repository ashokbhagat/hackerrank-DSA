import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Result {

    public static int hourglassSum(int[][] arr) {
        int max =0;
        int val =0;
       
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {           
                val = (arr[i][j] +  arr[i][j+1] +    arr[i][j+2]);
                val = val+(arr[i+1][j+1]);
                val =  val + (arr[i+2][j] +  arr[i+2][j+1] +    arr[i+2][j+2]);
                
                if(i==0 && j==0)
                    max = val;
                max = val>max?val:max;
            }
        }
        System.out.println(max);
        return max;
    }

}

public class Hourglass {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];
        
        for (int i = 0; i < 6; i++) {
            String row = sc.nextLine();
            String [] values = row.split(" ");
           
            for (int j = 0; j < 6; j++) {
                arr[i][j] = Integer.parseInt(values[j]);
            }
        }
      
        int max = Result.hourglassSum(arr);

    }
}
