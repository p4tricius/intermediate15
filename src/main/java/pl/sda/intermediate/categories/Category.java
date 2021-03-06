package pl.sda.intermediate.categories;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Category {

    private Integer id;
    private Integer parentId;
    private String name;

}
