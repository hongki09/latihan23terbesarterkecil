/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan23terbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author M Hongki Alfikram
 * Kelas : IF10-K
 * NIM :10119915
 */
public class PBO1010119915Latihan23TerbesarTerkecil {

    static int mahasiswa;
    static float min, max;
    static double[] nilai_mahasiswa;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner value_input = new Scanner(System.in);
        int mahasiswa, i;
        String petugas;
        float total = 0;
        int maks = -1000; //asumsi paling minimum
        int min = 1000; //asumsi paling maksimum
        System.out.println("=============== Program Nilai Terbesar dan Terkecil Mahasiswa:===============");
        System.out.print("Masukan Nama Petugas : ");
        petugas = value_input.nextLine();
        System.out.print("Jumlah Mahasiswa: ");
        mahasiswa = value_input.nextInt();

        int[] nilai_mahasiswa = new int[mahasiswa];
        Scanner input_nilai = new Scanner(System.in);
        for (i = 0; i < mahasiswa; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilai_mahasiswa[i] = input_nilai.nextInt();
        }
        System.out.println();
        System.out.println("====== Hasil Nilai Mahasiswa ======");
        for (i = 0; i < nilai_mahasiswa.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilai_mahasiswa[i]);            
            if (nilai_mahasiswa[i] > maks) {
                maks = nilai_mahasiswa[i];
            }
            if (nilai_mahasiswa[i] < min) {
                min = nilai_mahasiswa[i];
            }
            total = total + nilai_mahasiswa[i];
        }
        System.out.println();
        System.out.println("Nilai Maksimum " + maks);
        System.out.println("Nilai Minimum " + min);
        
        System.out.println();
        System.out.println("Petugas " + petugas);
    }
}