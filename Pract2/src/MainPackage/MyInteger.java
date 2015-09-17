package MainPackage;

public class MyInteger{
	int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	
	public boolean isEven(){
		if (this.getValue() % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public boolean isOdd(){
		if (this.getValue() % 2 == 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public boolean isPrime(){
		int i;
		for(i = 2; i < this.getValue(); i++){
			int v = this.getValue() % i;
		if (v == 0){
			return true;
		}
		}
		return false;
	}
	
	
	public static boolean isEven(int n){
		if (n % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public static boolean isOdd(int n){
		if (n % 2 == 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public static boolean isPrime(int n){
		int i;
		for(i = 2; i < n; i++){
			int v = n % i;
		if (v == 0){
			return true;
		}
		}
		return false;
	}
	
	public static boolean isEven(MyInteger myInt){
		if (myInt.getValue() % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public static boolean isOdd(MyInteger myInt){
		if (myInt.getValue() % 2 == 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public static boolean isPrime(MyInteger myInt){
		int i;
		for(i = 2; i < myInt.getValue(); i++){
			int v = myInt.getValue() % i;
		if (v == 0){
			return true;
		}
		}
		return false;
	}
	
	
	public boolean equals(int n){
		if (this.getValue() == n){
			return true;
		}
		return false;
	}
	
	
	public boolean equals(MyInteger myInt){
		if (this.getValue() == myInt.getValue()){
			return true;
		}
		return false;
	}
	
	
	public static int parseInt(char[] cha){
		int value = 0;
		for(int  n: cha){
			value += n;
		}
		return value;
	}
	
	
	public static int parseInt(String s){
		return Integer.parseInt(s);
	}
	
}

