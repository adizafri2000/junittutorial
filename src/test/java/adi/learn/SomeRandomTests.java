package adi.learn;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SomeRandomTests {

    @Test
    @Tag(TutorialClassificationConst.ITERABLES)
    void iterablesEqual() {
        final List<String> list = Arrays.asList("orange", "mango", "banana");
        final List<String> expected = Arrays.asList("banana", "mango", "orange");

        Collections.sort(list);

        assertIterableEquals(expected, list);
    }

    @Test
    @Tag(TutorialClassificationConst.ARRAYS)
    void arraysEqual() {
        final int[] array = { 3, 2, 1 };
        final int[] expected = { 1, 2, 3 };

        Arrays.sort(array);

        assertArrayEquals(expected, array);
    }

    // assertTimeout() runs in the same thread as the code that calls it, and it won’t abort if it exceeds the timeout
    @Test
    @Tag(TutorialClassificationConst.TIMEOUTS)
    void returnValueBeforeTimeoutExceeded() {
        final String message = assertTimeout(Duration.ofMillis(50), () -> {
            Thread.sleep(100);
            return "a message";
        });
        assertEquals("a message", message);
    }

    // assertTimeoutPreemptively() method executes in a different thread and aborts if it exceeds the timeout
    @Test
    @Tag(TutorialClassificationConst.TIMEOUTS)
    void abortWhenTimeoutExceeded() {
        final String message = assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
            Thread.sleep(100);
            return "another message";
        });
        assertEquals("another message", message);
    }



}
