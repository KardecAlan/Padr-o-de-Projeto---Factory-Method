package onepiece.concreteproducts;

import onepiece.product.AkumaNoMi;

import static java.lang.System.*;

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
