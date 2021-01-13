public class Radix{

  public static int nth(int n, int col){
    return (int) (Math.abs(n) / Math.pow(10, col)) % 10;
  }

  public static int length(int n){
    if(n==0){
      return 0;
    }
    return (int) (Math.log10(Math.abs(n)) + 1);
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets){
    for(int i = 0; i < buckets.length; i ++){
      original.extend(buckets[i]);
    }
  }
  public static void insertionSort(int[] data){
    for(int i = 1; i < data.length; i ++){
      int j = i;
      while(j > 0 && data[j-1]>data[j]){
        int temp = data[j];
        data[j]=data[j-1];
        data[j-1] = temp;
        j -=1;
      }
    }
  }
  public static void radixSortSimple(SortableLinkedList data){

    int maxValue = 0;
    for(int i = 0; i < data.size(); i ++){ //loop through data to get maxValue
        maxValue = Math.max(data.get(i),maxValue);
    }
    int mostDigits = length(maxValue); //e.g 432, mostdigits would be 3
    for(int i = 0; i < mostDigits; i ++){
      SortableLinkedList zero = new SortableLinkedList();
      SortableLinkedList one = new SortableLinkedList();
      SortableLinkedList two = new SortableLinkedList();
      SortableLinkedList three = new SortableLinkedList();
      SortableLinkedList four = new SortableLinkedList();
      SortableLinkedList five = new SortableLinkedList();
      SortableLinkedList six = new SortableLinkedList();
      SortableLinkedList seven = new SortableLinkedList();
      SortableLinkedList eight = new SortableLinkedList();
      SortableLinkedList nine = new SortableLinkedList();    //create buckets everytime, first pass for one's digit, 2nd for 2nd, third for 3rd
    }
    for(int j = 0; j < data.size(); j ++){ //loop through data to sort
      int digit = nth(data.get(j),j);  //gets ones place, added according to where. This is a stable sort too
      for(int i = 0; i <= 9; i++){
        if(digit == i){

        }
      }
    }
  }

}
