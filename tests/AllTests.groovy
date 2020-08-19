import groovy.util.GroovyTestSuite 
import junit.framework.Test 
import junit.textui.TestRunner 

class AllTests { 
   static Test suite() { 
      def allTests = new GroovyTestSuite() 
      allTests.addTestSuite(StudentTest) 
      allTests.addTestSuite(EmployeeTest) 
      return allTests 
   } 
} 

TestRunner.run(AllTests.suite())
