import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        int mat, phys, chem, tur, hist, msc;
        int sum;
        float avg;
        String pass;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Math: ");
        mat = input.nextInt();
        
        System.out.print("Physics: ");
        phys = input.nextInt();
        
        System.out.print("Chemistry: ");
        chem = input.nextInt();
        
        System.out.print("Turkish: ");
        tur = input.nextInt();
        
        System.out.print("History: ");
        hist = input.nextInt();
        
        System.out.print("Music: ");
        msc = input.nextInt();
        
        sum = (mat + phys + chem + tur + hist + msc);
        
        avg = sum/6;
        
        pass = avg > 60 ? "Passed" : "Failed";
        
        System.out.println(pass);
    }
}
