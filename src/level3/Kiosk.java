package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 키오스크 프로그램의 메뉴를 관리 순서 제어
    // 사용자 입력을 처리
    //start 기능
    private List<MenuItem> menuItems;

    public Kiosk(List<level3.MenuItem> menuItems) {
        this.menuItems = menuItems;
    }


    public void start() {
        // Scanner 선언
        Scanner scanner = new Scanner(System.in);

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        while (true) {
            System.out.println("\n[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i));
            }
            System.out.println("0. 종료");

            System.out.println("원하는 메뉴 번호 입력해주세요.: ");
            int selection = scanner.nextInt();

            if (selection == 0){
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if (selection > 0 && selection <= menuItems.size()) {
                MenuItem selectMenu = menuItems.get(selection - 1); // 리스트 인덱스 번호로 값 부름
                System.out.println("\n선택한 메뉴 :  " + selectMenu);
            } else {
                System.out.println("올바른 번호를 입력해 주세요!");
            }

        }
    }



}
