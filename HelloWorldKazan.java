public Class HelloWorldKazan {
	public HelloWorldKazan(){
		sayHello();
	}

	public void sayHello(){
		System.out.printlnj("Hello World Kazan !");
	}	

	public void sayHelloTo(String name){
		System.out.println("Hello "+name);
	}

	public static void main(String[] args){
		HelloWorldKazan hello = new HelloWorldKazan();
	}
}