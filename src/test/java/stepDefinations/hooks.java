package stepDefinations;

import baseClass.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
 public class hooks extends TestBase{

        @Before
        public static void setUp() {

            TestBase.Initialization();
        }

        @After
        public static void tearDown() {


            TestBase.teardown();
        }


    }

