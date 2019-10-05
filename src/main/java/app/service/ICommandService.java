package app.service;

import app.model.Command;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ICommandService {

    List<Command> findAll();

    List<Command> findAllAmountGreaterOrEqualsThan(double minimalAmount);

    List<Command> findAllAmountLessOrEqualsThan(double maximalAmount);

    List<Command> findAllSortedByUUID();

    List<Double> findAmountsSorted();

    Optional<Command> findMostExpensive();

    Optional<Command> findLeastExpensive();

    List<UUID> findAllUUID();

    int findNumberOfCommands();

    double sumAllAmounts();
}
