package ru.vlapin.demo.demo3.model;
import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PROTECTED;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Data
@Entity
@Builder
@Setter(PRIVATE)
@AllArgsConstructor(access = PRIVATE)
@NoArgsConstructor(access = PROTECTED)
public class Cat {

  //region id and version
  @Id
  @Include
  @GeneratedValue
  @Column(updatable = false, nullable = false)
  UUID id;

  @Version
  int version;
  //endregion

  @NonNull
  @Column(nullable = false)
  String name;
  
  //region equals and hashCode
  //endregion
}
