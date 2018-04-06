package fr.lapausedev.service;

import fr.lapausedev.persistence.entity.UserEntity;
import fr.lapausedev.persistence.repository.RepositoryFactory;
import fr.lapausedev.persistence.repository.UserRepository;

import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        //UserRepositoryImpl is hidden
        RepositoryFactory factory = new RepositoryFactory();
        UserRepository userRepository = factory.createUser();
        Stream<UserEntity> entities = userRepository.findAll();
        entities.forEach(user -> System.out.println(user.getFirstName() + " " + user.getLastName()));
    }

}
