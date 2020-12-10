package ar.com.grupoesfera.capacitacion.enviospostales;

import java.util.List;

public class CalculadorDePesoTotal {
    public Double pesoTotal(List<Paquete> paquetes) {
        return paquetes.stream().mapToDouble(i -> i.getPeso()).sum();
    }
}
