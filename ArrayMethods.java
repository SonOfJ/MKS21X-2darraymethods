public class ArrayMethods {
  public static int rowSum(int[][] ary, int x) {
    if (x >= ary.length || x < 0) {
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
      if (x < ary[i].length) {
        sum = sum + ary[i][x];
      }
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
  public static int greatestIndex(int[][] ary) {
    int index = 0;
    for(int i = 0; i < ary.length; i = i + 1) {
      if (ary[i].length > index) {
        index = ary[i].length;
      }
    }
    return index;
  }
  public static int[] allColSums(int[][] ary) {
    int[] queen = new int[greatestIndex(ary)];
    for(int i = 0; i < greatestIndex(ary); i = i + 1) {
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
  public static boolean isColumnMagic(int[][] ary) {
    for(int i = 1; i < greatestIndex(ary); i = i + 1) {
      if (columnSum(ary, i ) != columnSum(ary, 0)) {
        return false;
      }
    }
    return true;
  }
}
