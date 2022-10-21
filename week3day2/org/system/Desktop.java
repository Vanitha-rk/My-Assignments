package org.system;

public class Desktop extends Computer
{

	public void desktopSize() {
		System.out.println("21.5 inch Display");
		
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();
	}
}
