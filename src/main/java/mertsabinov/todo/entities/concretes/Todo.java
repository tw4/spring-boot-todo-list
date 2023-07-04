package mertsabinov.todo.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "todos")
@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "done")
    private boolean done;
}
