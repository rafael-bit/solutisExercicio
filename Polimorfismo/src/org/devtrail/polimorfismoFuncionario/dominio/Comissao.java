package org.devtrail.polimorfismoFuncionario.dominio;

public class Comissao {
    public static final double COMISSAO_GERENTE = 1500.00;
    public static final double COMISSAO_SUPERVISOR = 600.00;
    public static final double COMISSAO_VENDEDOR = 250.00;

    public static double obterComissao(String cargo) {
        switch (cargo.toUpperCase()) {
            case "GERENTE":
                return COMISSAO_GERENTE;
            case "SUPERVISOR":
                return COMISSAO_SUPERVISOR;
            case "VENDEDOR":
                return COMISSAO_VENDEDOR;
            default:
                return 0.0;
        }
    }
}