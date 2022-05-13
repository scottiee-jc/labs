package _3_generic_interface;

public interface GenericInterface<T, S> {
   S doSomeOperations(T t);
   T doReverseOperations(S s);

}
