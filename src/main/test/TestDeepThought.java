import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDeepThought {
    public TestDeepThought() {

    }
    @Test
    @DisplayName("Test the answer to everything")
    void testAnswerToAll(){
        DeepThought superComputer = new DeepThought();
        assertEquals(1, 2);  // fail on purpose
        assertEquals( 42 , superComputer.answer_to_the_ultimate_question_of_life_the_universe_and_everything());
    }

}
