package ss7.thuc_hanh.implement_the_comparator_interface_to_compare_geometric_classes;

import ss6.thuc_hanh.he_cac_doi_tuong_trong_hinh_hoc.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        return Double.compare(c1.getRadius(), c2.getRadius());
    }
}
