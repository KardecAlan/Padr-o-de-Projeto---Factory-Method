package desingpatterns.factorymethod.concretecreator;

import desingpatterns.factorymethod.creator.AkumaNoMiFactory;
import desingpatterns.factorymethod.concreteproducts.GomuGomuNoMi;
import desingpatterns.factorymethod.concreteproducts.MeraMeraNoMi;
import desingpatterns.factorymethod.concreteproducts.NekoNekoNoMi;
import desingpatterns.factorymethod.product.AkumaNoMi;

public class UniversoOnePieceFactory extends AkumaNoMiFactory {

    @Override
    public AkumaNoMi criarAkumaNoMiType(String tipo) throws IllegalAccessException {
        return switch (tipo) {
            case "PARAMECIA" -> new GomuGomuNoMi();
            case "ZOAN" -> new NekoNekoNoMi();
            case "LOGIA" -> new MeraMeraNoMi();
            default -> throw new IllegalAccessException("Fruta desconhecida");
        };
    }
}
