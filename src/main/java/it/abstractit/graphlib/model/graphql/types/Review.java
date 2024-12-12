package it.abstractit.graphlib.model.graphql.types;

import jakarta.annotation.Generated;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2024-12-12T09:43:42.163714Z"
)
@it.abstractit.graphlib.model.graphql.Generated
public class Review {
  private String id;

  private String comment;

  private Integer rating;

  private User user;

  public Review() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "Review{id='" + id + "', comment='" + comment + "', rating='" + rating + "', user='" + user + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Review that = (Review) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(comment, that.comment) &&
        Objects.equals(rating, that.rating) &&
        Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, comment, rating, user);
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
    private String id;

    private String comment;

    private Integer rating;

    private User user;

    public Review build() {
      Review result = new Review();
      result.id = this.id;
      result.comment = this.comment;
      result.rating = this.rating;
      result.user = this.user;
      return result;
    }

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder comment(String comment) {
      this.comment = comment;
      return this;
    }

    public Builder rating(Integer rating) {
      this.rating = rating;
      return this;
    }

    public Builder user(User user) {
      this.user = user;
      return this;
    }
  }
}
