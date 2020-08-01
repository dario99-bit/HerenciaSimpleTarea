/*
Diseñe e implemente un algoritmo que le permita conocer el modelo del equipo de 
medición, presición y rongo de funcionamiento.
 */
package herenciasimpletarea1;

/**
 *
 * @author DARIO CHISAGUANO AIMACAÑA.
 */
class EquipoMedicion{
    double valor_precision;
    double valor_condicion;
    
    void MostrarInformacionEquipo(){
        System.out.println("La precisión de medición es de:"
                + valor_precision+ "%" + 
                        "\nCondición de Funcionamiento de: "+valor_condicion+ "%");
        
    }
}

// Herencia simple: Una subclase de EquipoMedición es Osciloscopio Auntomotriz
class OsciloscopioAutomotriz extends EquipoMedicion{
    String tipo;
    
    double CalcularRango(){
        return valor_precision*valor_condicion;
        
    }
       void mostrarTipoEquipo(){
           System.out.println("El tipo de equipo de medición es:"+tipo);
       }   
}
// Herencia simple: Una subclase de EquipoMedicion es Analizador de gases de Escape
class AnalizadorGasEscape extends EquipoMedicion{
    String tipo;
    
    double CalcularRango(){
         return valor_precision*valor_condicion;
}
    void mostrarTipoEquipo(){
        System.out.println("El tipo de equipo de medición es:"+tipo);
    }
}

public class HerenciaSimpleTarea1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    OsciloscopioAutomotriz precision1=new OsciloscopioAutomotriz();
    AnalizadorGasEscape condicion1=new AnalizadorGasEscape();
    
     precision1.valor_precision=15;
     precision1.valor_condicion=85;
     precision1.tipo= "Osciloscopio Automotriz TeKtronix" ;
    
    condicion1.valor_precision=15;
    condicion1.valor_condicion=90;
    condicion1.tipo= "Analizador de Gases de Escape FGA4000XDS" ;
    
    
    System.out.println("Información del Equipo de Medición:");
    precision1.mostrarTipoEquipo();
    precision1.MostrarInformacionEquipo();
    System.out.println("El rango de Funcionamiento es de : " +precision1.CalcularRango()
            +" Revoluciones por minuto ");
    System.out.println();
    
    
    System.out.println("Información del Equipo de Medición: ");
    condicion1.mostrarTipoEquipo();
    condicion1.MostrarInformacionEquipo();
    System.out.println("El rango de Funcionamiento es de :" +condicion1.CalcularRango()
            + " Revoluciones por minuto ");
         
    }
    
}


    


























