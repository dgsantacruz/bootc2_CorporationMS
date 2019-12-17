package com.everis.BusinessClientMS.Model;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//This lombok annotation it's a shortcut to @string, @EqualsandHashCode, @Getter and @Setter and @RequiredArgsConstructor
@Data
//This spring data annotation allows to override default collection naming to one I choose.
@Document(collection = "BusinessClients")
public class BusinessClient
{
    @Id
    private String id;
    
    @NotBlank
    private String ruc;

    @NotBlank
    private String businessName;

    @NotBlank
    private String phone;

    @NotBlank
    private String address;
}

