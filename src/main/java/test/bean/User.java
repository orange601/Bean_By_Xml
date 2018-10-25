package test.bean;

public class User {
	String str ="";
	public User(TestUser tuser){
		this.str = tuser.getTestUserId();
	}
	
	public String result(){
		return str;
	}
}
