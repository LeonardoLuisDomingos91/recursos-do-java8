package Exercicio_3_InterfaceFuniconal;

@FunctionalInterface
public interface ComparaNome<T> {
    // criei essa interface e usei a anotação @FunctionInterface com ela vc garante que ninguem mais vai criar nessa interface outro metodo abstrato
    boolean valida(T t);
}
