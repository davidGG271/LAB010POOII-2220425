public class NumeroCelular {
    private String numero;

    public NumeroCelular(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "NumeroCelular{" +
                "numero='" + numero + '\'' +
                '}';
    }
}
