package com.careerit.cms.domain;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contact")
@Getter
@Setter
public class Contact {
    @Id
    private String id;
    private String name;
    private String email;
    private String mobile;

}
