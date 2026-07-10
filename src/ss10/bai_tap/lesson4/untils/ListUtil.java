package ss10.bai_tap.lesson4.untils;

import ss10.bai_tap.lesson4.common.HasLicensePlate;

import java.util.List;

public class ListUtil {
    public static <T extends HasLicensePlate> boolean checkId(List<T> list, String id) {
        for (T item : list) {
            if (item.getLicensePlate().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends HasLicensePlate> int findIndex(List<T> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLicensePlate().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
