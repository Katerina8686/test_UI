package lesson4;

import com.geekbrains.com.geekbrains.lesson4.FindAreaOfTriangle;
import org.junit.jupiter.api.*;

public class TriangleTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Выполняемся 1 раз перед всеми тестами ");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Выполняемся перед каждым тестом");
    }

    @Test
    @DisplayName("Рассчитать площадь треугольника по трем сторонам")
    void calculateAreaOfTriangle() throws Exception {
       int r= FindAreaOfTriangle.findOfAreaTriangle(3, 5, 4);
        Assertions.assertEquals(6,r);

    }

    @Test
    @DisplayName("Расчитать площадь треугольника с отрицательным числом")
    void  calculateAreaOfTriangleWithNegativeNumber() throws Exception {
        int r = FindAreaOfTriangle.findOfAreaTriangle(-3,-5,-4);
        Assertions.assertEquals(-6, r);

    }



    @AfterEach
    void afterEach() {
        System.out.println("Выполняемся после каждого теста");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Выполнится 1 раз после всех тестов");


    }
}
