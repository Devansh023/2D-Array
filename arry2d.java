import java.util.Scanner;
                                           // M A T R I X
public class arry2d {
    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter rows:-");
            int rows = sc.nextInt();
            System.out.print("Enter cols:-");
            int cols = sc.nextInt();

            int[][] nums = new int [rows][cols];    // 2D array 


            // Input
            // rows
            System.out.println("Enter 2D Arrays:- ");
            for(int i=0; i<rows; i++){
                //cols
                for(int j=0; j<cols; j++){
                nums[i][j]=sc.nextInt();
                }
            }

            System.out.print("Which value: ");
            int indx = sc.nextInt();

            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                if(nums[i][j]==indx){
                    System.out.println("yr value location is at index: (" +i+ "," +j+ ")"  );
                }
              }
              System.out.println(); 
            }
        
    }
}
