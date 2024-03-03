package repository;

import java.util.List;

// T and ID don´t exist(we create to be T class model and ID of the class model)
public interface IRepository<T, ID> {
    List<T> searchAll();
    // T our class model 
    T register(T model);

    T searchById(ID id);
    boolean excludesById(ID id);
}
