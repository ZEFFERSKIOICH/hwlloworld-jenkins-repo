package com.sapient.asde.service;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    private HelloWorld helloWorld;


    //executed first time
    @BeforeAll
    static void beforeAll(){
        System.out.println("code in this method executes everytime before all test methods");
    }

    //Executed last time
    @AfterAll
    static void afterAll(){
        System.out.println("code in this method executes everytime after all test methods");
    }

    //before each test method
    @BeforeEach
    void setUp() {
        helloWorld=new HelloWorld("Hello World");
    }

    //executed after each test method
    @AfterEach
    void tearDown() {
        helloWorld=null;
    }

    @Test
    void getGreetingForValidData() {
        assertEquals("Hello World",helloWorld.getGreeting());
    }

    @Test
    void getGreetingForInvalidData() {
        assertNotEquals("Hello World!",helloWorld.getGreeting());
    }

    @Test
    void setGreetingForValidData() {
        helloWorld.setGreeting("Hello Ankit");
        assertEquals("Hello Ankit",helloWorld.getGreeting());
    }

    @Test
    void setGreetingForInvalidData() {
        helloWorld.setGreeting("Hello Ankit");
        assertNotEquals("Hello Ankit!",helloWorld.getGreeting());
    }

    @Test
    void toStringForValidData(){
        assertEquals("HelloWorld{greeting='Hello World'}",helloWorld.toString());
    }

    @DisplayName("Check if Contructor is working")//change test name default :: function name
    @Test
    void checkForValidDefaultConstructor(){
        HelloWorld helloWorld1=new HelloWorld();
        assertNull(helloWorld1.getGreeting());
    }

    @Disabled   //does not allow to test
    @Test
    void checkForValidDummyConstructor(){
        HelloWorld helloWorld1=new HelloWorld();
        assertNull(helloWorld1.getGreeting());
    }

}