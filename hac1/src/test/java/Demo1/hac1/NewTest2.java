package Demo1.hac1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest2 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println(n+" "+s);
  }

  @DataProvider
  public Object[][] dp() {
    Object[][] data={
      new Object[] { 1, "abc" },
      new Object[] { 2, "bbb" },
    };
    return data;
  }
}
