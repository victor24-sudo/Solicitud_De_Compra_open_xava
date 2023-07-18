package calculadores;

import static org.openxava.jpa.XPersistence.getManager;

import org.openxava.calculators.*;

import com.tuempresa.solicitudcompra.modelo.*;

import lombok.*;

public class CalcularPrecio implements ICalculator {

	
	@Getter @Setter
    int numeroRequisito;
 
    @Override
    public Object calculate() throws Exception {
        Requisito requisito = getManager() // getManager() de XPersistence
            .find(Requisito.class, numeroRequisito); // Busca el producto
        return requisito.getPrecio();    // Retorna su precio
    }
}
