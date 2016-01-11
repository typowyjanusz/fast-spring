package service;


import model.Content;
import org.slf4j.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import repo.UserRepository;
import service.exception.UserAlreadyExistsException;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Janusz on 2016-01-08.
 */
@Service
@Validated
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository repository;

    @Inject
    public UserServiceImpl(final UserRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Content save(@NotNull @Valid final Content content) {
        LOGGER.debug("Creating {}", content);
        /*
        Content existing = repository.findOne(content.getId());
        if (existing != null) {
            throw new UserAlreadyExistsException(
                    String.format("There already exists a content with id=%s", content.getId()));
        }
        */
        return repository.save(content);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Content> getList() {
        LOGGER.debug("Retrieving the list of all users");
        return repository.findAll();
    }

}