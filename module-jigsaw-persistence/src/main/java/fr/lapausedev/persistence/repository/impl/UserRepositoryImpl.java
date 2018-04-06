package fr.lapausedev.persistence.repository.impl;

import fr.lapausedev.persistence.entity.UserEntity;
import fr.lapausedev.persistence.repository.UserRepository;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class UserRepositoryImpl implements UserRepository {

    private static Logger LOGGER = Logger.getLogger(UserRepositoryImpl.class.getName());

    public Stream<UserEntity> findAll() {
        LOGGER.info("UserRepositoryImpl : Find All Start");
        UserEntity userEntity1 = new UserEntity("Michel", "Durant");
        UserEntity userEntity2 = new UserEntity("Pierre", "Dupont");
        List<UserEntity> all = List.of(userEntity1, userEntity2);
        LOGGER.info("UserRepositoryImpl : Find All End: " + all.size() + " entities");
        return all.stream();
    }
}
