package edu.ellian.ortega.reto1.process.calculadoraimc;
/** esta clase sirve para realizar calculos de masa corporal incluye metodos para indice de masa corporal, masa magra y basal**/
public class CaculadoraMasaCorporal {
    /** este metodo sirve para calcular el indice de masa corprolal en base a peso y altura return indice de masa corporal, estatura del paciente en cm y el peso en kilogramos**/
    public static double calcularIndiceMasaCorporal(double estatura, double peso){
        return peso100/(estatura*estatura);
        estatura/=100;
        return peso/(estatura*estatura);

    }
    public static String clasificarIndiceMasaCorporal(double imc){
        String value = "";
        if (imc<18.9){
            value= "desnutricion";
        }else if (imc<=24.99)
            value = "normal";
        return value;
    }
}
