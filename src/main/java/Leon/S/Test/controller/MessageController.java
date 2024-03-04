package Leon.S.Test.controller;


import Leon.S.Test.model.Message;
import Leon.S.Test.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    Controller to handle the mapping of the service
        here it maps every Request that starts at /api
 */
@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    MessageService messageService;

    // implemented GetMapping to receive the JSON Data with the help of the MessageService
    @GetMapping("/messages")
    public List<Message> getAllMessages(){

        return  messageService.getAllMessages();

    }
}
