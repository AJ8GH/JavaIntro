import java.util.ArrayList;

// can you remember how to set up your main function?
public class Arrays {
  public static void main(String[] args) {
    // declare an array of Strings and print it
    String[] stringArray = {"Hi", "Java", "is", "fun"};
    System.out.println(stringArray);

    String word;
    int i;

    for (i = 0; i < stringArray.length; i++) {
      word = stringArray[i];
      System.out.println(word);
    }

    // declare an array of integers and print it
    Integer[] intArray = {3, 6, 8};
    System.out.println(intArray);

    int number, ii;

    for (ii = 0; ii < intArray.length; ii++) {
      number = intArray[ii];
      System.out.println(number);
    }

    // declare an ArrayList of integers, add numbers to it, and then print it
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println(list);

    for (int iii = 0; iii < list.size(); iii++) {
      System.out.println(list.get(iii));
    }
  }
}
