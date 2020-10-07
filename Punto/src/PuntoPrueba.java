import java.util.Scanner;		//IMPORTAR SCANNER PARA TECLADO
public class PuntoPrueba {

	public static void main(String[] args) {
		
		Scanner Teclado = new Scanner (System.in);		//CREAR OBJETO Teclado DE TIPO SCANNER
		Punto Punto =new Punto ();		//CREAR OBJETO Punto DE TIPO PUNTO
		
		System.out.print("Introduzca coordenada X del punto: ");		//PEDIR COORDENADA X
		Punto.setX(Teclado.nextDouble());		//LLAMAR MÉTODO SETX ()
		System.out.print("Introduzca coordenada Y del punto: ");		//PEDIR COORDENADA Y
		Punto.setY(Teclado.nextDouble());		//LLAMAR MÉTODO SETY
		
				//SALIDA DE VALORES
		Punto.imprime();		//LLAMAR MÉTODO IMPRIME()
		System.out.printf("y su distacia al punto (0,0) es %.3f",Punto.getX(),Punto.getY(),Punto.getDist());
				//SALIDA DE VALORES
	}	
}