package ss7.thuc_hanh.implement_the_comparable_interface_for_geometric_classes;

import ss6.thuc_hanh.he_cac_doi_tuong_trong_hinh_hoc.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return Double.compare(getRadius(), o.getRadius());
    }
}
