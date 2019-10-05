package app.repository;

import app.ApplicationConstants;
import lombok.extern.log4j.Log4j2;
import app.model.Command;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Log4j2
public class CommandRepositoryTest {
    private CommandRepository commandRepository;

    @Before
    public void setUp() throws Exception {
        this.commandRepository = new CommandRepository();
    }

    @Test
    public void findAllShouldGiveAllSevenCommands() {
        List<Command> commands = commandRepository.findAll();
        assertThat(commands).hasSize(ApplicationConstants.COMMAND_LIST_SIZE);
        commands.forEach(log::info);
    }
}
