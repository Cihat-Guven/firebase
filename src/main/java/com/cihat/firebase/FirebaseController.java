package com.cihat.firebase;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RequestMapping("firebase")
public class FirebaseController {


    @GetMapping("/getToken")
    public String getToken() throws FirebaseAuthException {
        return FirebaseAuth.getInstance().createCustomToken("aselsis");
    }
}
