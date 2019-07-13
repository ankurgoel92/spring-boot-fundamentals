package app.boot.repository;

import org.springframework.data.repository.CrudRepository;

import app.boot.model.Release;

public interface ReleaseRepository extends CrudRepository<Release, Long> {

}
