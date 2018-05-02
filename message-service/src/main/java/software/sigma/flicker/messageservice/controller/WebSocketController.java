package software.sigma.flicker.messageservice.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;
import software.sigma.flicker.messageservice.model.MessageDTO;

import java.time.LocalDateTime;
import java.util.Map;

@Controller
public class WebSocketController {

//    private final SimpMessagingTemplate template;

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;

/*    @Autowired
    WebSocketController(SimpMessagingTemplate template) {
        this.template = template;
    }

    @MessageMapping("/send/message")
    public void onReceivedMessage(String message) {
        this.template.convertAndSend("/chat", new SimpleDateFormat("HH:mm:ss").format(new Date()) + "- " + message);
    }*/


    @MessageMapping("/message")
    @SendTo("/topic/reply")
    public MessageDTO processMessageFromClient(@Payload String message) throws Exception {
        String text = new Gson().fromJson(message, Map.class).get("text").toString();
//        return name;

        MessageDTO messageDTO = new MessageDTO("1", text, "Anton", "Anton", "Anton",
                LocalDateTime.now());
        return messageDTO;
    }

    @MessageExceptionHandler
    public String handleException(Throwable exception) {
        messagingTemplate.convertAndSend("/errors", exception.getMessage());
        return exception.getMessage();
    }


}

