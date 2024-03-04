package repository;

import java.util.List;

// we will work with differents type. ( generics type was made for this.)
// T and ID don´t exist(we create to be T class model and ID its type ID of the class model.)
public interface IRepository<T, ID> {
    // who implements type T have to say whats it and whats type id.
    // we have to search a generetic type T
    List<T> searchAll();
    // method register have to return T generic type model and receive the model to register.
    T register(T model);

    T searchById(ID id);
    // emthod excludesById return the ID type model as true or false.
    boolean excludesById(ID id);
}
