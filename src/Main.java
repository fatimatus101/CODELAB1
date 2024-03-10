import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tampilkan Data Mahasiswa");
        System.out.println("3. Keluar");
    }

    public static void tambahDataMahasiswa() {
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        while (nim.length() < 15) {
            System.out.print("NIM harus 15 digit!!! \nMasukkan NIM mahasiswa: ");
            nim = scanner.nextLine();
        }
        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = nama;
        mahasiswa.nim = nim;
        mahasiswa.jurusan = jurusan;
        daftarMahasiswa.add(mahasiswa);
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    public static void tampilkanDataMahasiswa() {
        System.out.println("Data Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(Mahasiswa.tampilUniversitas());
            System.out.println(mahasiswa.tampilDataMahasiswa());
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    tambahDataMahasiswa();
                    break;
                case 2:
                    tampilkanDataMahasiswa();
                    break;
                case 3:
                    System.out.println("Adios");
                    System.exit(0);
                default:
                    System.out.println("Pilihan Anda salah.");
            }
        }
    }
}