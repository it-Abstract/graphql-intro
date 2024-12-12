package it.abstractit.graphlib.model.graphql.types;

import jakarta.annotation.Generated;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2024-12-12T09:43:42.163714Z"
)
@it.abstractit.graphlib.model.graphql.Generated
public class AddReviewResponse {
  private Book book;

  private Double averageRating;

  private List<String> topReviews;

  public AddReviewResponse() {
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public Double getAverageRating() {
    return averageRating;
  }

  public void setAverageRating(Double averageRating) {
    this.averageRating = averageRating;
  }

  public List<String> getTopReviews() {
    return topReviews;
  }

  public void setTopReviews(List<String> topReviews) {
    this.topReviews = topReviews;
  }

  @Override
  public String toString() {
    return "AddReviewResponse{book='" + book + "', averageRating='" + averageRating + "', topReviews='" + topReviews + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddReviewResponse that = (AddReviewResponse) o;
    return Objects.equals(book, that.book) &&
        Objects.equals(averageRating, that.averageRating) &&
        Objects.equals(topReviews, that.topReviews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(book, averageRating, topReviews);
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
    private Book book;

    private Double averageRating;

    private List<String> topReviews;

    public AddReviewResponse build() {
      AddReviewResponse result = new AddReviewResponse();
      result.book = this.book;
      result.averageRating = this.averageRating;
      result.topReviews = this.topReviews;
      return result;
    }

    public Builder book(Book book) {
      this.book = book;
      return this;
    }

    public Builder averageRating(Double averageRating) {
      this.averageRating = averageRating;
      return this;
    }

    public Builder topReviews(List<String> topReviews) {
      this.topReviews = topReviews;
      return this;
    }
  }
}
