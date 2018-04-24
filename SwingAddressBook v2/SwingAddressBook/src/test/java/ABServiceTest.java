import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import abook.pojo.Friend;
import abook.pojo.User;
import abook.service.ABService;

public class ABServiceTest {
	
	private ABService aBService;
	
	@Before
	public void init(){
		aBService= new ABService();
	}
	
	@Test
	public void authanticateUser_Return_User_ifAuthenticated() throws Exception {
		User user=aBService.authanticateUser("a", "a");
		assertEquals(user.getClass(), User.class);
	}
	
	@Test(expected=Exception.class)
	public void authanticateUser_throw_Exception_ifInCorrect() throws Exception {
		User user=aBService.authanticateUser("ab", "a");
		assertEquals(user.getClass(), User.class);
	}

}
