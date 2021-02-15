package formats;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatePhoneNumber {

    @Test
    public void retornaNumerosFormatados() {
        assertEquals("(123) 456-7890", createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0],numbers[1],numbers[2],
                numbers[3],numbers[4],numbers[5],
                numbers[6],numbers[7],numbers[8],numbers[9]);
        //return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }
}