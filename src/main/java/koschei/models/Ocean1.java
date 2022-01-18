package koschei.models;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    private final Island2 island;
    public Ocean1(@Qualifier("getIsland") Island2 island) {
        this.island = island;
    }

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }

}
