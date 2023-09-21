package seedu.address.logic.parser.exceptions;

import seedu.address.commons.exceptions.IllegalValueException;

public class CommandException extends IllegalValueException {

    public CommandException(String message) {
        super(message);
    }
}
