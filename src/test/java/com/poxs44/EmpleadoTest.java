package com.poxs44;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTest {
    @Test
    public void probarSalariovendedor()
    {
        Empleado ev = new Empleado();
        Assert.assertEquals(1360.0, ev.calcularSalarioBruto("vendedor",2000,8),0.001);
        Assert.assertEquals(1260.0, ev.calcularSalarioBruto("vendedor",1500,3),0.001);
        Assert.assertEquals(1100.0, ev.calcularSalarioBruto("vendedor",1499.99f,0),0.001);

    }
    @Test
    public void probarSalarioencargado()
    {
        Empleado ec = new Empleado();
        Assert.assertEquals(1760, ec.calcularSalarioBruto("encargado",1250,8),0.001);
        Assert.assertEquals(1600, ec.calcularSalarioBruto("encargado",1000,0),0.001);
        Assert.assertEquals(1560, ec.calcularSalarioBruto("encargado",999.99f,3),0.001);
        Assert.assertEquals(1500, ec.calcularSalarioBruto("encargado",500,0),0.001);
        Assert.assertEquals(1660, ec.calcularSalarioBruto("encargado",0,8),0.001);
    }

    @Test
    public void calcularsalarioneto()
    {
        Empleado sn = new Empleado();
        Assert.assertEquals(1640, sn.calculaSalarioNeto(2000),0.001 );
        Assert.assertEquals(1230, sn.calculaSalarioNeto(1500),0.001 );
        Assert.assertEquals(1259.9916, sn.calculaSalarioNeto(1499.99f),0.001 );
        Assert.assertEquals(1050, sn.calculaSalarioNeto(1250),0.001 );
        Assert.assertEquals(840, sn.calculaSalarioNeto(1000),0.001 );
        Assert.assertEquals(999.99, sn.calculaSalarioNeto(999.99f),0.001 );
        Assert.assertEquals(500, sn.calculaSalarioNeto(500),0.001 );
        Assert.assertEquals(0, sn.calculaSalarioNeto(0),0.001 );
    }
}
