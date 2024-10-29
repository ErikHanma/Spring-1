package Proj.library.controler;

import Proj.library.model.Author;
import Proj.library.repository.AuthorRepository;
import Proj.library.repository.GenericRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.awt.*;

@RestController
@RequestMapping("/authors")
@Tag(name = "Авторы", description = "Контроллер для работы с авторами из библиотеки")
public class AuthorController extends GenericController<Author> {
    public AuthorController(GenericRepository<Author> genericRepository) {
        super(genericRepository);
    }

//    @Operation(description = "Получить запись по Id", method = "getOneById")
//    @RequestMapping(value = "/getOneById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Author> getOneById(@RequestParam(value = "id") long id) {
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(authorRepository.findById(id).orElseThrow(() -> new NotFoundException("Данные не найдены")));
//    }


}
