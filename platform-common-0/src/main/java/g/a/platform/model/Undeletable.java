package g.a.platform.model;

import java.sql.Timestamp;

import static java.util.Objects.isNull;

public interface Undeletable<T> extends Model<T> {

    //TODO: check type of datetime
    Timestamp getDeleteDatetime();

    void setDeleteDatetime(Timestamp datetime);

    default boolean isDeleted() { return isNull(getDeleteDatetime()); }
}
