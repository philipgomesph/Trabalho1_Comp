package com.example;

public class Token {
    private TokenEnum classe;
    private Value valor;


    public TokenEnum getClasse() {
        return classe;
    }
    public void setClasse(TokenEnum classe) {
        this.classe = classe;
    }
    public Value getValor() {
        return valor;
    }
    public void setValor(Value valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Token { classe..: " + classe + ", valor..: " + valor + " }";
    }
    

}
