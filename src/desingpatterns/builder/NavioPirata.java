package desingpatterns.builder;

public class NavioPirata {

    private String nomeNavio;
    private String capitao;
    private int tamanhoTripulacao;
    private String carpinteiro;
    private boolean possuiFiguraProa;
    private String armaEspecial;

    private NavioPirata(){
    }

    public String getNomeNavio() {
        return nomeNavio;
    }

    public String getCapitao() {
        return capitao;
    }

    public int getTamanhoTripulacao() {
        return tamanhoTripulacao;
    }

    public String getCarpinteiro() {
        return carpinteiro;
    }

    public boolean isPossuiFiguraProa() {
        return possuiFiguraProa;
    }

    public String getArmaEspecial() {
        return armaEspecial;
    }

    public static class Builder {
        private String nomeNavio;
        private String capitao;
        private int tamanhoTripulacao;
        private String carpinteiro;
        private boolean possuiFiguraProa;
        private String armaEspecial;

        public Builder definirNomeNavio(String nomeNavio) {
            this.nomeNavio = nomeNavio;
            return this;
        }

        public Builder definirCapitao(String capitao) {
            this.capitao = capitao;
            return this;
        }

        public Builder definirTamanhoTripulacao(int tamanhoTripulacao) {
            this.tamanhoTripulacao = tamanhoTripulacao;
            return this;
        }

        public Builder definirCarpinteiro(String carpinteiro) {
            this.carpinteiro = carpinteiro;
            return this;
        }

        public Builder definirFiguraNaProa(boolean possuiFiguraProa) {
            this.possuiFiguraProa = possuiFiguraProa;
            return this;
        }

        public Builder definirArmaEspecial(String armaEspecial) {
            this.armaEspecial = armaEspecial;
            return this;
        }

        public NavioPirata build() {
            NavioPirata navio = new NavioPirata();
            navio.nomeNavio = this.nomeNavio;
            navio.capitao = this.capitao;
            navio.tamanhoTripulacao = this.tamanhoTripulacao;
            navio.carpinteiro = this.carpinteiro;
            navio.possuiFiguraProa = this.possuiFiguraProa;
            navio.armaEspecial = this.armaEspecial;
            return navio;
        }
    }
}
