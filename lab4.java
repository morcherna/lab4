import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
//Написать программу, удаляющую из вещественного массива A размерности N «лишние» элементы так,
//чтобы оставшиеся элементы оказались упорядоченными по возрастанию (начиная от первого
//элемента): первый элемент не удаляется, второй элемент удаляется, если он меньше первого, третий —
//если он меньше предыдущего элемента, оставленного в массиве, и т. д. Например, массив 5.5, 2.5, 4.6,
//7.2, 5.8, 9.4 должен быть преобразован к виду 5.5, 7.2, 9.4. а экран должны выводиться как
//оригинальное состояние массива, так и итоговое.
public class lab4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = input.nextInt();
        float[] AnOrigArray = new float[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            AnOrigArray[i] = input.nextFloat();
        }
        List<String> result = new ArrayList<>();
        int a = 1;
        String str = Float.toString(AnOrigArray[0]);
        result.add(str);
        float x = AnOrigArray[0];
        while (a < (AnOrigArray.length-1)){
            if (x <= AnOrigArray[a+1]) {
                String str1 = Float.toString(AnOrigArray[a+1]);
                result.add(str1);
                x = AnOrigArray[a+1];
            }
            a++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print (" " + AnOrigArray[i]);
        }
        System.out.println();
        System.out.println(result);
    }
}
