package com.loftyreign.WorldPath.controllers;

import com.loftyreign.WorldPath.entities.Player;
import com.loftyreign.WorldPath.services.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping(value = "/players")
public class PlayerController {

    @Autowired
    FirebaseService firebaseService;

    @GetMapping
    public ResponseEntity<Player> GetAll() {
        Player player = new Player("1", "Lofty", "Human", "Warrior");
        return ResponseEntity.ok().body(player);
    }

    @PostMapping("/createPlayer")
    public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
        try {
            Player p1 = firebaseService.savePlayerDetails(player);
            return ResponseEntity.ok().body(p1);
        } catch (ExecutionException e) {
            System.err.println("CREATE PLAYER ERROR EXECUTION EXCEPTION");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println("CREATE PLAYER ERROR INTERRUPTED EXCEPTION");
            e.printStackTrace();
        }
        return ResponseEntity.internalServerError().body(player);
    }
}