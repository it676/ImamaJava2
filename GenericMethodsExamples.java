
class Student implements java.lang.Comparable<Student> {

    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student std2) {

        if (this.gpa == std2.gpa) {
            return 0;
        } else if (this.gpa > std2.gpa) {
            return 1;
        } else {
            return -1;
        }

    }

    
    @Override
    public String toString(){
        
        return String.format("%s\t%.2f",name , gpa);
    }
}

class Test {

    public static void main(String[] args) {

        Student[] students = {
            new Student("Sara ", 2.90),
            new Student("Amal ", 3.30),
            new Student("Rayan ", 4.80),
            new Student("Hind ", 4.70)};
        

        Integer[] numbers = {10,5,7,8,2,0};
        String[] names = {"Sara","Amal","Bedoor","Rahaf","Naif","Yara","Zayed"};
        
        
        
        printArray(students);
        System.out.println("After Sorting ....");
        sort(students);
         printArray(students);
        
         System.out.println(min(students));
         System.out.println(min(numbers));
         System.out.println(min(names));
        
    }
    
    
    public static <T> void printArray(T[] list){
        
        for(T item : list){
            
            System.out.println(item);
        }
        
    }

    
    public static<T extends java.lang.Comparable<T>> T min(T[] list) {
        
        T min = list[0];
        
        for(T ele : list){
            
            
            if(ele.compareTo(min) > 0){
                min = ele;
            }
        }
        
        return min;
    }
    public static <T extends java.lang.Comparable<T>> void sort(T[] list) {

        int n = list.length;

        for (int i = 0; i < n - 1; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                 
                  if(list[j].compareTo(list[j+1]) < 0 ){
                      
                      //swap 
                      T temp = list[j];
                      list[j] = list[j+1];
                      list[j+1]= temp;
                     
                  }
            }
        }

    }
}
