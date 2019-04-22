package mainthread;

import controller.StudentController;

import java.io.IOException;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) throws IOException {
        StudentController controller = new StudentController();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("************MENU*************");
            System.out.println("1.Thêm Sinh viên: ");
            System.out.println("2.Thêm File: ");
            System.out.println("3.Đọc File: ");
            System.out.println("4.Thoát.");
            System.out.println("---------");
            System.out.println("Kết thúc chương trình.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.addStudent();
                    break;
                case 2:
                    controller.writeFile();
                    break;
                case 3:
                    controller.readFile();
                    break;
                case 4:
                    System.out.println("Bye");
                    break;
                 default:
                     System.out.println("chon số từ 1-4.");
            }
            if (choice ==4){
                break;
            }
        }
    }
}
