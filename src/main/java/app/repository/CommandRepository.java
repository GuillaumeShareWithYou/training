package app.repository;

import app.ApplicationConstants;
import app.model.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class CommandRepository {

    public List<Command> findAll() {
        List<Command> commands = new ArrayList<>();

        commands.add(new Command(UUID.fromString(ApplicationConstants.UUID_QUERY), ApplicationConstants.AMOUNT_QUERY));

        for (int i = 1; i < ApplicationConstants.COMMAND_LIST_SIZE; ++i) {
            commands.add(new Command(UUID.randomUUID(), new Random().nextDouble() * 1000));
        }

        return commands;
    }

}
