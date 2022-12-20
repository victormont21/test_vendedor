/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package BD_Vendedor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class addVendedorTest {
    
    public addVendedorTest() {
    }

    @Test
    public void testId_vendedor_auto() {
        System.out.println("id_vendedor_auto");
        addVendedor instance = null;
        int expResult = 0;
        int result = instance.id_vendedor_auto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        addVendedor.main(args);
        fail("The test case is a prototype.");
    }
    
}
