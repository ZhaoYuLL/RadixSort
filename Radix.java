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

    public static void radixSortSimple(SortableLinkedList data){

      int maxValue = 0;
      for(int i = 0; i < data.size(); i ++){ //loop through data to get maxValue
          if (data.get(i) > maxValue){
            maxValue = data.get(i);
          }
      }
      int mostDigits = length(maxValue); //e.g 432, mostdigits would be 3
      SortableLinkedList[] buckets = new SortableLinkedList[10];
      for(int i = 0; i < 10; i ++){
        buckets[i] = new SortableLinkedList();
      }

      for(int i = 0; i < mostDigits; i ++){
        while(data.size()>0){
          int ele = data.get(0  );
          int digit = nth(ele,i);
          buckets[digit].add(ele);
          data.remove(0);
        }
        merge(data,buckets);
      }

  }

    public static void radixSort(SortableLinkedList data){
      SortableLinkedList nonNegative = new SortableLinkedList();
      SortableLinkedList negative = new SortableLinkedList();

      for(int i = 0; i < data.size(); i ++){
        if(data.get(i)>=0){
          nonNegative.add(data.get(i));
        }
        else{
          negative.add(data.get(i) * -1);
        }
      }

      radixSortSimple(nonNegative);
      radixSortSimple(negative);

      for(int i = data.size() -1; i >= 0; i--){
        data.remove(i);
      }
      for (int i = negative.size() - 1; i >= 0; i--) {
        data.add(negative.get(i) * -1);
      }

      data.extend(nonNegative);
    }



  }
