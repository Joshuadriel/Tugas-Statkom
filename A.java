import java.util.Scanner;
public class A {
    /**
     * Sorting array dari yang terkecil ke terbesar
     * @param arr = kumpulan data yang ingin diolah
     * @return arr yang sudah disorting kembali
     */
    public static double[] sorting(double arr[])
    {
        // Metode sorting: Selection sort
        for (int i = 0; i < arr.length - 1; i++)
        {
            double min = arr[i];
            int pos = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < min)
                {
                    min = arr[j];
                    pos = j;
                }
            }
            double temp = arr[i];
            arr[i] = min;
            arr[pos] = temp;
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Import scanner
        double arr[] = new double[24]; // Array untuk menyimpan nilai-nilai datanya
        // Looping untuk memasukkan setiap data ke dalam array
        for (int i = 0; i < 24; i++)
        {
            arr[i] = sc.nextDouble();
        }

        // Mengolah data
        arr = sorting(arr); // Menyortir array terlebih dahulu dari yang terkecil ke terbesar

        sc.close(); // Menutup scanner;
    }
}