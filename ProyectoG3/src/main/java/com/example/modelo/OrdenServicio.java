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

    public void agregarServicio()
}
