package lesson4;

import org.junit.jupiter.api.*;

public class FunctionsTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Выполняемся 1 раз перед всеми тестами ");
    }

    @BeforeEach
    void beforEach() {
        System.out.println("Выполняемся перед каждым тестом");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Закрытие браузера");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Метод 1 раз выполнится после всех тестов");
    }
//    @Test
//    @DisplayName("Проверка метода вычисление площади треугольника")
//    void findAreaOfTriangle(){
//        double resalt =
//    }

}
