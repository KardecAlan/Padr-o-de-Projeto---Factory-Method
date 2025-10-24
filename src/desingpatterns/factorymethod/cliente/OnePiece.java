package desingpatterns.factorymethod.cliente;

import desingpatterns.factorymethod.product.AkumaNoMi;
import desingpatterns.factorymethod.creator.AkumaNoMiFactory;
import desingpatterns.factorymethod.concretecreator.UniversoOnePieceFactory;


public class OnePiece {
    static void main() throws IllegalAccessException {
        AkumaNoMiFactory factory = new UniversoOnePieceFactory();

        AkumaNoMi frutaLogia = factory.criarAkumaNoMiType("LOGIA");
        frutaLogia.nomeFruta();
        frutaLogia.usarPoder();

        AkumaNoMi frutaParameciaria = factory.criarAkumaNoMiType("PARAMECIA");
        frutaParameciaria.nomeFruta();
        frutaParameciaria.usarPoder();

        AkumaNoMi frutaZoan = factory.criarAkumaNoMiType("ZOAN");
        frutaZoan.nomeFruta();
        frutaZoan.usarPoder();

    }
}