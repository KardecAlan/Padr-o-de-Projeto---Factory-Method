package desingpatterns.proxy.realsubject;

import desingpatterns.proxy.subject.Pirata;

public class Luffy implements Pirata {
    @Override
    public void falarComLuffy() {
        IO.println("Luffy: Oi! Eu serei o Rei dos Piratas!!!");
    }
}
