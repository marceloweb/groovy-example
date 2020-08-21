import groovy.util.GroovyTestSuite 
import junit.framework.Test 

class BootTests { 
   static Test suite() { 
      def allTests = new GroovyTestSuite() 
      allTests.addTestSuite(StudentTest) 
      allTests.addTestSuite(EmployeeTest) 
      return allTests 
   } 
} 

