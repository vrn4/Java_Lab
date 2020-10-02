import java.util.Random;
import java.util.Scanner;

public class primeMatrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Random rand = new Random();
        int r,c;
        int i,j;
        System.out.println("Enter the number of rows");
        r = obj.nextInt();
        System.out.println("Enter the number of columns");
        c = obj.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Element of matrix:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr[i][j] = 2 + rand.nextInt(101);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(checkPrime(arr[i][j])) {
                    System.out.println(arr[i][j] + " is a prime number at " + (i+1) + "th row " + (j+1) + "th column");
                }
            }
        }
    }
    static boolean checkPrime(int n){
        for(int i=2;i<=n/2;i++) { 
            if(n%i==0) 
                return false; 
        } 
        return true;
    }
}
