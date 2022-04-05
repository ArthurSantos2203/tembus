package com.digitech.tembus.layoutAdapter;

public class TemBusLayoutAdapter {

    private String nome;
    private String via;

    public TemBusLayoutAdapter(String nome, String via){
        this.nome = nome;
        this.via = via;

    }

    public TemBusLayoutAdapter(String s) {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVia(){
        return via;
    }

    public void setVia(String via) {
        this.via = via;

    }


}
