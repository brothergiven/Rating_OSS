package main;
import gui.*;
import member.*;
public class Main {
	public static RecordList recordRef;
	public static MemberList memberRef;
	public static Login loginRef;
	
	
	public static void main(String[] args) {
		loginRef = new Login();
		memberRef = new MemberList();
		recordRef = new RecordList();
		new LoginFrame();
	}
	
	
}
