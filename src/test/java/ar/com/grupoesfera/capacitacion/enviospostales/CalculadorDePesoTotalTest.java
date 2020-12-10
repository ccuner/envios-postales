package ar.com.grupoesfera.capacitacion.enviospostales;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculadorDePesoTotalTest {
    private List<Paquete> paquetes = new LinkedList<>();
    private Paquete paquete = mock(Paquete.class); 
    private CalculadorDePesoTotal calculador = new CalculadorDePesoTotal();
    private Double pesoTotal;

    @Before
    public void setUp(){
        dadoQueLaListaDePaquetesContieneCincoPaquetes();
    }

    @Test
    public void dadoQueElPesoTotalEsDe150() {
        dadoQueCadaPaquetePesa(30);
        cuandoSeEjecutaCalcularPesoTotal();
        entoncesElPesoTotalEs("150");
    }

    private void entoncesElPesoTotalEs(String peso) {
        assertThat(pesoTotal).isEqualTo(new Double(peso));
    }

    private void cuandoSeEjecutaCalcularPesoTotal() {
       pesoTotal = calculador.pesoTotal(paquetes);
    }

    private void dadoQueCadaPaquetePesa(double peso) {
        doReturn(peso).when(paquete).getPeso();
    }
    private void dadoQueLaListaDePaquetesContieneCincoPaquetes() {
        paquetes.add(paquete);
        paquetes.add(paquete);
        paquetes.add(paquete);
        paquetes.add(paquete);
        paquetes.add(paquete);
    }

}
