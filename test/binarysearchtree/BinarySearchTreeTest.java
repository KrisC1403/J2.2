/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KrisT
 */
public class BinarySearchTreeTest {
    
    public BinarySearchTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Add method, of class BinarySearchTree.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        String data = "";
        BinarySearchTree instance = new BinarySearchTree();
        instance.Add(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Delete method, of class BinarySearchTree.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete");
        String target = "";
        BinarySearchTree instance = new BinarySearchTree();
        instance.Delete(target);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Find method, of class BinarySearchTree.
     */
    @Test
    public void testFind() {
        System.out.println("Find");
        String key = "";
        BinarySearchTree instance = new BinarySearchTree();
        boolean expResult = false;
        boolean result = instance.Find(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoot method, of class BinarySearchTree.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        BinarySearchTree instance = new BinarySearchTree();
        String expResult = "Diana";
        String result = instance.getRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Display method, of class BinarySearchTree.
     */
    @Test
    public void testDisplay() {
        System.out.println("Display");
        BinarySearchTree instance = new BinarySearchTree();
        String expResult = "Abi Brand Cait Diana Emma Felix Gabe Helen Ian Jack";
        String result = instance.Display();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
