package models;

public class Podcast extends Audio {

    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getTotalDeReproducoes() {
        if(this.getTotalDeReproducoes() > 10000) {
            return 5;
        } else if(this.getTotalDeReproducoes() > 5000) {
            return 4;
        } else if(this.getTotalDeReproducoes() > 1000) {
            return 3;
        } else if(this.getTotalDeReproducoes() > 500) {
            return 2;
        } else {
            return 1;
        }
    }
}
