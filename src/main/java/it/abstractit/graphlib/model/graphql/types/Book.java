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
public class Book {
  private String id;

  private String title;

  private String genderName;

  private Gender gender;

  private List<Author> authors;

  private List<Review> reviews;

  private Double price;

  public Book() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenderName() {
    return genderName;
  }

  public void setGenderName(String genderName) {
    this.genderName = genderName;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public List<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(List<Author> authors) {
    this.authors = authors;
  }

  public List<Review> getReviews() {
    return reviews;
  }

  public void setReviews(List<Review> reviews) {
    this.reviews = reviews;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book{id='" + id + "', title='" + title + "', genderName='" + genderName + "', gender='" + gender + "', authors='" + authors + "', reviews='" + reviews + "', price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Book that = (Book) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(title, that.title) &&
        Objects.equals(genderName, that.genderName) &&
        Objects.equals(gender, that.gender) &&
        Objects.equals(authors, that.authors) &&
        Objects.equals(reviews, that.reviews) &&
        Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, genderName, gender, authors, reviews, price);
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

    private String title;

    private String genderName;

    private Gender gender;

    private List<Author> authors;

    private List<Review> reviews;

    private Double price;

    public Book build() {
      Book result = new Book();
      result.id = this.id;
      result.title = this.title;
      result.genderName = this.genderName;
      result.gender = this.gender;
      result.authors = this.authors;
      result.reviews = this.reviews;
      result.price = this.price;
      return result;
    }

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder genderName(String genderName) {
      this.genderName = genderName;
      return this;
    }

    public Builder gender(Gender gender) {
      this.gender = gender;
      return this;
    }

    public Builder authors(List<Author> authors) {
      this.authors = authors;
      return this;
    }

    public Builder reviews(List<Review> reviews) {
      this.reviews = reviews;
      return this;
    }

    public Builder price(Double price) {
      this.price = price;
      return this;
    }
  }
}
