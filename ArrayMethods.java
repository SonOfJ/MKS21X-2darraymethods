public class ArrayMethods {
  public static int rowSum(int[][] ary, int x) {
    if (x >= ary.length) {
      return 0;
    }
    int sum = 0;
    for(int i = 0; i < ary[x].length; i = i + 1) {
      sum = sum + ary[x][i];
    }
    return sum;
  }
  public static int columnSum(int[][] ary, int x) {
    int sum = 0;
    for(int i = 0; i < ary.length; i = i + 1) {
      if (ary[i].length <= x) {
        return 0;
      }
    }
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
  public static int colLength(int[][] ary) {
    int colLength = 0;
    for(int i = 0; i < ary.length; i = i + 1) {
      if (ary[i].length > colLength) {
        colLength = ary[i].length;
      }
    }
    return colLength;
  }
  public static int[] allColSums(int[][] ary) {
    int[] queen = new int[colLength(ary)];
    for(int i = 0; i < colLength(ary); i = i + 1) {
      if (ary[i].length < colLength(ary)) {
      }
      queen[i] = columnSum(ary, i);
    }
    return queen;
  }
  public static boolean isRowMagic(int[][] ary) {
    for(int i = 1; i < ary.length; i = i + 1) {
      if (rowSum(ary, i) != rowSum(ary, 0)) {
        return false;
      }
    }
    return true;
  }
}
