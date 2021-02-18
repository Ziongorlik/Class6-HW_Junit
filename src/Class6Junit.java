import org.junit.*;

public class Class6Junit {
    public Class6Junit() {
    }

    // Exercise-1
    @AfterClass
    public static void afterClass(){
        System.out.println("@AfterClass");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("@BeforeClass");
    }

    @Before
    public void beforeMethod(){
        System.out.println("@Before");
    }

    @Test
    public void test(){
        System.out.println("@Test");
    }

    @After
    public void afterMethod(){
        System.out.println("@After");
    }

    // Exercise-2
    @Test
    public void exercise2(){
        int x = 1;
        int y = 2;
        Assert.assertNotEquals(x,y);
    }

    // Exercise-3
    @Test
    public void exercise3Test1(){
        System.out.println("A");
    }

    @Test
    public void exercise3Test2(){
        System.out.println("B");
    }

    @Test
    public void exercise3Test3(){
        System.out.println("C");
    }

}
