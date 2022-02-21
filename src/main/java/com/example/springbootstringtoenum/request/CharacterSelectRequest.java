package com.example.springbootstringtoenum.request;


import com.example.springbootstringtoenum.enums.Hero;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CharacterSelectRequest {

    Hero hero;

}
