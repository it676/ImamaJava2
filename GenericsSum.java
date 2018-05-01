
/**
 *
 * @author IT676
 */
public class GenericsSum {

    public static void main(String[] args) {

        Integer[] integers = {10, 3, 1, 7, 8};
        System.out.println(sum(integers));//-->  18.0

        Double[] doubles = {7.8 , 2.5 , 4.8 , 6.9};
        System.out.println(sum(doubles));//--> 12.0
    }

    /*-Write a generic method to find the sum of even/odd numbers in an array*/
    public static <T extends Number> Double sum(T[] array) {

        Double total = 0.0;

        for (Number item : array) {

            double value = item.doubleValue();

             //better to cast to int cuz the value is double , not that great much with mod operator %
            if ((int)value % 2 == 0) {

                total += (int)value;
            }

        }

        return total;

    }

}
