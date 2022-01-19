class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Main mn = new Main();

    int[] A = {1,1,1};
    int[] B = {};

    int[] retArr = mn.mergeArrays(A, B);

    for(int i : retArr) {
      System.out.print(" " + i);  
    }
  }

  private int[] mergeArrays(int[] A, int[] B) {


    if((A == null || A.length == 0) && (B == null || B.length == 0)) {
      return new int[0];
    } else if(A == null || A.length == 0) {
      return B;
    } else if (B == null || B.length == 0){
      return A;
    }

    int[] retArr = new int[A.length + B.length];

    int firstIndex = 0;
    int secIndex = 0;
    for(int i = 0; i < retArr.length; i++) {
      if(firstIndex == A.length) {
        retArr[i] = B[secIndex];
        secIndex++;
      } else if(secIndex == B.length) {
        retArr[i] = A[firstIndex];
        firstIndex++;
      } else if(A[firstIndex] < B[secIndex]) {
        retArr[i] = A[firstIndex];
        firstIndex++;
      } else {
        retArr[i] = B[secIndex];
        secIndex++;
      }
    }
   return retArr;
  }
}