package g.a.platform.model;

import java.util.Objects;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractModel<T> implements Model<T>  {

    @Override
    public boolean equals(Object o) {
        return this == o
                || o != null && getClass().equals(o.getClass()) && Objects.equals(getId(), ((AbstractModel) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), getId());
    }

}
