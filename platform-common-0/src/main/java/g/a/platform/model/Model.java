package g.a.platform.model;

public interface Model<T> extends Identifiable<T> {
    void setId(T id);
}
