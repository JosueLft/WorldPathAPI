package com.loftyreign.WorldPath.services;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.auth.UidIdentifier;
import com.google.firebase.auth.UserIdentifier;
import com.google.firebase.cloud.FirestoreClient;
import com.loftyreign.WorldPath.entities.Player;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.ExecutionException;

@Service
public class FirebaseService {

    public Player savePlayerDetails(Player player) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        Random random = new Random();
        UserIdentifier uid = new UidIdentifier("" + random.nextInt(2));
        //ApiFuture<WriteResult> collectionsApiFuture =
        System.err.println(dbFirestore.collection("players").document(uid.toString()).set(player));
        //System.err.println(collectionsApiFuture.addListener(););

        return player;
    }
}