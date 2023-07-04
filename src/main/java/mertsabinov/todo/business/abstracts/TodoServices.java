package mertsabinov.todo.business.abstracts;

import mertsabinov.todo.core.utilities.result.Result;
import mertsabinov.todo.core.utilities.result.ResultData;
import mertsabinov.todo.entities.concretes.Todo;

import java.util.List;

public interface TodoServices {
    ResultData<List<Todo>> getAll();
    Result add(Todo todo);
    Result delete(Todo todo);
    ResultData<List<Todo>> getAllByPage(int pageNo, int pageSize);

    ResultData<Todo> getTodoById(int id);

    Result update(Todo todo);
}
