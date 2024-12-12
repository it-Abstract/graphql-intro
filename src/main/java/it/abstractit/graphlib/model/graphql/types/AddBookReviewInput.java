package it.abstractit.graphlib.model.graphql.types;

import jakarta.annotation.Generated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2024-12-12T09:43:42.163714Z"
)
@it.abstractit.graphlib.model.graphql.Generated
public class AddBookReviewInput {
  private String bookId;

  private String userId;

  private int rating;

  private String comment;

  public AddBookReviewInput() {
  }

  public String getBookId() {
    return bookId;
  }

  public void setBookId(String bookId) {
    this.bookId = bookId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public String toString() {
    return "AddBookReviewInput{bookId='" + bookId + "', userId='" + userId + "', rating='" + rating + "', comment='" + comment + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddBookReviewInput that = (AddBookReviewInput) o;
    return Objects.equals(bookId, that.bookId) &&
        Objects.equals(userId, that.userId) &&
        rating == that.rating &&
        Objects.equals(comment, that.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookId, userId, rating, comment);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-12-12T09:43:42.163714Z"
  )
  @it.abstractit.graphlib.model.graphql.Generated
  public static class Builder {
    private String bookId;

    private String userId;

    private int rating;

    private String comment;

    public AddBookReviewInput build() {
      AddBookReviewInput result = new AddBookReviewInput();
      result.bookId = this.bookId;
      result.userId = this.userId;
      result.rating = this.rating;
      result.comment = this.comment;
      return result;
    }

    public Builder bookId(String bookId) {
      this.bookId = bookId;
      return this;
    }

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public Builder rating(int rating) {
      this.rating = rating;
      return this;
    }

    public Builder comment(String comment) {
      this.comment = comment;
      return this;
    }
  }
}
