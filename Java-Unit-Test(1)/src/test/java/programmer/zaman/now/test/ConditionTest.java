package programmer.zaman.now.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;


public class ConditionTest {
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyOnWindows(){

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledOnWindows(){

    }

    @Test
    @DisabledOnJre({org.junit.jupiter.api.condition.JRE.JAVA_17})
    void testEnabledOnJava8() {
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_17, max = JRE.JAVA_26)
    void testEnabledOnJava17To26() {

    }
}
