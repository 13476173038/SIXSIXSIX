package dt59homework;

public class paixu {
    public static void main(String[] args) {

        int abc[] = new int[] { 54, 33, 76, 98, 67, 54, 32 };
        for (int u = 0; u < abc.length - 1; u++) {
            for (int k = 0; k < abc.length - 1 - u; k++) {
                if (abc[k] > abc[k + 1]) {
                    int temp = abc[k];
                    abc[k] = abc[k + 1];
                    abc[k + 1] = temp;
                }
            }
        }
        for (int m : abc) {
            System.out.print(m + "\t");
        }
    }
}
