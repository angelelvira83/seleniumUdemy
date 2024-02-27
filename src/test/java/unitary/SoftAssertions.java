/*
 
En Junit hay que importar otra librería

<dependency>
    <groupId>org.assertj</groupId>
    <artifactId>assertj-core</artifactId>
    <version>3.18.1</version>
    <scope>test</scope>
</dependency>

import org.assertj.core.api.SoftAssertions;

SoftAssertions softAssertions = new SoftAssertions();
softAssertions.assertThat(searchCriteriaPage.count()).isEqualTo(searchCriteria.getCount());
softAssertions.assertAll();


 */


package unitary;

import org.junit.jupiter.api.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
    
    @Test
    public void testSoft () {
        SoftAssert soft = new SoftAssert();

        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";
 
        // Soft Assertions: No detienen la ejecución al fallar. Ideal para verificar
        // muchas cosas pequeñas a la vez.
        soft.assertEquals(palabraEsperada, palabraEncontrada);
        soft.assertTrue(palabraEncontrada.contains(palabraEsperada));
        soft.assertNotEquals(palabraEncontrada,palabraEsperada);
 
        // Si no ejecutas éste no hace nada
        soft.assertAll();
    }

}
