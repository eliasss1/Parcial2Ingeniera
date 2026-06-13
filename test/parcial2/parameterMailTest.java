/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author elias
 */
@RunWith(value = Parameterized.class)
public class parameterMailTest {
    
    private String email;
    private boolean resultadoEsperado;

    public parameterMailTest(String email, boolean resultadoEsperado) {
        this.email = email;
        this.resultadoEsperado = resultadoEsperado;
    }

    @Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][] {
            {"jorgesys@tototita.com", true},
            {"jorgesys@tototitacom", false},
            {"jorgesystototita.com", false},
            {"@jorgesystototita.com", false},
            {".jorgesystototita@com", false}
        });
    }

    public static boolean ValidarMail(String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }

    @Test
    public void testValidarEmail() {
        System.out.println("Validando email: " + email + " | Esperado: " + resultadoEsperado);
        assertEquals(this.resultadoEsperado, ValidarMail(this.email));
    }
}
