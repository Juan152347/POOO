import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.Calendar;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

import control.ControlAgencia;
import entity.Cliente;
import entity.Ecologico;
import entity.Empresarial;
import entity.Reserva;
import entity.Tour;
import enu.TipoEmpresa;

class ControlAgenciaTest {
    ControlAgencia ca=new ControlAgencia();
    //exitosa ecologico
	@Test
	void testecologico() {
	ca.llenarTours();
	HashMap<Long, Tour>ecologicos=ca.ecologico();
	assertNotNull(ecologicos.get((long)4569874));
	}
	//no exitosa ecologico
	@Test
	void testecologicof() {
	ca.llenarTours();
	HashMap<Long, Tour>ecologicos=ca.ecologico();
    assertNotNull(ecologicos.get((long)6532148));
	}
	//empresarial exitoso
	@Test
	void testempresarial() {
    Calendar c= Calendar.getInstance();
    Calendar c1=Calendar.getInstance();
    c1.set(Calendar.HOUR_OF_DAY, 0);
	c1.set(Calendar.MINUTE, 0);
	c1.set(Calendar.SECOND, 0);
	c1.set(Calendar.MILLISECOND, 0);
    Date s1=c1.getTime();
	c1.set(2020, 2, 5);
	Date r1=c.getTime();
	c1.set(2020, 3, 20);
    Tour t1=new Tour("Tour1","Lugar1",r1,s1,1000);
    Cliente cl1=new Cliente("nombre1","1111111");
    c1.set(2020, 7, 6);
    Date s3=c.getTime();
    c1.set(2020, 8, 6);
    Date r3=c.getTime();
    Empresarial t3=new Empresarial("Tour3","Lugar3",r3,s3,2000,"e1",true,TipoEmpresa.TECNOLOGIA);
	Reserva r =new Reserva(c,true,2,t1,cl1);
	Reserva re1= new Reserva(c,false,5,t3,cl1);
	ca.getReservas().put((long)5555, r);
	ca.getReservas().put((long)6666, re1);
	HashMap<Long,Reserva> empresarial=ca.reservaEmpresarial();
	assertNotNull(empresarial.get((long)6666));
	assertNull(empresarial.get((long)5555));
	}
	//empresarial no exitoso
	@Test
	void testempresarialf() {
    Calendar c= Calendar.getInstance();
    Calendar c1=Calendar.getInstance();
    c1.set(Calendar.HOUR_OF_DAY, 0);
	c1.set(Calendar.MINUTE, 0);
	c1.set(Calendar.SECOND, 0);
	c1.set(Calendar.MILLISECOND, 0);
    Date s1=c1.getTime();
	c1.set(2020, 2, 5);
	Date r1=c1.getTime();
	c1.set(2020, 3, 20);
    Tour t1=new Tour("Tour1","Lugar1",r1,s1,1000);
    Cliente cl1=new Cliente("nombre1","1111111");
    c1.set(2020, 7, 6);
    Date s3=c1.getTime();
    c1.set(2020, 8, 6);
    Date r3=c1.getTime();
    Empresarial t3=new Empresarial("Tour3","Lugar3",r3,s3,2000,"e1",true,TipoEmpresa.TECNOLOGIA);
	Reserva r =new Reserva(c,true,2,t1,cl1);
	Reserva re1= new Reserva(c,false,5,t3,cl1);
	ca.getReservas().put((long)5555, r);
	ca.getReservas().put((long)6666, re1);
	HashMap<Long,Reserva> empresarial=ca.reservaEmpresarial();
	assertNull(empresarial.get((long)6666));
	assertNotNull(empresarial.get((long)5555));
	}
	//precioReservasToursEcologicosPorFecha exitoso
	@Test
	void precioReservasToursEcologicosPorFecha() {
		Calendar c= Calendar.getInstance();
		c.set(2020, 5, 2);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
	    Calendar c1=Calendar.getInstance();
	    c1.set(Calendar.HOUR_OF_DAY, 0);
		c1.set(Calendar.MINUTE, 0);
		c1.set(Calendar.SECOND, 0);
		c1.set(Calendar.MILLISECOND, 0);
	    Date s1=c1.getTime();
		c1.set(2020, 2, 5);
		Date r1=c1.getTime();
		c1.set(2020, 3, 20);
	    Tour t1=new Tour("Tour1","Lugar1",r1,s1,1000);
	    Cliente cl1=new Cliente("nombre1","1111111");
	    c1.set(2020, 7, 6);
	    Date s3=c1.getTime();
	    c1.set(2020, 8, 6);
	    Date r3=c1.getTime();
	    Reserva r =new Reserva(c,true,2,t1,cl1);
	    Ecologico t2=new Ecologico("Tour2","Lugar2",r3,s3,1500,true,500,false);
	    Reserva re1= new Reserva(c,false,5,t2,cl1);
	    ca.getReservas().put((long)5555, r);
		ca.getReservas().put((long)6666, re1);
		Calendar c2=Calendar.getInstance();
		c2.set(2020, 4, 2);
		Calendar c3=Calendar.getInstance();
		c3.set(2020, 6, 2);
		double p=ca.precioReservasToursEcologicosPorFecha(c2, c3);
		double pe=3000;
		assertEquals(pe, p);
	}
	//precioReservasToursEcologicosPorFecha no exitoso
	@Test
	void precioReservasToursEcologicosPorFechaf() {
		Calendar c= Calendar.getInstance();
		c.set(2020, 5, 2);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
	    Calendar c1=Calendar.getInstance();
	    c1.set(Calendar.HOUR_OF_DAY, 0);
		c1.set(Calendar.MINUTE, 0);
		c1.set(Calendar.SECOND, 0);
		c1.set(Calendar.MILLISECOND, 0);
	    Date s1=c1.getTime();
		c1.set(2020, 2, 5);
		Date r1=c1.getTime();
		c1.set(2020, 3, 20);
	    Tour t1=new Tour("Tour1","Lugar1",r1,s1,1000);
	    Cliente cl1=new Cliente("nombre1","1111111");
	    c1.set(2020, 7, 6);
	    Date s3=c1.getTime();
	    c1.set(2020, 8, 6);
	    Date r3=c1.getTime();
	    Reserva r =new Reserva(c,true,2,t1,cl1);
	    Ecologico t2=new Ecologico("Tour2","Lugar2",r3,s3,1500,true,500,false);
	    Reserva re1= new Reserva(c,false,5,t2,cl1);
	    ca.getReservas().put((long)5555, r);
		ca.getReservas().put((long)6666, re1);
		Calendar c2=Calendar.getInstance();
		c2.set(2020, 4, 2);
		Calendar c3=Calendar.getInstance();
		c3.set(2020, 6, 2);
		double p=ca.precioReservasToursEcologicosPorFecha(c2, c3);
		double pe=3000;
		assertNotEquals(pe, p);
	}
}
