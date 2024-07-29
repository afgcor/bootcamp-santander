package dio.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("O robô está se movendo agressivamente.");
    }
}
