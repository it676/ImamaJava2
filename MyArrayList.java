
class MyArrayList<E extends Comparable<E>> {

    private E[] list;
    private int counter;

    public MyArrayList(int size) {

        list = (E[]) new Comparable[size];//upper bound 
        counter = 0;
    }

    public int size() {

        return counter;
    }

    public boolean isEmpty() {

        return counter == 0;
    }

    public boolean add(E item) {

        if (counter == list.length) {

            return false;
        }

        list[counter++] = item;
        return true;

    }

    public E remove(int index) {

        //validate the index
        E item = list[index];

        for (int i = index; i < counter - 1; i++) {

            list[i] = list[i + 1];
        }

        list[--counter] = null;

        return item;
    }

    public E get(int index) {

        //validation
        return list[index];
    }

    public int search(E key) {

        for (int i = 0; i < counter; i++) {

            if (list[i].compareTo(key) == 0) {
                return i;
            }
        }

        return -1;

    }

    /*
     [10 , 5 , 6 , 8 ,]
     */
    @Override
    public String toString() {

        String str = "[ ";

        int c = 1;
        for (E ele : list) {

            if (c == counter) {
                str += ele;
            } else {
                str += ele + " , ";
            }
        }

        return str + "]";
    }
}

class Demo {

    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList(10);

        System.out.println(list.size());//0
        System.out.println(list.isEmpty());//true

        list.add("Sara");

        list.add("Nora");

        list.add("Rayan");

        System.out.println(list.size());//3
        System.out.println(list.isEmpty());//fasle

        System.out.println(list.search("Sara"));//0

        System.out.println(list.get(1));//Nora

        System.out.println(list.remove(2));//Rayan
        System.out.println(list.size());//2

    }
}
