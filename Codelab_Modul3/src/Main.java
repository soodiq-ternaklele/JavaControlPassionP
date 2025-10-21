import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { ;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama :");
        String name =input.nextLine();
        System.out.println("Masukan usia : ");
        int age = input.nextInt();

        System.out.println("===Data diri===");
        System.out.println("Nama : " + name);
        System.out.println("Umur : " + age);

    }
}
