package desingpatterns.builder;

public class ConstruirNavio {
    static void main() {

        NavioPirata goingMerry = new NavioPirata.Builder()
                .definirNomeNavio("Going Merry")
                .definirCapitao("Monkey D. Luffy")
                .definirTamanhoTripulacao(10)
                .definirCarpinteiro("Franky")
                .definirFiguraNaProa(true)
                .definirArmaEspecial("Canhão")
                .build();

        IO.println("Navio: " + goingMerry.getNomeNavio());
        IO.println("Capitão: " + goingMerry.getCapitao());
        IO.println("Tripulação: " + goingMerry.getTamanhoTripulacao());
        IO.println("Carpinteiro: " + goingMerry.getCarpinteiro());
        IO.println("Possui figura na proa: " + goingMerry.isPossuiFiguraProa());
        IO.println("Arma especial: " + goingMerry.getArmaEspecial());
    }

}
