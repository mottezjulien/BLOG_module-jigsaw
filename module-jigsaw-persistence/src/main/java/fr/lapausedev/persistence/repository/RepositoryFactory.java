package fr.lapausedev.persistence.repository;

import fr.lapausedev.persistence.repository.impl.UserRepositoryImpl;

public class RepositoryFactory {

    public UserRepository createUser(){
        return new UserRepositoryImpl();
    }

}
