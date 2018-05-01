
public class GenericsConcat {

    public static void main(String[] args) {

        String[] strings1 = {"Sara", "Khalid"};
        String[] strings2 = {"Amal", "Rayan"};

        
        Object[] all = concat(strings1, strings2);

        for (Object s : all) {

            System.out.print(s + " , ");
        }
        /*
         Output : 
         Sara , Khalid , Amal , Rayan ,
         */
    }

    //1-Write a generic method to concat two arrays of the same type into one single array
    public static <T> T[] concat(T[] arr1, T[] arr2) {

        //size
        int size = arr1.length + arr2.length;

        //create the array
        T[] array = (T[]) new Object[size];

        //index counter 
        int indexCounter = 0;
        //copy items i--->i
        for (T item : arr1) {
            array[indexCounter++] = item;
        }

        for (T item : arr2) {
            array[indexCounter++] = item;
        }
        //you can imporve the code to use a single loop insted of two loops

        //return the array contained all items of arr1 and arr2
        return array;
    }
}
