package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {
    public Hook(BaseUtil base) {
        this.base = base;
    }

    private BaseUtil base;

    @Before
    public void InitializeTest()
    {
        System.out.println("Opening the browser : Mock\b");
    }

    @After
    public void TearDownTest()
    {
        System.out.println("\bClosing the browser : Mock");
    }

}


