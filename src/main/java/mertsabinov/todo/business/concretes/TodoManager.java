package mertsabinov.todo.business.concretes;

import mertsabinov.todo.business.abstracts.TodoServices;
import mertsabinov.todo.core.utilities.result.Result;
import mertsabinov.todo.core.utilities.result.ResultData;
import mertsabinov.todo.dataAccess.abstracts.TodoDao;
import mertsabinov.todo.entities.concretes.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class TodoManager  implements TodoServices {
    private TodoDao todoDao;

    @Autowired
    public TodoManager(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    @Override
    public ResultData<List<Todo>> getAll() {
        return new ResultData<>(this.todoDao.findAll(),"Todos listed");
    }

    @Override
    public Result add(Todo todo) {
            this.todoDao.save(todo);
            return new Result(true,"Todo added");
    }

    @Override
    public Result delete(Todo todo) {
    if(this.todoDao.findById(todo.getId()).isEmpty()){
        return new Result(false,"Todo not found");
    } else {
        this.todoDao.delete(todo);
        return new Result(true,"Todo deleted");
        }
    }
    @Override
    public ResultData<List<Todo>> getAllByPage(int pageNo, int pageSize) {
        PageRequest pageable = PageRequest.of(pageNo-1, pageSize);
        return new ResultData<>(this.todoDao.findAll(pageable).getContent(),"Todos listed");
    }

    @Override
    public ResultData<Todo> getTodoById(int id) {
        Todo todo = this.todoDao.getByid(id);
        if(todo == null){
            return new ResultData<>(null,"Todo not found",false);
        } else {
            return new ResultData<>(todo,"Todo found");
        }
    }

    @Override
    public Result update(Todo todo) {
        if(this.todoDao.findById(todo.getId()).isEmpty()){
            return new Result(false,"Todo not found");
        } else {
            todo.setDone(!todo.isDone());
            this.todoDao.save(todo);
            return new Result(true,"Todo updated");
        }
    }
}
