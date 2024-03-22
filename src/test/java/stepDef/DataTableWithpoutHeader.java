//package stepDef;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//
//public class DataTableWithpoutHeader {
//	@Given("data are valid one")
//	public void data_are_valid_one() {
//	    // Write code here that turns the phrase above into concrete actions
//	    
//	}
//
//	@When("enter a user enter a password  and username")
//	public void enter_a_user_enter_a_password_and_username(io.cucumber.datatable.DataTable dataTable) {
//	    //System.out.println("List values are:"+dataTable.asList().get(3));
//		List<Map<String, String>> signForms = dataTable.asMaps();
//		for (int i = 0; i < 2; i++) {
//			System.out.println("value in the Item are:");
//			System.out.println("Firstname:"+signForms.get(i).get("FirstName")
//					+" "+"Last name is:"+signForms.get(i).get("LastName"));
//
//		}
//	}
//
//
//}
