package desingpatterns.factorymethod.concreteproducts;

import desingpatterns.factorymethod.product.AkumaNoMi;

public class GomuGomuNoMi implements AkumaNoMi {

    @Override
    public void nomeFruta() {
        IO.println("Gomo Gome no Mi");
    }

    @Override
    public void usarPoder() {
        IO.println("Poder da borracha");
    }
}
