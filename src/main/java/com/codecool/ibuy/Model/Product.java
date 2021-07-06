package com.codecool.ibuy.Model;

import com.codecool.ibuy.Model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date addedOn = new Date();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
    ////////////temp hardcoded ???
    private String category;
    ///////////
    private String name;
    @Column(columnDefinition="TEXT")
    private String description;
    private double Price;
    private String imageUrl;

}
