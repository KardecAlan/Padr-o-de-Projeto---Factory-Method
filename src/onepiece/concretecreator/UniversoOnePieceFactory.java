package onepiece.concretecreator;

import onepiece.creator.AkumaNoMiFactory;
import onepiece.concreteproducts.GomuGomuNoMi;
import onepiece.concreteproducts.MeraMeraNoMi;
import onepiece.concreteproducts.NekoNekoNoMi;
import onepiece.product.AkumaNoMi;

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
