package com.test.UnitTesting;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({GenericMethodTest.class , MathematicsTest.class})
public class TestSuiteClass {

}
