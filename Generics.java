
interface Predicate<T> {

    boolean test(T input);
}

class StringLength implements Predicate<String> {

    @Override
    public boolean test(String str) {

        return str.length() % 2 == 0;

    }
}

class DiscountApplicable implements Predicate<Double> {

    @Override
    public boolean test(Double price) {

        return price >= 500;

    }
}

interface Function<T, R> {

    R apply(T input);
}

class GetStringLength implements Function<String, Integer> {

    @Override
    public Integer apply(String str) {

        Integer length = str.length();

        return length;

    }

}

class Demo {

    public static void main(String[] args) {

        Predicate<String> str = new StringLength();
        Predicate<Double> discount = new DiscountApplicable();

        System.out.println(str.test("Rayan"));//false
        System.out.println(discount.test(600.0));//true
        System.out.println(discount.test(200.0));//fasle

        Function<String, Integer> function = new GetStringLength();

        System.out.println(function.apply("Rayan"));

    }
}
