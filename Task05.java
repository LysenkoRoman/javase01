/**
 * Created by Роман on 26.11.2015.
 */
public class Task05 {
    public static void main(String[] args){
        char[][] matrix = {
                {'1','0','0',' ','0','0','1'},
                {'0','1','0',' ','0','1','0'},
                {'0','0','1',' ','1','0','0'},
                {' ',' ',' ',' ',' ',' ',' '},
                {'0','1','0',' ','0','1','0'},
                {'1','0','0',' ','0','0','1'},
        };

        for (int i = 0; i < 6 ; i++) {
            int j = 0;
            System.out.println(" ");
            while (j < 7) {
                System.out.print(matrix[i][j]);
                j++;
            }
        }
    }
}
