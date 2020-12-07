public class lab2_1 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        boolean c = true; 
        for(int i=2;i<x;i++){
            if(x%i==0){
                c = false;
                System.out.println(x + " is a composite number");
                break;
            }
        }
        if(c){
            System.out.println(x + " is a prime number");
        }
    }
}
