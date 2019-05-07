
public class CustomException extends Exception
{
	String msg;
	
	public CustomException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
		this.msg = msg;
	}
	
	public String getMsg()
	{
		return this.msg;
	}

}
