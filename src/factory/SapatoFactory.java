package factory;

public class SapatoFactory {
	public Sapato criarSapato(String tipo) {
        Sapato sapato = null;

        if (tipo.equals("tênis")) {
            sapato = new TenisSapato();
        } else if (tipo.equals("bota")) {
            sapato = new BotaSapato();
        } else if (tipo.equals("sapatilha")) {
            sapato = new SapatilhaSapato();
        } else if (tipo.equals("mocassim")) {
            sapato = new MocassimSapato();
        } 
        return sapato;
    }
}
