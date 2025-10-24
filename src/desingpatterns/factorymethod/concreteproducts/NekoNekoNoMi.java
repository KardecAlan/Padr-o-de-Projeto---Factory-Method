package desingpatterns.factorymethod.concreteproducts;

import desingpatterns.factorymethod.product.AkumaNoMi;

public class NekoNekoNoMi implements AkumaNoMi {

    @Override
    public void nomeFruta() {
        IO.println("Neko Neko no Mi");
    }

    @Override
    public void usarPoder() {
        IO.println("Poder de se transformar em Leopardo!");
    }
}
