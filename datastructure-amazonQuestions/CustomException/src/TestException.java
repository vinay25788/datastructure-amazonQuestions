
public class TestException {
	public static void main(String[] args) {
		
		try {
			testException();
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMsg());
		}
	}
	
	public static void testException() throws CustomException
	{
		throw new CustomException("first Exception Demo");
	}

}
