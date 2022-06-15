package com.sapient.asde.suite;

import com.sapient.asde.service.HelloWorld;
import com.sapient.asde.service.HelloWorldLatestTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectClasses({HelloWorld.class, HelloWorldLatestTest.class})
@SelectPackages("com.sapient.asde.service")
public class SuiteClassTest {

}
