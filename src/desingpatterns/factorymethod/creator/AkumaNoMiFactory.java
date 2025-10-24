package desingpatterns.factorymethod.creator;

import desingpatterns.factorymethod.product.AkumaNoMi;

public abstract class AkumaNoMiFactory {

    public abstract AkumaNoMi criarAkumaNoMiType(String tipo) throws IllegalAccessException;
}
