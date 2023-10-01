package ArrayFlattener;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.example.ArrayFlattener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ArrayFlattenerTest.ValidInputTest.class,
        ArrayFlattenerTest.NullInputTest.class
})
public class ArrayFlattenerTest {

    public static class ValidInputTest {
        @Test
        public void testFlattenArray() {
            int[][] input = {{1, 3}, {0}, {4, 5, 9}};
            int[] expected = {1, 3, 0, 4, 5, 9};
            assertArrayEquals(expected, ArrayFlattener.flattenArray(input));
        }
    }

    public static class NullInputTest {
        @Test
        public void testFlattenArray() {
            assertNull(ArrayFlattener.flattenArray(null));
        }
    }
}

