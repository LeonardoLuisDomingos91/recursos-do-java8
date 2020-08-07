package Exercicio_3_InterfaceFuniconal;

@FunctionalInterface
public interface ComparaNome<T> {
    boolean valida(T t);

    default void compara(T t){

    }


}
