package vlasov.math.geometry;

//Task4_1

import vlasov.other.CloneableMethod;

import java.util.Objects;

public class Point<T extends Number> implements CloneableMethod {
    T x;
    T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public void setX(T x) {
        this.x = x;
    }
    public void setY(T y) {
        this.y = y;
    }
    public T getX() {
        return x;
    }
    public T getY() {
        return y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (!Objects.equals(x, point.x)) return false;
        return Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        int result = x.intValue();
        result = 31 * result + y.intValue();
        return result;
    }

    @Override
    public Point<T> clone() throws CloneNotSupportedException {
        return (Point<T>)super.clone();
    }
}
