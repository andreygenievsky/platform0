package g.a.platform.model;

import java.sql.Timestamp;

public interface Auditable<T, U> extends Undeletable<T> {

    U getCreatedBy();
    void setCreatedBy(U createdBy);

    U getLastModifiedBy();
    void setLastModifiedBy(U lastModifiedBy);

    U getDeletedBy();
    void setDeletedBy(U deletedBy);

    Timestamp getCreateDatetime();
    void setCreateDatetime(Timestamp createDatetime);

    Timestamp getLastModifyDatetime();
    void setLastModifyDatetime(Timestamp modifyDatetime);
}
