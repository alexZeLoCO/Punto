public class Punto {

//------------INICIALIZACIÓN VARIABLES-------------
	private double X;		//POSICIÓN X DEL CENTRO
	private double Y;		//POSICIÓN Y DEL CENTRO

//-------------MÉTODOS GET-------------
	public double getX() {		//MÉTODO GETX
		return X;		//DEVUELVE X
	}
	public double getY() {		//MÉTODO GETY
		return Y;		//DEVUELVE Y
	}
	public double getDist() {		//MÉTODO GETDIST - CALCULA LA DISTANCIA AL ORIGEN
		return (Math.sqrt(Math.pow(X, 2)+(Math.pow(Y, 2))));		//DEVUELVE EL MÓDULO DE CENTRO AL ORIGEN
	}
	
//------------MÉTODOS SET--------------
	public void setX (double x) {		//MÉTODO SETX
		X = x;		//ASIGNA POSICIÓN X A LA VARIABLE X
	}
	public void setY (double y) {		//MÉTODO SETY
		Y = y;		//ASIGNA POSICIÓN Y A LA VARIABLE Y 
	}
	
//-----------MÉTODO IMPRIME----------
	public void imprime () {
		System.out.printf("Las coordenadas del punto son: (%f,%f)", getX(), getY());
	}

}