
public class GenericSquared {

    public static void main(String[] args) {

        Integer[] integers = {10, 3, 1, 7, 8};

        for (Number i : squareItems(integers)) {

            System.out.println(i);
        }
        System.out.println("--------------");
        Double[] doubles = {10.5, 3.3, 1.2, 7.7, 8.2};

        for (Number i : squareItems(doubles)) {

            System.out.printf("%.2f%n", i);
        }

        System.out.println("--------------");
        System.out.println(squareItem(6));
        System.out.printf("%.2f%n", squareItem(4.6));
    }

    /*
     Write a generic method to update each number in an array to the squared
     */
    public static <T extends Number> Number[] squareItems(T[] list) {

        Number[] numbers = new Number[list.length];

        for (int i = 0; i < list.length; i++) {

            //get value
            Double item = list[i].doubleValue();

            //square
            Double square = Math.pow(item, 2);

            //cast
            numbers[i] = square;

        }

        return numbers;

    }

    /*
     Write a generic method to aqure a a number
     */
    public static <T extends Number> Double squareItem(T item) {

        return Math.pow(item.doubleValue(), 2);
    }
}
