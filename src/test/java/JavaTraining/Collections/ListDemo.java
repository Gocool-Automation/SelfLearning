package JavaTraining.Collections;

import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        String[] myarray = {"Apple", "Banana", "Cherry"};
        List<String> li = Arrays.asList(myarray);

        System.out.println(li);
    }
}
