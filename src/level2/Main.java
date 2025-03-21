package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(new MenuItem("ShackBurger", 8000, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 10000, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 8000, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 6500, "비프패티를 기반으로 야채가 들어간 기본버거"));

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
        // 숫자를 입력 받기
        // 입력된 숫자에 따른 처리
        // 프로그램을 종료
        // 선택한 메뉴 : 이름, 가격, 설명

    }
}
