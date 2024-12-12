package it.abstractit.graphlib.resolver;

import it.abstractit.graphlib.business.AuthorService;
import it.abstractit.graphlib.model.graphql.types.Author;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class AuthorResolver {

    AuthorService authorService;

    @QueryMapping
    Author author(@Argument String id){
        return authorService.resolveAuthorById(Long.valueOf(id));
    }
}
