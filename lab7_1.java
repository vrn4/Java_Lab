import java.util.Scanner;

public class lab7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        System.out.println("String is "+s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' 
            || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' 
            || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                char ch = s.charAt(i);
                s = s.replace(ch, Character.toUpperCase(ch));
            }
            else{
                char ch = s.charAt(i);
                s = s.replace(ch, Character.toLowerCase(ch));
            }
        }         
        System.out.println(s);
    }   
}
