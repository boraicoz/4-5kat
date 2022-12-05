import java.util.Scanner;
public class odev2 {

    public static void main(String[] args) {
        int total=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int i=in.nextInt();

        System.out.println("4'un katlari"+"\t5'in katlari");
        for(int k=1,l=1;k<i||l<i;k*=4,l*=5){
            if(k>i)
                continue;
            System.out.print(k);
            if(l>i)
                continue;
            System.out.println("\t\t\t\t\t\t"+l);
        }




    }




}
