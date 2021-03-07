import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stringChangeImpl implements stringChange{
    @Override
    public String concatenateString(String string1) {

        List<String> ls = Arrays.asList(string1);
        ls = ls.stream().map(s -> s.replaceAll(" ","").toUpperCase()).collect(Collectors.toList());
        System.out.println(ls.toString());
        return null;
    }
}
