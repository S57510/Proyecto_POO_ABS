import java.util.ArrayList;
import java.util.List;

public class OrdenServicio {
    private String identificacionCliente;
    private String fechaServicio;
    private String tipoVehiculo;
    private String placaVehiculo;
    private List<DetalleOrden> detalles;
    private double total;
    private Tecnico tecnicoAsignado;

    public OrdenServicio(String identificacionCliente, String fechaServicio, String tipoVehiculo, String placaVehiculo) {
        this.identificacionCliente = identificacionCliente;
        this.fechaServicio = fechaServicio;
        this.tipoVehiculo = tipoVehiculo;
        this.placaVehiculo = placaVehiculo;
        this.detalles = new ArrayList<>();
        this.total = 0;
    }

     public String getIdentificacionCliente() {
        return identificacionCliente;
    }

    public String getFechaServicio() {
        return fechaServicio;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public List<DetalleOrden> getDetalles() {
        return new ArrayList<>(detalles); 
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Orden para cliente " + identificacionCliente + " con " + detalles.size() + " servicios - Total: $" + total;
    }

    public void agregarServicio(Servicio servicio, int cantidad){

    }
}
