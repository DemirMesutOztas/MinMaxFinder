import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz?");
        int value = input.nextInt();
        int no;
        int min = 0;
        int max = 0;


        for(int i=0; i<value; i++)
        {
            System.out.print( (i+1) +". Sayıyı giriniz: ");
            no = input.nextInt();

            if(i==0)
            {
                min = no;
                max = no;
            }

            min = min>no ? no : min;
            max = max<no ? no : max;

        }

        System.out.print("En büyük sayı: "+max);
        System.out.println("");
        System.out.print("En küçük sayı: "+min);

    }
}