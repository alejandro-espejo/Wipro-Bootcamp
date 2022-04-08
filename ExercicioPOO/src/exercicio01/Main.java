package exercicio01;

public class Main {

    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        ControleRemoto.diminuirVolume(televisao);
        ControleRemoto.aumentarVolume(televisao);
        ControleRemoto.aumentarVolume(televisao);
        ControleRemoto.consultaVolumeECanal(televisao);
        ControleRemoto.irParaCanal(televisao, 50);
        ControleRemoto.irParaCanal(televisao, 100);
        ControleRemoto.aumentarCanal(televisao);
        ControleRemoto.consultaVolumeECanal(televisao);
    }
}
