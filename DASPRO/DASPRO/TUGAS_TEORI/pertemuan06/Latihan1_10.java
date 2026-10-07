import java.util.Scanner;

public class Latihan1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bi11, bi12, bi13, terbesar;

        System.out.println("Bilangan 1");
        bi11 = sc.nextInt();

        System.out.println("Bilangan 2");
        bi12 = sc.nextInt();

        System.out.println("Bilangan 3");
        bi13 = sc.nextInt();

        if(bi11 > bi12){

        } if (bi11 > bi12){
            terbesar = bi11;
        }else {
            terbesar = bi13;

        }if (bi12 > bi13){
            terbesar = bi12;
        }else{
            terbesar = bi13;
        }
        
        System.out.println("Bilangan Terbesar Adalah" + terbesar);
        sc.close();
    }
}