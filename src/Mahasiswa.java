import java.util.Scanner;

public class Mahasiswa {
    String nama;
    String jurusan;
    String nim;

    public static String tampilUniversitas() {
        return "Universitas Muhammadiyah Malang";
    }

    public String tampilDataMahasiswa() {
        return "Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan;
    }

}