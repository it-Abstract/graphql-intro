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
public class Author {
  private String id;

  private String name;

  private String biography;

  public Author() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBiography() {
    return biography;
  }

  public void setBiography(String biography) {
    this.biography = biography;
  }

  @Override
  public String toString() {
    return "Author{id='" + id + "', name='" + name + "', biography='" + biography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Author that = (Author) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(biography, that.biography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, biography);
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

    private String name;

    private String biography;

    public Author build() {
      Author result = new Author();
      result.id = this.id;
      result.name = this.name;
      result.biography = this.biography;
      return result;
    }

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder biography(String biography) {
      this.biography = biography;
      return this;
    }
  }
}
