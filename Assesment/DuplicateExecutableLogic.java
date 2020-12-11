package Assesment;

public class DuplicateExecutableLogic {
    public static void main(String[] args)
    {
        RepeatElement repeat = new RepeatElement();
        String[] arr1 = {"B","5","A","8","9","B","1","A","8","8"};
        String[] arr2 = {"5","7","9","9","2","8","A","2","1"};
        int length1 = arr1.length;
        int length2 = arr2.length;
        repeat.printRepeating(arr1,arr2,length1,length2);
    }
}

