package desingpatterns.proxy;

import desingpatterns.proxy.proxy.ZoroProxy;
import desingpatterns.proxy.subject.Pirata;

public class ThousandSunny {
    public static void main(String[] args) {
        Pirata acesso = new ZoroProxy();
        acesso.falarComLuffy();
    }
}
