package factory;

public class LojaSapato {
	SapatoFactory factory;

    public LojaSapato(SapatoFactory factory) {
        this.factory = factory;
    }

    public Sapato encomendarSapato(String type) {
        Sapato sapato;

        sapato = factory.criarSapato(type);

        sapato.cortar();
        sapato.montagem();
        sapato.acabamento();
        sapato.encaixotar();

        return sapato;
    }
}
