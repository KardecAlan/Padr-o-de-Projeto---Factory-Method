package desingpatterns.decorator;

import desingpatterns.decorator.classeconcreta.Luffy;
import desingpatterns.decorator.decoratorconcreto.GearSecond;
import desingpatterns.decorator.decoratorconcreto.HakiArmamento;
import desingpatterns.decorator.interfacebase.Pirata;

public class Main {
    public static void main(String[] args) {

        Pirata luffy = new Luffy();
        IO.println(luffy.atacar());
        System.out.println("Poder: " + luffy.poder());

        Pirata luffyGear2 = new GearSecond(luffy);
        IO.println(luffyGear2.atacar());
        IO.println("Poder: " + luffyGear2.poder());

        Pirata luffyCompleto = new HakiArmamento(luffyGear2);
        IO.println(luffyCompleto.atacar());
        IO.println("Poder: " + luffyCompleto.poder());
    }
}
