package handson3;

public class ForEach {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i : angka) {
            if (i % 3 == 0){
                continue;
            }
            if (i > 15){
                break;
            }
            System.out.println(i);
        }
    }
}
