package it.abstractit.graphlib.model.graphql;

import java.lang.String;

@jakarta.annotation.Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2024-12-12T09:43:42.163714Z"
)
@Generated
public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static final String MUTATION_TYPE = "Mutation";

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-12-12T09:43:42.163714Z"
  )
  @Generated
  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String Books = "books";

    public static final String Book = "book";

    public static final String Author = "author";

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2024-12-12T09:43:42.163714Z"
    )
    @Generated
    public static class BOOK_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2024-12-12T09:43:42.163714Z"
    )
    @Generated
    public static class AUTHOR_INPUT_ARGUMENT {
      public static final String Id = "id";
    }
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-12-12T09:43:42.163714Z"
  )
  @Generated
  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String AddReview = "addReview";

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2024-12-12T09:43:42.163714Z"
    )
    @Generated
    public static class ADDREVIEW_INPUT_ARGUMENT {
      public static final String InputReview = "inputReview";
    }
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-12-12T09:43:42.163714Z"
  )
  @Generated
  public static class BOOK {
    public static final String TYPE_NAME = "Book";

    public static final String Id = "id";

    public static final String Title = "title";

    public static final String GenderName = "genderName";

    public static final String Gender = "gender";

    public static final String Authors = "authors";

    public static final String Reviews = "reviews";

    public static final String Price = "price";
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-12-12T09:43:42.163714Z"
  )
  @Generated
  public static class GENDER {
    public static final String TYPE_NAME = "Gender";

    public static final String Id = "id";

    public static final String Name = "name";
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-12-12T09:43:42.163714Z"
  )
  @Generated
  public static class AUTHOR {
    public static final String TYPE_NAME = "Author";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Biography = "biography";
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-12-12T09:43:42.163714Z"
  )
  @Generated
  public static class REVIEW {
    public static final String TYPE_NAME = "Review";

    public static final String Id = "id";

    public static final String Comment = "comment";

    public static final String Rating = "rating";

    public static final String User = "user";
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-12-12T09:43:42.163714Z"
  )
  @Generated
  public static class USER {
    public static final String TYPE_NAME = "User";

    public static final String Id = "id";

    public static final String Name = "name";
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-12-12T09:43:42.163714Z"
  )
  @Generated
  public static class ADDREVIEWRESPONSE {
    public static final String TYPE_NAME = "AddReviewResponse";

    public static final String Book = "book";

    public static final String AverageRating = "averageRating";

    public static final String TopReviews = "topReviews";
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-12-12T09:43:42.163714Z"
  )
  @Generated
  public static class ENFORCEDBOOKRESPONSE {
    public static final String TYPE_NAME = "EnforcedBookResponse";

    public static final String Code = "code";

    public static final String Message = "message";

    public static final String Description = "description";

    public static final String Book = "book";
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-12-12T09:43:42.163714Z"
  )
  @Generated
  public static class ADDBOOKREVIEWINPUT {
    public static final String TYPE_NAME = "AddBookReviewInput";

    public static final String BookId = "bookId";

    public static final String UserId = "userId";

    public static final String Rating = "rating";

    public static final String Comment = "comment";
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-12-12T09:43:42.163714Z"
  )
  @Generated
  public static class BASERESPONSE {
    public static final String TYPE_NAME = "BaseResponse";

    public static final String Code = "code";

    public static final String Message = "message";

    public static final String Description = "description";
  }
}
