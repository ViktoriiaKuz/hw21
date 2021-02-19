import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Supplierr {


    public static void main(String[] args) {

        Supplier <Integer> supplier = () -> {
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new Random().nextInt(-10);
        };

        Stream.generate(supplier)
                .map(n -> n*n*n)
                .filter(n->n >100)
                .limit(100)
                .forEach(System.out::println);
    }
}
