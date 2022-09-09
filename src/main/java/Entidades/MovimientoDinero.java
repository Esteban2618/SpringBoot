package Entidades;

public class MovimientoDinero {
    private int monto, montoPositivo, montoNegativo;
    private String conceptoMovimiento;
    private Usuario usuario;

    public MovimientoDinero(int monto, int montoPositivo, int montoNegativo, String conceptoMovimiento, Usuario usuario) {
        this.monto = monto;
        this.montoPositivo = montoPositivo;
        this.montoNegativo = montoNegativo;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuario = usuario;
    }
    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getMontoPositivo() {
        return montoPositivo;
    }

    public void setMontoPositivo(int montoPositivo) {
        this.montoPositivo = montoPositivo;
    }

    public int getMontoNegativo() {
        return montoNegativo;
    }

    public void setMontoNegativo(int montoNegativo) {
        this.montoNegativo = montoNegativo;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}