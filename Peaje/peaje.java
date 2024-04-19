// Proposito: seleccionar tipo de veiculo y en concordancia 
// asignada pasaje y salta a la ejecucuon que sigue segun.
// Autor: Alixandra Plata
// Fecha:19/04/24
package peaje;
import java.util.Scanner;
import java.util.scanner;
public class principal {
public void peaje(){
    // defino objeto scanner
    Scanner teclado = new Scanner (System.in);
    //definir variable de salida
    float tarifa;
    // definir variable de entrada
    int tipo_veiculo;
    System.out.println  ("*****************************************");
    System.out.println  ("      TIPO DE VEICULO                "    );                                             
	System.out.println  ( "****************************************");
	System.out.println  ("* 1) Turismo ($500.00)                    "); 
	System.out.println  ("* 2) Autobus ($3000.00)                   ");
	System.out.println  ("*3)  Motocicleta (250.00)                 ");
    System.out.println  ( "*****************************************");
    System.out.println  ( tipo_veiculo);
}  
}