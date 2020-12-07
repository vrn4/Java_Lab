import java.util.Scanner;

public class lab6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String l[] = s.split(" ");
        String a = "";
        for(int i=0;i<l.length-1;i++){
            l[i] = l[i].toUpperCase();
            a = a+l[i].charAt(0)+".";
        } 
        System.out.println(a+l[l.length-1]);   
    }
}
