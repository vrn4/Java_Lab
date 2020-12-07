import java.util.Scanner;

public class lab8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Input String is " + s);
        String l[] = s.split(" ");
        for(int i=1;i<l.length;i=i+2){
            StringBuilder temp = new StringBuilder(l[i]);
            temp.reverse();
            l[i] = temp.toString();
        }
        for(int i=0;i<l.length;i++){
            System.out.print(l[i] + " ");
        }
        System.out.println();
    }
}
