import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CuentaBancaria cuenta_personal = new CuentaBancaria();//Se crea un objeto que viene de clase CuentaBancaria.Instanciamos nuestra clase Cuenta Bancaria.
		//El objeto es responsable de las caracter�sticas que tiene.
		//cuenta_personal. As� se ven los elementos que tiene por dentro nuestro objeto.
		
		
		//Al agregar un constructor(l�nea12 de CuentaBancaria), cambia la forma en que inicializamos nuestra clase. Ahora ser�a as�, en vez de lo establecido en l�nea 7.
		CuentaBancaria cuenta_personal = new CuentaBancaria("Tania Gayosso", 2387.65f);
		CuentaBancaria cuenta_secundaria = new CuentaBancaria("Julia Dom�nguez", 0);
		cuenta_secundaria.setSaldo (-1239.76f);
		System.out.println(cuenta_secundaria.getSaldo());
	
		/*int opcion = 0; //Declaramos un int inicializado en cero. Esto se usar� despu�s en el men�.
		
		do { //Ciclo do while y dentro un switch para ejecutar las opciones de nuestro men�.
		Scanner leer= new Scanner(System.in);//Declaramos el scanner para que se lean los datos introducidos por teclado.
		System.out.println("�Bienvenida/o/e al men� de su cuenta bancaria");//Imprimimos el men� en consola.
		System.out.println("Elija una opci�n, por favor");
		System.out.println("1) Retiro");
		System.out.println("2) Dep�sito");
		System.out.println("3) Consultar saldo");
		System.out.println("4) Consultar estado de cuenta");
		System.out.println("5) Agregar beneficiario");
		System.out.println("6) Salir");
		
		opcion = leer.nextInt(); //Aqu� llamamos lo declarado en l�nea 12, para que se lea la opci�n seleccionada.
		
		switch(opcion){//Se usar� el control de flujo switch,el cual evaluar� la opcion.
			case 1: //Opci�n 1 del men�.
				System.out.println("Ingrese la cantidad que desea retirar");//Mensaje para pedir al usuario los datos
				float monto = leer.nextFloat();//Establecemos float y hacemos uso del scanner para leer lo ingresado
				cuenta_personal.retiros(monto);//Llamamos a nuestro m�todo para ejecutar la operaci�n.
				System.out.println("******Fin de la operaci�n******");
				break;
			case 2: 
				System.out.println("Ingrese la cantidad que desea depositar");
				float deposito = leer.nextFloat();
				cuenta_personal.depositos(deposito);
				System.out.println("******Fin de la; operaci�n******");
				break;
			case 3:
				System.out.println("Su saldo es:" + 
						cuenta_personal.consultarSaldo());
				System.out.println("******Fin de la operaci�n******");
				break;
			case 5:
				System.out.println("Ingrese el nombre del beneficiario/a/e que desee agregar");
				String name = leer.nextLine();//Sobreescribe el nuevo dato.
				cuenta_personal.beneficiario = name;
				break;
			}
		} while (opcion !=6); //Declaramos un booleano para poder salir del men�
	
		
		/*cuenta_personal.beneficiario = "Tania Gayosso"; //As� agregar�amos beneficiarios al inicializar nuestra clase sin constructor.
		System.out.println("Ingrese el monto a depositar");
		Scanner read = new Scanner(System.in);
		float deposito = read.nextFloat();
		
		System.out.println("Ingrese el monto a retirar");
		float retiro = read.nextFloat();
		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		
		System.out.println("Tu saldo actual es" + cuenta_personal.consultarSaldo());
		
	
		System.out.println(cuenta_personal.beneficiario);
		*/
		
		/*CuentaBancaria cuenta_papa = new CuentaBancaria(); 
		//Se cre� un segundo objeto proveniente de la misma clase. Los cambios que se hagan en cuenta personal y pap� son independientes.
		cuenta_papa.beneficiario = "Ad�n Gayosso";
		System.out.println(cuenta_papa.beneficiario);*/
	}
}
