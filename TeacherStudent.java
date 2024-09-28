import java.util.Scanner;

    public class TeacherStudent{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("name");
            String name=in.nextLine();
            System.out.println("Age");
            int Age=in.nextInt();

            System.out.println("1.Student atau 2.Teacher");
            int pilihan=in.nextInt();

            if (pilihan==1){
                System.out.println("Student Number");
                int studentNumber= in.nextInt();
                System.out.println("Score");
                int Score= in.nextInt();
                System.out.println("What's the Major?");
                String major= in.nextLine();
                in.nextLine();

            
            }else if (pilihan == 2){
                System.out.println("Masukkan subject");
                String subject=in.nextLine();
                in.nextLine();
                
                System.out.println("Inputan benar");

        }
    }
 }