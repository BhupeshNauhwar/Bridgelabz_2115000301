import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {}

class ExpensiveComputation {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int computeSquare(int num) {
        if (cache.containsKey(num)) {
            System.out.println("Returning cached result for: " + num);
            return cache.get(num);
        }
        System.out.println("Computing square for: " + num);
        int result = num * num;
        cache.put(num, result);
        return result;
    }
}

public class CachingExample {
    public static void main(String[] args) {
        ExpensiveComputation computation = new ExpensiveComputation();

        System.out.println(computation.computeSquare(5));
        System.out.println(computation.computeSquare(10));
        System.out.println(computation.computeSquare(5)); // Cached result
        System.out.println(computation.computeSquare(10)); // Cached result
    }
}
