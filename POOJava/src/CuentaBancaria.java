
public class CuentaBancaria {
	//Aributos de la clase
	private String institucion = "";
	private String beneficiario = "";
	private float saldo = 0;
	private long cuenta = 0;
	private String producto = "";
	private String direccion = "";
	private String RFC = "";
	
	CuentaBancaria() {
		
	}
	
	
	public String getBeneficiario() {
		return beneficiario;
	}



	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float saldo) {
		if(saldo > 0) {
			this.saldo = saldo;
	} else {
		throw new IllegalArgumentException("El saldo ingresado es inv�lido");//
		//System.out.println("Cantidad inv�lida");
	}
}



	public long getCuenta() {
		return cuenta;
	}



	public void setCuenta(long cuenta) {
		this.cuenta = cuenta;
	}



	public String getProducto() {
		return producto;
	}



	public void setProducto(String producto) {
		this.producto = producto;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getRFC() {
		return RFC;
	}



	public void setRFC(String rFC) {
		RFC = rFC;
	}



	CuentaBancaria(String beneficiario, float saldo) {
	//Si queremos que nuestra clase CuentaBancaria tenga datos previamente, lo que hacemos es hacer uso de un constructor que cargar� de valores a nuestro objeto desde el inicio.
		//Puede haber n cantidad de constructores.
	//Nombre de la clase, par�ntesis, agregamos par�metros y abrimos llaves.
	//En este caso, inicializamos nuestra CuentaBancaria con un beneficiario y saldo.
	this.beneficiario = beneficiario;//Este beneficiario(l�nea5) ser� el beneficiario de nuestra l�nea12.
	this.saldo = saldo;
	}
	
	//getter-obtener un valor
	//setter- escribe el valor.
	
	public String getInstitucion() { //m�todo getter para obtener el valor. Se usa Camel Case.
		return this.institucion; //devuelves el valor de instituci�n
	}
	
	public void setInstitucion (String institucion) { //M�todo setter y clase con void, para que se hagan las operaciones que se deban hacer, pero sin retornar nada.
		this.institucion = institucion;
	}
	
	//M�todos de la clase
	public void depositos(float monto) {//Se puede acceder a estos m�todos
		this.saldo = this.saldo + monto; //Al saldo actual m�s monto y se guarda en la misma variable saldo
	}
	
	public void retiros(float monto) {
		if(monto < this.saldo && monto > 0) { //Si el monto es mayor a saldo o es mayor a cero, se hace el retiro.
			this.saldo = this.saldo - monto; //Al saldo se le quita el monto retirado y el resultado se guarda en la misma variable cero.
		}
		
	}
	
	public float consultarSaldo() {
		return this.saldo; // Se retorna el valor de lo almacenado en la variable saldo. 

	}
	
	public String estadoDeCuenta() {
		return "";
	}
}
