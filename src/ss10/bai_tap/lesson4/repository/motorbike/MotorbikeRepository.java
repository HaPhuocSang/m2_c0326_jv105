package ss10.bai_tap.lesson4.repository.motorbike;

import ss10.bai_tap.lesson4.entity.Motorbike;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository implements IMotorbikeRepository{
    private final static List<Motorbike> motorbikes = new ArrayList<>();
    static {
        motorbikes.add(new Motorbike("43-K1-678.56","Yamaha",2019,"Nguyễn Văn A",100));
        motorbikes.add(new Motorbike("43-H1-345.89","Honda",2019,"Nguyễn Văn B",150));
        motorbikes.add(new Motorbike("43-AK-765.23","Yamaha",2019,"Nguyễn Văn C",50));
    }
    @Override
    public List<Motorbike> findAll() {
        return motorbikes;
    }

    @Override
    public void add(Motorbike motorbike) {
        motorbikes.add(motorbike);
    }

    @Override
    public void edit(int index, Motorbike motorbike) {
        motorbikes.set(index, motorbike);
    }

    @Override
    public void delete(int index) {
        motorbikes.remove(index);
    }
}
