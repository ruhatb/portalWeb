package workintech.Portal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Post")
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;



    @Column(name = "text")
    private String text;


    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}


