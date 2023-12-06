package jaeger.de.isabella.snippets;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateRandomNumbersTest {

    @Test
    void TestWithGenerateRandomNumbers() {
        List<Integer> tafels = new ArrayList<>();
        tafels.add(1);
        tafels.add(9);
        List<String> listOfTafels = createTafels(tafels);

        Collections.shuffle(listOfTafels);
        System.out.println(listOfTafels);
    }
    List<String> createTafels(List<Integer> tafels) {
        List<String> result = new ArrayList<>();
        tafels.forEach(i -> result.addAll(createTafel(i)));
        return result;
    }
    List<String> createTafel(int i) {
        List<String> tafel = new ArrayList<>();
        for (int j = 1; j <= 10; j++) {
            tafel.add(i + "*" + j + "=" + (i * j));
        }
        return tafel;
    }

}
