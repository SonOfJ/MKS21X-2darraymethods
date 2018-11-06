public class ArrayMethods {
  public static int rowSum(int[][] ary, int x) {
    int sum = 0;
    for(int i = 0; i < ary[x].length; i = i + 1) {
      sum = sum + ary[x][i];
    }
    return sum;
  }
}
