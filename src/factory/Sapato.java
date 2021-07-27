package factory;

import java.util.ArrayList;

abstract public class Sapato {
    String modelo;
    String cor;
    ArrayList materiais = new ArrayList();

    public String getModelo() {
    	return modelo;
    }

    public void cortar() {
        System.out.println("Cortando os materiais: " + modelo);
    }

    public void montagem() {
        System.out.println("Montando: " + modelo);
    }

    public void acabamento() {
        System.out.println("Fazendo o acabamento: " + modelo);
    }

    public void encaixotar() {
        System.out.println("Encaixotando: " + modelo);
    }
}