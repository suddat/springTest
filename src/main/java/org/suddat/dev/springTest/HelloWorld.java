package org.suddat.dev.springTest;

public class HelloWorld {
	private String message;
	private int no;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public HelloWorld(String message) {	
		this.message = message;
	}
	
	public HelloWorld(int no) {
		this.no = no;
	}
	
	public HelloWorld(String message, int no) {
		this.message = message;
		this.no = no;
	}
	public void greet() {
		System.out.println(getMessage()+" Hellos World" + getNo());
	}
	public String getMessage() {
		return message;
	}
	/*public void setMessage(String message) {
		this.message = message;
	}*/
}
