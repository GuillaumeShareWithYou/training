package app.service;

import app.model.Command;
import app.repository.CommandRepository;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CommandService implements ICommandService{

    private CommandRepository commandRepository;

    public CommandService() {
        this.commandRepository = new CommandRepository();
    }
    @Override
    public List<Command> findAll() {
        return this.commandRepository.findAll();
    }

    @Override
    public List<Command> findAllAmountGreaterOrEqualsThan(double minimalAmount) {
        throw new NotImplementedException();
    }

    @Override
    public List<Command> findAllAmountLessOrEqualsThan(double maximalAmount) {
        throw new NotImplementedException();
    }

    @Override
    public List<Command> findAllSortedByUUID() {
        throw new NotImplementedException();
    }

    @Override
    public List<Double> findAmountsSorted() {
        throw new NotImplementedException();
    }

    @Override
    public Optional<Command> findMostExpensive() {
        throw new NotImplementedException();
    }

    @Override
    public Optional<Command> findLeastExpensive() {
        throw new NotImplementedException();
    }

    @Override
    public List<UUID> findAllUUID() {
        throw new NotImplementedException();
    }
}
