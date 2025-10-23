package onepiece.creator;

import onepiece.product.AkumaNoMi;

public abstract class AkumaNoMiFactory {

    public abstract AkumaNoMi criarAkumaNoMiType(String tipo) throws IllegalAccessException;
}
