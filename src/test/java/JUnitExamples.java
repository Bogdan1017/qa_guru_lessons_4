import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Here is first beforeAll()");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Here is first beforeEach()");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("Here is first afterAll()");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Here is first afterEach()");
    }
    @Test
    void firstTest(){
        System.out.println("Here is firstTest()");
    }
    @Test
    void secondTest(){
        System.out.println("Here is secondTest()");
    }
}
