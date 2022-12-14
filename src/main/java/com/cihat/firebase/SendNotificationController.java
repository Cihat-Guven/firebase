package com.cihat.firebase;


import com.google.firebase.messaging.FirebaseMessagingException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("firebase")
public class SendNotificationController {

    private final SendNotificationManager sendNotificationManager;

    public SendNotificationController(SendNotificationManager sendNotificationManager) {
        this.sendNotificationManager = sendNotificationManager;
    }

    @RequestMapping("/send-notification")
    @ResponseBody
    public String sendNotification(@RequestBody Note note,
                                   @RequestParam String token) throws FirebaseMessagingException {
        return sendNotificationManager.sendNotification(note, token);
    }
}
