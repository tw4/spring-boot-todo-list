package mertsabinov.todo.dataAccess.abstracts;

import mertsabinov.todo.entities.concretes.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoDao extends JpaRepository<Todo, Integer>{
    Todo getByid(int id);
}
