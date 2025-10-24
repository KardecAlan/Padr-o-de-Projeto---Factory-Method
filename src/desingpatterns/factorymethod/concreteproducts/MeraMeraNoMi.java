package desingpatterns.factorymethod.concreteproducts;

import desingpatterns.factorymethod.product.AkumaNoMi;

public class MeraMeraNoMi implements AkumaNoMi {

    @Override
    public void nomeFruta() {
        IO.println("Mera Mera no Mi");
    }

    @Override
    public void usarPoder() {
        IO.println("Poder das chamas!");

    }
}
