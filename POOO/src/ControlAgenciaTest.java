import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import control.ControlAgencia;
import entity.Tour;

class ControlAgenciaTest {
    ControlAgencia ca=new ControlAgencia();
	@Test
	void testecologico() {
	ca.llenarTours();
	HashMap<Long, Tour>ecologicos=ca.ecologico();
	assertNull(ecologicos.get(4569874));
    //assertNull(ecologicos.get(6532148));
	}

}
