import java.util.Scanner;
public class testTeacher {
    //Driver class
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nama");
        String Subject = in.nextLine();
        System.out.println("FullTime atau PartTime?");
        String unit = in.nextLine();
        System.out.println("Berapakah gaji yang diterima?");
        int anualSalary = in.nextInt();
        System.out.println("Berapa jam bekerja?");
        int hoursWorked = in.nextInt();
        System.out.println("Gaji yang diterima");
        int setSalary = in.nextInt();
        System.out.println("Selamat anda mendapatkan gaji");


    }

    
}
