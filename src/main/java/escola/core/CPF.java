package escola.core;

public class CPF {
    private String cpf;

    public CPF(String cpf) {
        if (cpf == null || !cpf.matches("^([0-9]{3}\\.?){3}-?[0-9]{2}$")) {
            throw new IllegalArgumentException("CPF invalido");
        }
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
