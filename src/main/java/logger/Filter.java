package logger;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = MyLogger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (var number: source) {
            if(number < treshold) {
                logger.log(String.format("Элемент %d не проходит", number));
                continue;
            }
            logger.log(String.format("Элемент %d проходит", number));
            result.add(number);
        }
        logger.log(String.format("Прошло фильтр %d элемента из %d", result.size(), source.size()));
        return result;
    }
}