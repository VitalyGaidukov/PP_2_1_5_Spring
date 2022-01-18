package koschei.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    @Qualifier("getRabbit")
    private final Rabbit4 rabbit;

    public Wood3(@Qualifier("getRabbit") Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
