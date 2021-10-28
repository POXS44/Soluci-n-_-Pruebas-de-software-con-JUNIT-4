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


}
