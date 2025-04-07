package com.SeleniumPractice;



import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

//    @Test
//    public void testMethod1() {
//        // Test logic for method 1
//        Assert.assertTrue(true);
//    }
//
//    @Test
//    public void testMethod2() {
//        // Test logic for method 2
//        Assert.assertEquals(1, 1);
//    }
//
//    @Test
//    public void testMethod3() {
//        // Test logic for method 3
//        Assert.assertNotNull(new Object());
//    }
//
//    @Test
//    public void testMethod4() {
//        // Test logic for method 4
//        Assert.assertFalse(false);
//    }
//
//    @Test
//    public void testMethod5() {
//        // Test logic for method 5
//        Assert.assertNull(null);
//    }
//    
//
//    public class Test {

        @Test
        public void loginMethod1() {
            String username = "user1";
            String password = "pass1";
            // Login logic for method 1
            Assert.assertTrue(username.equals("user1") && password.equals("pass1"));
        }

        @Test
        public void loginMethod2() {
            String username = "user2";
            String password = "pass2";
            // Login logic for method 2
            Assert.assertEquals(username, "user2");
            Assert.assertEquals(password, "pass2");
        }

        @Test
        public void loginMethod3() {
            String username = "user3";
            String password = "pass3";
            // Login logic for method 3
            Assert.assertNotNull(username);
            Assert.assertNotNull(password);
        }

        @Test
        public void loginMethod4() {
            String username = "user4";
            String password = "pass4";
            // Login logic for method 4
            Assert.assertFalse(username.isEmpty());
            Assert.assertFalse(password.isEmpty());
        }

        @Test
        public void loginMethod5() {
            String username = "user5";
            String password = "pass5";
            // Login logic for method 5
            Assert.assertNull(null);
        }
    }



