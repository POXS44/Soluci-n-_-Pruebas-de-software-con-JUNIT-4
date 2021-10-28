package com.poxs44;

public class Empleado {


   public float calcularSalarioBruto ( String TipoEmpleado, float ventasMes, float hExtras)
    {
        if(TipoEmpleado==("vendedor"))
        {
            float stotal ;
            float salariobruto = 0;
            float salario = 1000;

            if (ventasMes <1000){
                float menos;
                menos = (hExtras *20)+salariobruto;
                return menos + salario;
            }
            if(ventasMes>=1000 || ventasMes<= 1499)
            {
               salariobruto=  salario + 100;
            }
            if(ventasMes >=1500)
            {
                salariobruto = salario +200;
            }
          stotal = (hExtras *20)+salariobruto;
            return stotal;
        }
        else if (TipoEmpleado==("encargado"))
        {
            float salario = 1500;
            float stotal ;
            float salariobruto = 0;

            if (ventasMes <1000){
               float menos;
                menos = (hExtras *20)+salariobruto;
                return menos + salario;
            }
            if(ventasMes>=1000 || ventasMes<= 1499)
            {
                salariobruto= salario + 100;
            }
            if(ventasMes >=1500)
            {
                salariobruto = salario +200;
            }

            stotal = (hExtras *20)+salariobruto;
            return stotal;
        }

        return 0;
    }

   public  double calculaSalarioNeto(float salarioBruto)
    {

        // Primera condicion si el salario bruto es menor que 1000 dolares no habra retencion
        if (salarioBruto <1000)
        {
            return salarioBruto;
        }
        // Si salario esta entre 1000 y 1500 retencion del 16%
        if(salarioBruto >= 1000 && salarioBruto< 1500)
        {
            double retencion = salarioBruto * 0.16 ;
            return salarioBruto - retencion ;
        }
        // Si salario esta entre 1000 y 1500 retencion del 16%
        if(salarioBruto >= 1500)
        {
            double retencion = salarioBruto * 0.18 ;
            return salarioBruto - retencion;
        }

        return 0;
    }

}
