package app.boot.service;

import app.boot.model.Release;

public interface ReleaseService {

    Iterable<Release> listReleases();

}
