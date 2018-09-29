package seedu.divelog.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.divelog.logic.CommandHistory;
import seedu.divelog.model.DiveLog;
import seedu.divelog.model.Model;

/**
 * Clears the address book.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Address book has been cleared!";


    @Override
    public CommandResult execute(Model model, CommandHistory history) {
        requireNonNull(model);
        model.resetData(new DiveLog());
        model.commitAddressBook();
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
