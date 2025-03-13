package level5;

import level5.Menu;
import level5.MenuItem;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menuList;

    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
    }

    // 캡슐화
    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    // 키오스크 로직
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[SHAKESHAKE MENU CATEGORY]");
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i+1) +"."+menuList.get(i).getCategoryName());
            }
            System.out.println("0. 종료");

            System.out.println("원하시는 카테고리의 번호를 입력해 주세요.: ");
            int categorySelection = scanner.nextInt();

            if (categorySelection == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (categorySelection < 1 || categorySelection > menuList.size()){
                System.out.println("올바른 번호를 입력해 주세요!!");
                continue;
            }

            Menu selectedMenu = menuList.get(categorySelection - 1); // 인데스처리
            List<MenuItem> items = selectedMenu.getMenuItems();

            System.out.println("[ " + selectedMenu.getCategoryName() + " MENU ]");
            for (int i =0; i < items.size(); i++){
                System.out.println((i + 1) + ". " + items.get(i));
            }

            System.out.println("0. 뒤로가기");

            System.out.println("주문할 메뉴 번호를 입력해주세요.: ");
            int menuSelection = scanner.nextInt();

            if (menuSelection == 0) {
                continue;
            } else if (menuSelection < 0 || menuSelection > items.size()) {
                System.out.println("올바른 번호를 입력해주세요!");
                continue;
            } else {
                System.out.println("선택한 메뉴 " + items.get(menuSelection - 1).getName() + " 가(이) 장바구니에 담겼습니다!!");
            }

        }
    }



}
