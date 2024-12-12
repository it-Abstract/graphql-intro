package it.abstractit.graphlib.model.mapper;

import it.abstractit.graphlib.model.dto.AuthorDto;
import it.abstractit.graphlib.model.dto.BookOverFetchDto;
import it.abstractit.graphlib.model.dto.BookUnderFetchDto;
import it.abstractit.graphlib.model.dto.GenderDto;
import it.abstractit.graphlib.model.dto.ReviewDto;
import it.abstractit.graphlib.model.entity.AuthorEntity;
import it.abstractit.graphlib.model.entity.BookEntity;
import it.abstractit.graphlib.model.entity.GenderEntity;
import it.abstractit.graphlib.model.entity.ReviewEntity;
import it.abstractit.graphlib.model.graphql.types.Author;
import it.abstractit.graphlib.model.graphql.types.Book;
import it.abstractit.graphlib.model.graphql.types.Gender;
import it.abstractit.graphlib.model.graphql.types.Review;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface LibraryMapper {

    BookUnderFetchDto bookToBookDto(BookEntity book);
    BookOverFetchDto bookToBookOverFetchDto(BookEntity book);
    Book bookToBookGraphQl(BookEntity book);

    AuthorDto authorToAuthorDto(AuthorEntity author);
    Author authorToAuthorGraphQl(AuthorEntity author);

    ReviewDto reviewToReviewDto(ReviewEntity review);
    Review reviewToReviewGraphQl(ReviewEntity review);

    GenderDto genderToGenderDto(GenderEntity gender);
    Gender genderToGenderGraphQl(GenderEntity gender);
}
