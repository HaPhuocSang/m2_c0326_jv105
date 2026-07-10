package ss10.bai_tap.lesson4.untils;

import ss10.bai_tap.lesson4.entity.Manufacturer;
import ss10.bai_tap.lesson4.entity.enums.CarType;
import ss10.bai_tap.lesson4.repository.manufacturer.IManufacturerRepository;
import ss10.bai_tap.lesson4.repository.manufacturer.ManufacturerRepository;

import java.util.List;
import java.util.Scanner;

public class InputUntil {
    private final static Scanner scanner = new Scanner(System.in);
    private final static IManufacturerRepository manufacturerRepository = new ManufacturerRepository();
    private final static List<Manufacturer> manufacturers = manufacturerRepository.findAll();

    public static int inputInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên!");
            }
        }
    }

    public static boolean confirmDelete() {
        final int YES = 1;
        final int NO = 2;
        while (true) {
            System.out.println("""
                    ======== Xác nhân xóa =========
                         1. Yes
                         2. No
                    """);
            int choice = InputUntil.inputInt("------ Quyết định! ------");
            switch (choice) {
                case YES:
                    return true;
                case NO:
                    return false;
                default:
                    System.out.println("------ Không có lựa chọn này! ------");
            }
        }
    }

    public static String inputString(String message) {
        while (true) {
            System.out.print(message);
            String value = scanner.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("Không được để trống, vui lòng nhập lại!");
        }
    }

    public static String selectManufacturerName() {
        final int YAMAHA = 1;
        final int HONDA = 2;
        final int DONGFENG = 3;
        final int HUYNDAI = 4;
        final int FORD = 5;
        final int TOYOTA = 6;
        final int HINO = 7;
        while (true) {
            System.out.println("""
                    ======== Danh sách hãng xe =========
                         1. Yamaha
                         2. Honda
                         3. Dongfeng
                         4. Huyndai
                         5. Ford
                         6. Toyota
                         7. Hino
                    """);
            int choice = InputUntil.inputInt("------ Chọn hãng sản xuất! ------");
            switch (choice) {
                case YAMAHA:
                    return manufacturers.get(0).getManufacturerName();
                case HONDA:
                    return manufacturers.get(1).getManufacturerName();
                case DONGFENG:
                    return manufacturers.get(2).getManufacturerName();
                case HUYNDAI:
                    return manufacturers.get(3).getManufacturerName();
                case FORD:
                    return manufacturers.get(4).getManufacturerName();
                case TOYOTA:
                    return manufacturers.get(5).getManufacturerName();
                case HINO:
                    return manufacturers.get(6).getManufacturerName();
                default:
                    System.out.println("------ Không có lựa chọn này! ------");
            }
        }
    }

    public static CarType selectCarType() {
        final int TOURISM = 1;
        final int COACH = 2;
        while (true) {
            System.out.println("""
                    ======== Danh sách hãng xe =========
                         1. Xe du lịch
                         2. Xe khách
                    """);
            int choice = InputUntil.inputInt("------ Chọn loại xe! ------");
            switch (choice) {
                case TOURISM:
                    return CarType.TOURISM;
                case COACH:
                    return CarType.COACH;
                default:
                    System.out.println("------ Không có lựa chọn này! ------");
            }
        }
    }

    public static String checkLicensePlate(String message, String regex) {
        String licensePlate;
        do {
            licensePlate = inputString(message);
            if (!licensePlate.matches(regex)) {
                System.out.println("Biển kiểm soát không đúng định dạng!");
            }
        } while (!licensePlate.matches(regex));
        return licensePlate;
    }

    public static String checkLicensePlateForMotorbike(String message) {
        return checkLicensePlate(message, "^\\d{2}-(?:[A-Z]{2}|[A-Z]\\d|\\d[A-Z])-\\d{3}\\.\\d{2}$");
    }

    public static String checkLicensePlateForCar(String message) {
        return checkLicensePlate(message, "^\\d{2}[A-Z]-(?:\\d{2}|\\d{3})\\.(?:\\d{2}|\\d{3})$");
    }

    public static String checkLicensePlateForTruck(String message) {
        return checkLicensePlate(message, "^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$");
    }

}
