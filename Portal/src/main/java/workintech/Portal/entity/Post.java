package workintech.Portal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Data;

@Data
@Entity
@Table(name = "post")
@AllArgsConstructor
public class Post {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
    private Long id;

@Column(name = "user_id")
    private Long userId;

@Column(name = "text")
    private String text;
}
