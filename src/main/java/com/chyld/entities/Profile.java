package com.chyld.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "profiles")
@Data
public class Profile {
    private int id;
    private int version;
    private Enum gender;
    private User user;
    private int age;
    private float height;
    private int weight;
    private String photo;
    private Date created;
    private Date modified;

    @Id
    @GeneratedValue
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    @Version
    public int getVersion() {return version;}
    public void setVersion(int version) {this.version = version;}

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM('M', 'F')")
    public Enum getGender() { return gender; }
    public void setGender(Enum gender) { this.gender = gender; }

    @Column(name = "user_id", nullable = false)
//    @Jsonignore
    public User getUser(User user) { return user; }

    @Column
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Column
    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    @Column
    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    @Column
    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }

    @CreationTimestamp
    public Date getCreated() { return created; }
    public void setCreated(Date created) { this.created = created; }

    @UpdateTimestamp
    public Date getModified() { return modified; }
    public void setModified(Date modified) { this.modified = modified; }
}
