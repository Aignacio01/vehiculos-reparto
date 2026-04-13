public class MotoReparto extends Vehiculo {

    // Dato exclusivo de la moto, los otros vehículos no lo tienen
    private boolean tieneCajaTermica;

    // Aquí se crean los datos de la moto
    // super() le manda los datos comunes a la clase Vehiculo
    public MotoReparto(String patente, String marca, String modelo, double capacidadCarga, boolean disponible, boolean tieneCajaTermica) {

        super(patente, marca, modelo, capacidadCarga, disponible); // faltaba el atributo "disponible"
        this.tieneCajaTermica = tieneCajaTermica;
    }

    // Para leer si tiene caja térmica
    public boolean isTieneCajaTermica() {
        return tieneCajaTermica;
    }

    // Para cambiar si tiene caja térmica
    public void setTieneCajaTermica(boolean tieneCajaTermica) {
        this.tieneCajaTermica = tieneCajaTermica;
    }

    // Muestra la información de la moto en consola
    @Override
    public void mostrarDetalle() {
        System.out.println("┌─── MOTO DE REPARTO ─────────────────────────");
        System.out.println("│  Patente       : " + getPatente());
        System.out.println("│  Marca/Modelo  : " + getMarca() + " " + getModelo());
        System.out.println("│  Cap. de Carga : " + getCapacidadCarga() + " kg");
        System.out.println("│  Caja Térmica  : " + (tieneCajaTermica ? "Sí" : "No"));
        System.out.println("│  Estado        : " + (isDisponible() ? "Sí" : "No")); //Estaba llamando mal al atributo "disponible"
        System.out.println("└──────────────────────────────────────────────────");
    }

    // Calcula cuánto combustible consume la moto
    // Las motos consumen menos que camiones y furgones

    /*
    // Este metodo fue comentado porque no existe en la clase padre (Vehiculo),
    // por lo tanto no se puede sobrescribir con @Override.
    // El metrodo es parte del bonus, hay que agregarlo a la clase padre para que funciones
    @Override
    public double calcularConsumoEstimado() {
        return 3.0 + (getCapacidadCarga() * 0.1);
    }

     */
}