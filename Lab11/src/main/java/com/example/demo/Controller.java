package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @RequestMapping("/player")
    @Autowired

    Player player;


    @GetMapping ("/{id}")
    public List<Player> getPlayers() {
       // List<Player> players = player.find


        return players;
    }


    @PostMapping
    public  ResponseEntity<String> createPlayer (@RequestBody Player player) {
        player.add(player);
        return new ResponseEntity<>("Player created", HttpStatus.CREATED);
    }

    @PutMapping("/{name}")
    public ResponseEntity<String> changeName (@PathVariable String name, @RequestBody String newName){
        if (player.getName()== null) {
            return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
        }
        player.setName(newName);
        return new ResponseEntity<>("Player updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{name}")
    public ResponseEntity<String> deletePlayer(@PathVariable String name) {
        Player player = player.findByName(name);
        if (player == null) {
            return new ResponseEntity<>("Player not found", HttpStatus.GONE);
        }
        player.delete(player);
        return new ResponseEntity<>("Product removed", HttpStatus.OK);
    }

}
