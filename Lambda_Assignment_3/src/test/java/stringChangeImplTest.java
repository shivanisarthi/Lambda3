import org.junit.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class stringChangeImplTest {

    @org.junit.jupiter.api.Test
    void concatenateString() {
        String s1="hello there";
        List<String> ls = (List<String>) Arrays.asList(s1);
        ls = ls.stream().map(s -> s.replaceAll(" ","").toUpperCase()).collect(Collectors.toList());
        Assert.assertEquals("[HELLOTHERE]",ls.toString());

    }
}