package app.boot.service;

import app.boot.model.Application;

public interface ApplicationService {

    Iterable<Application> listApplications();

    Application findApplication(long id);

}
