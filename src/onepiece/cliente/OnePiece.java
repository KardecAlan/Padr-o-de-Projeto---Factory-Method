package onepiece.cliente;

import onepiece.product.AkumaNoMi;
import onepiece.creator.AkumaNoMiFactory;
import onepiece.concretecreator.UniversoOnePieceFactory;


public class OnePiece {
    public static void main(String[] args) throws IllegalAccessException {
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