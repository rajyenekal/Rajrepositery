package Pom_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Framework_Utility.Utility_Methods;
import Pom_pages.DWS_AdvancedsearchPage;
import Pom_pages.DWS_HomePage;

public class DWS_Advsearch_Test extends Basetest{
	@DataProvider(name="advancesearch")
	
	public Object[]advsearch() throws IOException{
		
		Object[][]search=Utility_Methods.getTestData("Advsearch");
		
		return search;
		}
	
	
	@Test(dataProvider = "advancesearch")
	public void TC12(String item,String Value1,String value,String range,String end) throws InterruptedException {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.Click_search();
		
		DWS_AdvancedsearchPage as= new DWS_AdvancedsearchPage(driver);
		as.Search_item(item);
		as.Click_search();
		as.AdvSearch();
		as.Category(Value1);
		as.Checkbox();
		as.Mfg(value);
		as.From(range);
		as.To(end);
		as.Final_search();
		
	}

}
