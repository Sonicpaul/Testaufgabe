package Leon.S.Test.services;

import Leon.S.Test.model.Message;
import Leon.S.Test.repository.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    A service that uses the Repository data for the needed methods
 */
@Service
public class MessageService {
    @Autowired
    private MessageRepo messageRepo;
    public List<Message> getAllMessages(){
        return messageRepo.findAll();
    }
}
