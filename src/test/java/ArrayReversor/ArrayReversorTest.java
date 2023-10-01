package ArrayReversor;

import org.example.ArrayFlattenerService;
import org.example.ArrayReversor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {
    @Test
    public void testArrayReversorForNonNullInput() {
        // Mocking ArrayFlattenerService
        ArrayFlattenerService mockService = mock(ArrayFlattenerService.class);
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        when(mockService.flattenArray(input)).thenReturn(new int[]{1, 3, 0, 4, 5, 9});

        ArrayReversor reversor = new ArrayReversor(mockService);

        int[] expectedOutput = {9, 5, 4, 0, 3, 1};
        int[] actualOutput = reversor.reverseArray(input);

        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testArrayReversorForNullInput() {
        // Mocking ArrayFlattenerService
        ArrayFlattenerService mockService = mock(ArrayFlattenerService.class);
        when(mockService.flattenArray(null)).thenReturn(null);

        ArrayReversor reversor = new ArrayReversor(mockService);

        int[][] nullInput = null;
        int[] nullOutput = reversor.reverseArray(nullInput);

        assertNull(nullOutput);
    }
}






