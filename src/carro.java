public class carro {
    private float strength;
    private float distance;
    private int ano;
    private String marca;

    public carro(float strength, float distance, int ano, String marca, String nome) {
        this.strength = strength;
        this.distance = distance;
        this.ano = ano;
        this.marca = marca;
        this.nome = nome;
    }

    private String nome;

    public float getStrength() {
        return strength;
    }

    public void setStrength(float strength) {
        this.strength = strength;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
