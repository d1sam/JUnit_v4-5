import org.junit.*;

public class UserTest {
    User user = new User("Dmytro", 18);

    // метод, который будет вызываться перед срабатыванием каждого метода, помеченного @Test
    // на каждом новом тесте будет создавать новый объект UserTest и на нем будет вызываться метод @Test
    @Before
    public void setUp() {
        System.out.println("In setUp()");
        user.setAge(19);
    }

    // метод, который будет вызываться после срабатывания каждого метода, помеченного @Test
    @After
    public void tearDown() {
        System.out.println("In tearDown()");
        user.setAge(20);
    }

    // метод, который будет вызываться перед загрузкой класса в JVM
    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("In setUpBeforeClass()");
    }

    // метод, который будет срабатывать после уничтожения класса из JVM
    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("In tearDownAfterClass()");
    }

    // вообще эти методы были придуманы для того, чтобы освобождать ресурсы
    // например могли бы открыть какой-то сетевой сокет, который потом нужно закрыть

    @Test
    public void test1() {
        System.out.println(user.getAge());
    }

    @Test
    public void test2() {
        System.out.println(user.getAge());
    }

    @Test
    public void testSame() {
        Assert.assertSame(new User("Dmytro", 18), new User("Oleh", 52));
    }
}
