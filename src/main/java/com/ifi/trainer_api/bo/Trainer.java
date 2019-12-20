package com.ifi.trainer_api.bo;


import javax.persistence.*;
import java.util.List;
@Entity
public class Trainer {
    @Id
    private String name;

    @Column
    private  String password;

    @Column
    private  String avatar;

    @ElementCollection
    private List<Pokemon> team;

    public Trainer() {
    }

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Pokemon> getTeam() {
        return team;
    }

    public void setTeam(List<Pokemon> team) {
        this.team = team;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}