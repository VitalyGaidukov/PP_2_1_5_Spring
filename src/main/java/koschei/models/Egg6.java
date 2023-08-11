package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    @Autowired
    @Qualifier("getNeedle")
    private Needle7 needle;

    public Egg6(@Qualifier("getNeedle") Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }

    @Autowired
    @Qualifier("getNeedle")
    public void setNeedle(Needle7 needle){
        this.needle = needle;
    }
}
