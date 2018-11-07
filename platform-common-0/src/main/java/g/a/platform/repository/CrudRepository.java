package g.a.platform.repository;

import g.a.platform.model.Model;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface CrudRepository<ID, T extends Model<ID>> {

    long count();

    Optional<T> findById(ID id);
    List<T> findByIds(Collection<ID> ids);
    List<T> findList();

    T create(T entity);
    default Collection<T> create(Collection<T> entities) {
        entities.forEach(this::create);
        return entities;
    }

    T update(T entity);
    default Collection<T> update(Collection<T> entities) {
        entities.forEach(this::update);
        return entities;
    }

    boolean delete(T entity);
    default long delete(Collection<T> entities) {
        return entities.stream().map(this::delete).filter(x -> x.equals(true)).count();
    }
}
