package Training;
import java.util.function.BiPredicate;
public class BiPredicateDemo {
	public static void main(String[] args) {
        BiPredicate<Integer, Integer> isSumGreaterThanTen = (num1, num2) -> (num1 + num2) > 10;

        System.out.println(isSumGreaterThanTen.test(5, 6));   
        System.out.println(isSumGreaterThanTen.test(6, 3));   
    }

}
