package main;
import java.util.Scanner;

public class MainClass {
    // 스캐너를 이용하여
    // 1. 학생등록
    // 2. 학생상세조회
    // 3. 학생목록 조회
    // 를 서택하는 코드를 작성합시다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("=============");
            System.out.println("학생등록");
            System.out.println("학생상세조회");
            System.out.println("학생목록 조회");
            System.out.println("=============");
            System.out.println("선택할 번호> ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("학생등록");
//                  케이스 내용에 이어줄 코드
                case 2:
                    System.out.println("학생상세 조회");

                case 3:
                    System.out.println("학생목록 조회");

                default:
                    System.out.println("잘못 선택 하셨습니다.");

            }
        }sc.close();
    }
}
