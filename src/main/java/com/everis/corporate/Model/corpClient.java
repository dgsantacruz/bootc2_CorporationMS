package com.everis.corporate.Model;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//This lombok annotation it's a shortcut to @string, @EqualsandHashCode, @Getter and @Setter and @RequiredArgsConstructor
@Data
//This spring data annotation allows to override default collection naming to one I choose.
@Document(collection = "corpClients")
public class CorpClient
{
    @Id
    private String id;
    
    @NotBlank
    private String ruc;

    @NotBlank
    private String corpname;

    @NotBlank
    private String phone;

    @NotBlank
    private String address;
}
