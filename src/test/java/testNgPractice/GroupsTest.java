package testNgPractice;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GroupsTest {
	@Parameters({"URL","user"})
	@Test(groups = "Products")
	public void openUrl(String Url,String user) {
	System.out.println("URL open:Products");
	System.out.println(Url +"url fetch"  +" user :"+user)  ;
	}
	@Test
	public void Login() {
		System.out.println("Login");
	}
	@Test
	public void addtoCart() {
		System.out.println("add to cart");
	}
	@Test(groups= {"Products","search"})
	public void Search() {
		System.out.println("Search product");
	}
	
	@Test(groups = "Products")
	public void FillterProduct() {
		System.out.println("filter product: Products");
//		Assert.assertNotEquals("dd","dd");
//		Assert.
	}
	
}
