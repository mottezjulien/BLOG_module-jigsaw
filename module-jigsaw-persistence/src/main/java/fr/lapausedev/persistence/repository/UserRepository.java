package fr.lapausedev.persistence.repository;


import fr.lapausedev.persistence.entity.UserEntity;

import java.util.stream.Stream;

public interface UserRepository {

    Stream<UserEntity> findAll();

}
