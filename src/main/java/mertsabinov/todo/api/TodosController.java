package mertsabinov.todo.api;


import mertsabinov.todo.business.abstracts.TodoServices;
import mertsabinov.todo.core.utilities.result.Result;
import mertsabinov.todo.core.utilities.result.ResultData;
import mertsabinov.todo.entities.concretes.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/todos")
public class TodosController {

    private TodoServices todoServices;

    @Autowired
    public TodosController(TodoServices todoServices) {
        this.todoServices = todoServices;
    }

    @GetMapping("/getall")
    public ResultData<List<Todo>> getAll(){
        return this.todoServices.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Todo todo){
        return this.todoServices.add(todo);

    };

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Todo todo){
        return this.todoServices.delete(todo);
    };

    @GetMapping("/getAllByPage")
    public ResultData<List<Todo>> getAllByPage(@RequestParam int pageNo, @RequestParam int pageSize){
        return this.todoServices.getAllByPage(pageNo, pageSize);
    }

    @GetMapping("/getById")
    public ResultData<Todo> getById(@RequestParam int id){
        return this.todoServices.getTodoById(id);
    }
    
    @PutMapping("/update")
    public Result update(@RequestBody Todo todo){
        return this.todoServices.update(todo);
    }
}
