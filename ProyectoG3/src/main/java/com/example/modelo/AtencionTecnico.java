import java.util.ArrayList;
import java.util.List;
public class AtencionTecnico {
    private String fechaT;
    private Tecnico tecnico;
}

public AtencionTecnico(String fechaT, Tecnico tecnico) {
        this.fechaT = fechaT;
        this.tecnico = tecnico;
}

    public String getFechaT() {
        return fechaT;
    }

    public void setFechaT(String fechaT) {
        this.fechaT = fechaT;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

public String mostrarAtencionT() {
}

public String toString() {
        return "AtencionTecnico{" + "fecha='" + fechaT + '\'' +", tecnico=" + tecnico.getNombre() +
}