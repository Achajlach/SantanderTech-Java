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

    
      double sum = 0;
      Iterator<Integer> iteration = numberList.iterator();
      while (iteration.hasNext()) {
          sum += iteration.next();
      }
      double average = sum / numberList.size();
      System.out.println("Average = " + average);
    }

        
}