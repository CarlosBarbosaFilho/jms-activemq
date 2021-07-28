package br.com.cbgomes.jsmtemplate.model;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class MessageDTO implements Serializable {

    private String message;
    private String content;
}
