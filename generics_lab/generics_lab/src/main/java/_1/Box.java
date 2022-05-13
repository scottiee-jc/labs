package _1;

public class Box<T> {

    private final Box<T> box = new Box<>();

    public Box() {
    }

    public Box<T> getBox() {
        return box;
    }

    public void setBox() {
        Box<Integer> boxForIntegersOnly = new Box();
    }

}
