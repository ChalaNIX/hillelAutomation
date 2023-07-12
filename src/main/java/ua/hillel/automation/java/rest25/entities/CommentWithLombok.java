package ua.hillel.automation.java.rest25.entities;

import lombok.*;

//lombok - бібліотека створити код за допомогою аннотацій
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data //замінює чотири верхніх аннотації
//@RequiredArgsConstructor
//@NoArgsConstructor
public class CommentWithLombok {
    private Integer id;
    private Integer postId;
    private String name;
    private String email;
    private String body;
}
