package hello.springmvc.basic;

import lombok.Data;

/**
 * @Getter , @Setter , @ToString , @EqualsAndHashCode , @RequiredArgsConstructor를 자동으로 적용해준다
 */
@Data
public class HelloData {
    private String username;
    private int age;

}