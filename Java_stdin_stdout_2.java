import java.util.Scanner;
public class Java_stdin_stdout_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double pi = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        
        System.out.println("String: "+str);
        System.out.println("Double: "+pi);
        System.out.println("Int: "+num);
        sc.close();
    }
}
