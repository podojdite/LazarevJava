public class Test3 {
    public static void main(String[] args) {
        int[] nArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.print("Четные числа в массиве: ");
        for (int i = 0; i < nArr.length; i++)
            System.out.print(nArr[i] % 2 == 0 ? nArr[i] + " " : "");
    }
}