package seedu.addressbook.commands;

/**
 * Sorts all persons in address book by alphanumeric order.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Sorts all entries of persons in addressbook by alphanumeric order.\n"
            + "Example: " + COMMAND_WORD;
    public static final String MESSAGE_SORT_ACKNOWEDGEMENT = "Sorting Address Book as requested ...";

    // see instructions to run in override
    @Override
    public CommandResult execute() {
        addressBook.sortAlphanumeric();
        return new CommandResult(MESSAGE_SORT_ACKNOWEDGEMENT);
    }
}