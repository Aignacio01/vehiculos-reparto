public class MotoReparto extends Vehiculo {

    private boolean tieneCajaTermica;

    public MotoReparto(String patente, String marca, String modelo, double capacidadCarga, boolean tieneCajaTermica) {
        super(patente, marca, modelo, capacidadCarga);
        this.tieneCajaTermica = tieneCajaTermica;
    }

    public boolean isTieneCajaTermica() { return tieneCajaTermica; }

    public void setTieneCajaTermica(boolean tieneCajaTermica) {
        this.tieneCajaTermica = tieneCajaTermica;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("┌─── 🏍️  MOTO DE REPARTO ─────────────────────────");
        System.out.println("│  Patente       : " + getPatente());
        System.out.println("│  Marca/Modelo  : " + getMarca() + " " + getModelo());
        System.out.println("│  Cap. de Carga : " + getCapacidadCarga() + " kg");
        System.out.println("│  Caja Térmica  : " + (tieneCajaTermica ? "Sí" : "No"));
        System.out.println("│  Estado        : " + estadoDisponibilidad());
        System.out.println("└──────────────────────────────────────────────────");
    }

    @Override
    public double calcularConsumoEstimado() {
        // Motos consumen mucho menos: base 3 litros/100km
        return 3.0 + (getCapacidadCarga() * 0.1);
    }
}
