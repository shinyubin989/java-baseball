package baseball;

import baseball.constant.ExceptionMessages;
import baseball.io.InputValidator;
import baseball.io.PlayingInputValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputValidationTest {

  @Test
  void 입력값에_중복되는_수가_들어있는_경우_예외를_던지는가() {
    try {
      InputValidator validator = new PlayingInputValidator();
      String userInput = "112";
      validator.validate(userInput);
    } catch (IllegalArgumentException e) {
      assertEquals(ExceptionMessages.INPUT_IS_NOT_UNIQUE.getExceptionMessage(), e.getMessage());
    }
  }

  @Test
  void 입력값의_길이가_3이_아닐때_예외를_던지는가_1() {
    try {
      InputValidator validator = new PlayingInputValidator();
      String userInput = "12";
      validator.validate(userInput);
    } catch (IllegalArgumentException e) {
      assertEquals(ExceptionMessages.INPUT_LENGTH_IS_NOT_THREE.getExceptionMessage(), e.getMessage());
    }
  }


}
