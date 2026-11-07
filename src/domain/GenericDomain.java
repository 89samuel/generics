package domain;
import java.util.Objects;

public interface GenericDomain<T> {

    T getId();

    public void setId(final T id);

    /* @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GenericDomain<?> that = (GenericDomain<?>) o;
        return Objects.equals(id, that.id);
    }

   @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "GenericDomain{" +
                "id=" + id +
                '}';
    }*/
}
