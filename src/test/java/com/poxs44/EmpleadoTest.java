package com.poxs44;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTest {
    @Test
    public void probarSalario()
    {
        Empleado ei = new Empleado();
        Assert.assertEquals(1360.0, ei.calcularSalarioBruto("vendedor",2000,8),0.001);
    }
}
