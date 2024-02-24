import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        String name;
        String gender;
        Scanner objInput = new Scanner(System.in);
        System.out.print("Nama: ");
        name = objInput.nextLine();
        System.out.print("Jenis Kelamin (P/L): ");
        gender = objInput.nextLine();
        System.out.print("Tanggal Lahir (yyyy-MM-dd): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateOfBirthDay = LocalDate.parse(objInput.nextLine(),formatter);

        System.out.println("\nNama: " + name);
        System.out.print("Jenis Kelamin: ");
        if (gender.equalsIgnoreCase("P")) {
            System.out.println("Perempauan");
        } else {
            System.out.print("Laki-laki");
        }
        Period period = Period.between(dateOfBirthDay, LocalDate.now());
        System.out.println("Umur Anda: " + period.getYears() + " tahun " + period.getMonths() + " bulan");

    }
}