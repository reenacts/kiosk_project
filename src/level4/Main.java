package level4;

import level4.Kiosk;
import level4.MenuItem;
import level4.Menu;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        Menu burgerMenu = new Menu("Burger");
        burgerMenu.addItem(new MenuItem("ShackBurger", 8000, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("SmokeShack", 10000, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("Cheeseburger", 8000, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("Hamburger", 6500, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinkMenu = new Menu("Drink");
        // Coke, Diet Coke, Root Beer, Iced Tea, Lemonade
        drinkMenu.addItem(new MenuItem("Coke",1500, "펩시"));
        drinkMenu.addItem(new MenuItem("Diet Coke",1500, "펩시 제로 라임맛"));
        drinkMenu.addItem(new MenuItem("Iced Tea",2000, "복숭아"));
        drinkMenu.addItem(new MenuItem("Lemonade",3500, "생 레몬에이드"));
        drinkMenu.addItem(new MenuItem("Root Beer",4000, "파울러 생맥"));

        Menu sideMenu = new Menu("Side");
        //French Fries, Onion Rings, Sweet Potato Fries, Side Salad
        sideMenu.addItem(new MenuItem("French Fries",2700, "감자 튀김"));
        sideMenu.addItem(new MenuItem("Onion Rings",3500, "양파 링"));
        sideMenu.addItem(new MenuItem("Sweet Potato Fries",3500, "고구마 튀김"));
        sideMenu.addItem(new MenuItem("Side Salad",4000, "사이드 샐러드"));

        // 메뉴 관리
        List<Menu> menus = new ArrayList<>();
        menus.add(burgerMenu);
        menus.add(drinkMenu);
        menus.add(sideMenu);


        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();

    }
}
