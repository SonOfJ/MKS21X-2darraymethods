public class ArrayMethods {
  public static int rowSum(int[][] ary, int x) {
    int sum = 0;
    for(int i = 0; i < ary[x].length; i = i + 1) {
      sum = sum + ary[x][i];
    }
    return sum;
  }
  public static int columnSum(int[][] ary, int x) {
    int sum = 0;
    for(int i = 0; i < ary[i].length; i = i + 1) {
      sum = sum + ary[i][x];
    }
    return sum;
  }
  public static int[] allRowSums(int[][] ary) {
    int[] king = new int[ary.length];
    for(int i = 0; i < ary.length; i = i + 1) {
      king[i] = rowSum(ary , i);
    }
    return king;
  }
  public static int[] allColSums(int[][] ary) {
    int colLength = 0;
    for(int i = 0; i < ary.length; i = i + 1) {
      if (ary[i].length > colLength) {
        colLength = ary[i].length;
      }
    }
    int[] queen = new int[colLength];
    for(int i = 0; i < colLength; i = i + 1) {
      queen[i] = columnSum(ary, i);
    }
    return queen;
  }
}
