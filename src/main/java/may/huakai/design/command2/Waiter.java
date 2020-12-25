package may.huakai.design.command2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huakaimay
 * @since: 2020-12-25
 */
public class Waiter {


    private List<Breakfast> breakfasts = new ArrayList<>();

    Waiter setMenu(Breakfast breakfast) {
        breakfasts.add(breakfast);
        return this;
    }

    void cookNotify() {
        breakfasts.forEach(Breakfast::cook);
    }

    @Test
    public void run() {
        this.setMenu(new Noodle()).setMenu(new Wonton()).cookNotify();
    }


}
