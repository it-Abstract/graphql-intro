package it.abstractit.graphlib.model.graphql.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.annotation.Generated;
import java.lang.Integer;
import java.lang.String;

@Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2024-12-12T09:43:42.163714Z"
)
@it.abstractit.graphlib.model.graphql.Generated
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes(@JsonSubTypes.Type(value = EnforcedBookResponse.class, name = "EnforcedBookResponse"))
public interface BaseResponse {
  Integer getCode();

  String getMessage();

  String getDescription();
}
