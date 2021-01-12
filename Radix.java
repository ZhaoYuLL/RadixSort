public class Radix{
  public static void main(String[] args){
    System.out.println(nth(123,1));
    System.out.println(nth(-123,1));
    System.out.println(nth(123,2));
    System.out.println(nth(-123,2));
    System.out.println();
    System.out.println(length(0));
    System.out.println(length(15));
    System.out.println(length(-10));
    System.out.println(length(11111111));

  }
  public static int nth(int n, int col){
    return (int) (Math.abs(n) / Math.pow(10, col)) % 10;
  }

  public static int length(int n){
    if(n==0){
      return 0;
    }
    return (int) (Math.log10(Math.abs(n)) + 1);
  }

  public static void merge(MyLinkedist original,MyLinkedList[] buckets){

  }
}
