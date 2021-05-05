import java.util.*;
class Main {
    public static void main(String[] args) {


      ArrayList<Integer> numberList = new ArrayList<>();
      numberList.add(12);
      numberList.add(12);
      numberList.add(22);
      numberList.add(4);
      numberList.add(6);
      numberList.add(95);

    
      int max = numberList.get(0);

      // store the length of the ArrayList in variable n
      int n = numberList.size();

      for (int i = 1; i < n; i++) {
        if (numberList.get(i) > max) {
            max = numberList.get(i);
        }
    }

        System.out.println(max);

    }
}