package com.projeto.calculadora.modelo;

@FunctionalInterface
public interface MemoriaObservador {

    public void valorAlterado(String novoValor);
}
