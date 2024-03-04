package Leon.S.Test.repository;


import Leon.S.Test.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    Repository to access the data from the database
        extending JpaRepository for default methods (like findAll)
 */
@Repository
public interface MessageRepo extends JpaRepository<Message, Long> {
}
