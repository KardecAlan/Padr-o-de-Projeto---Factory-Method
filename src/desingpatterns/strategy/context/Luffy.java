package desingpatterns.strategy.context;

import desingpatterns.strategy.strategy.EstiloDeLuta;

public class Luffy {

    private EstiloDeLuta estiloDeLuta;

    public Luffy(EstiloDeLuta estiloInicial) {
        this.estiloDeLuta = estiloInicial;
    }

    public void setEstiloDeLuta(EstiloDeLuta novoEstilo) {
        this.estiloDeLuta = novoEstilo;
    }

    public void atacar() {
        estiloDeLuta.atacar();
    }
}
