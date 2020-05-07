package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int player_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public void add(Player player) {

    }

    public void findByName(String name){

    }

    public void delete(Player player) {
    }

    public String createPlayer() {

    }
}
