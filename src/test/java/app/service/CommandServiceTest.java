package app.service;

import app.ApplicationConstants;
import app.model.Command;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class CommandServiceTest {
    private CommandService commandService;

    @Before
    public void setUp() throws Exception {
        this.commandService = new CommandService();
    }

    @Test
    public void findAll() {
        List<Command> all = this.commandService.findAll();
        assertThat(all).hasSize(ApplicationConstants.COMMAND_LIST_SIZE);
    }

    @Test
    public void findAllAmountGreaterOrEqualsThan() {
        double minAmount = 150.0;
        List<Command> commands = this.commandService.findAllAmountGreaterOrEqualsThan(minAmount);
        for (Command command : commands) {
            assertThat(command.getAmount()).isGreaterThanOrEqualTo(minAmount);
        }
    }

    @Test
    public void findAllAmountLessOrEqualsThan() {
        double maxAmount = 150.0;
        List<Command> commands = this.commandService.findAllAmountLessOrEqualsThan(maxAmount);
        for (Command command : commands) {
            assertThat(command.getAmount()).isLessThanOrEqualTo(maxAmount);
        }
    }

    @Test
    public void findMostExpensive() {
        Optional<Command> mostExpensive = this.commandService.findMostExpensive();
        assertThat(mostExpensive).isPresent();
        Command command = mostExpensive.get();
        for (Command c : this.commandService.findAll()) {
            assertThat(command.getAmount()).isGreaterThanOrEqualTo(c.getAmount());
        }
    }

    @Test
    public void findLeastExpensive() {
        Optional<Command> lessExpensive = this.commandService.findLeastExpensive();
        assertThat(lessExpensive).isPresent();
        Command command = lessExpensive.get();
        for (Command c : this.commandService.findAll()) {
            assertThat(command.getAmount()).isLessThanOrEqualTo(c.getAmount());
        }
    }

    @Test
    public void findAllUUID() {
        List<UUID> allUUID = this.commandService.findAllUUID();
        assertThat(allUUID).hasSize(ApplicationConstants.COMMAND_LIST_SIZE);

    }

    @Test
    public void findAllSortedByUUID() {
        List<Command> allSortedByUUID = this.commandService.findAllSortedByUUID();
        assertThat(allSortedByUUID).isSortedAccordingTo(Comparator.comparing(Command::getUuid));
    }

    @Test
    public void findAmountsSorted() {
        List<Double> amountsSorted = this.commandService.findAmountsSorted();
        assertThat(amountsSorted).hasSize(ApplicationConstants.COMMAND_LIST_SIZE);
        assertThat(amountsSorted).isSorted();
    }

}
