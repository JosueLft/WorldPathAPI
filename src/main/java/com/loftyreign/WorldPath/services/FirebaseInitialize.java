package com.loftyreign.WorldPath.services;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service
public class FirebaseInitialize {

    @PostConstruct
    public void Initialize() {
        FileInputStream serviceAccount = null;
        try {
            serviceAccount = new FileInputStream("./ServiceAccount.json");

        FirebaseOptions options = null;
            options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();
            FirebaseApp.initializeApp(options);
        } catch (FileNotFoundException e) {
            System.err.println("INITIALIZE ERROR FILENOTFOUND");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("INITIALIZE ERROR IOEXCEPTION");
            e.printStackTrace();
        }
    }
}