package it.abstractit.graphlib.model.graphql.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class EnforcedBookResponse implements it.abstractit.graphlib.model.graphql.types.BaseResponse {
  private Integer code;

  private String message;

  private String description;

  private Book book;

  public EnforcedBookResponse() {
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  @Override
  public String toString() {
    return "EnforcedBookResponse{code='" + code + "', message='" + message + "', description='" + description + "', book='" + book + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnforcedBookResponse that = (EnforcedBookResponse) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(message, that.message) &&
        Objects.equals(description, that.description) &&
        Objects.equals(book, that.book);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, description, book);
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
    private Integer code;

    private String message;

    private String description;

    private Book book;

    public EnforcedBookResponse build() {
      EnforcedBookResponse result = new EnforcedBookResponse();
      result.code = this.code;
      result.message = this.message;
      result.description = this.description;
      result.book = this.book;
      return result;
    }

    public Builder code(Integer code) {
      this.code = code;
      return this;
    }

    public Builder message(String message) {
      this.message = message;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder book(Book book) {
      this.book = book;
      return this;
    }
  }
}
