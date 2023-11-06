import java.util.Scanner;

public class tugasmatriks {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

        System.out.println("Masukkan Jumlah Baris: ");
        int baris = input.nextInt();
        System.out.println("Masukkan Jumlah Kolom: ");
        int Kolom = input.nextInt();

     int matriks [] [] = new int [baris] [Kolom];
     for (int i=0; i < matriks.length; i++) {
    for (int j = 0; j < matriks[i].length; j++) {
        System.out.println("Masukkan Nilai Matriks: ");
        matriks[i] [j] = input.nextInt();

        
    
}
} 
for (int i =0; i < matriks.length; i++) {
for (int j = 0; j < matriks[i].length; j++) {
    System.out.print(matriks[i] [j] + ",");
    }
    System.out.println();
} 
    }
}

