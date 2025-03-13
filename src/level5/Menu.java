package level5;

import level5.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName;
    private List<MenuItem> items;

    public Menu(String categoryName){
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    //캡슐화
    public String getCategoryName(){
        return categoryName;
    }

    public String setCategoryName(){
        return this.categoryName;
    }

    public List<MenuItem> getMenuItems() {
        return items;
    }

    public List<MenuItem> setMenuItems() {
        return this.items;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void seeTheMenuItem() {
        for (int i = 0; i < items.size(); i++) {
            System.out.print((i+1) + ".");
            System.out.println(items.get(i));
        }
    }
}
