package factory;

public class TesteSapato {
	public static void main(String[] args) {
        SapatoFactory factory = new SapatoFactory();
        LojaSapato loja = new LojaSapato(factory);

        // T�nis
        Sapato sapato = loja.encomendarSapato("t�nis");
        System.out.println("O " + sapato.getModelo() + " foi criado!\n");

        // Sapatilha
        sapato = loja.encomendarSapato("sapatilha");
        System.out.println("A " + sapato.getModelo() + " foi criada!\n");
        
        // Bota
        sapato = loja.encomendarSapato("bota");
        System.out.println("A " + sapato.getModelo() + " foi criada!\n");
    }
}
