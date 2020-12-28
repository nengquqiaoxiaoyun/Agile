package may.huakai.design.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huakaimay
 * @since: 2020-12-28
 */
public class ConcreteMediator extends AbsMediator {
    private List<AbsColleague> colleagueList = new ArrayList<>();

    @Override
    void register(AbsColleague absColleague) {
        colleagueList.add(absColleague);
    }

    @Override
    void relay() {

    }
}
