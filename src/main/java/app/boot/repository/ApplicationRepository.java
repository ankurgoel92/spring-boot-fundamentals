package app.boot.repository;

import org.springframework.data.repository.CrudRepository;

import app.boot.model.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
