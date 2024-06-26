package application.repository;


import application.model.Publication;

import java.util.List;

public interface PublicationDao {
    Publication findById(int id);
    List<Publication> findAll();
    List<Publication> findByUserId(int userId);
    void save(Publication publication);
    void update(Publication publication);
    void delete(int id);
}
