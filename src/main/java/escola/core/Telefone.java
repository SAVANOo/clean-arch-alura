package escola.core;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if ((ddd == null) || !ddd.matches("^[0-9]{2}")) {
            throw new IllegalArgumentException("DDD Inválido");
        }
        if ((numero == null) || !numero.matches("^([0-9]{8}|[0-9]{9})")) {
            throw new IllegalArgumentException("Numero Inválido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
