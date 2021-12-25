package net.taedi.restful.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    private User user;
//
//    @OneToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    public User getUser(){
//        return user;
//    }

    @CreationTimestamp
    private Date createdDate;

    @UpdateTimestamp
    private Date lastModifiedDate;

//    @OneToOne
//    @Column(name = "product_id", nullable = false)
//    private Product product;

}
