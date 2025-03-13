package level4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 카테고리 이름 필드 추가
    // MenuItem 클래스를 List로 관리
    private String categoryName;
    private List<MenuItem> items;

    //생성자
    public Menu(String categoryName){
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    public String getCategoryName(){
        return categoryName;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public List<MenuItem> getMenuItems() {
        return items;
    }


    // List에 포함된 MenuItem을 순차적으로 보여주는 함수
    // List를 리턴하는 함수
    public void seeTheMenuItem() {
        for (int i = 0; i < items.size(); i++) {
            System.out.print((i+1) + ".");
            System.out.println(items.get(i));
        }
    }
}
