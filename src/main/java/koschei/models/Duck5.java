package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    private final Egg6 egg;
    @Autowired
    public Duck5(@Qualifier("getEgg") Egg6 egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
