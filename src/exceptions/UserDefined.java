package exceptions;

public class UserDefined extends Exception{

	public UserDefined() {
		System.out.println("entered into userdefined exceptions");
		System.out.println(7/0);
	}

}
