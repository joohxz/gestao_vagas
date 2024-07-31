package br.com.joaomoraes.gestao_vagas.modules.candidates;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
public class CandidateEntity {
    
    private long id;
    private String name;

    @Pattern(regexp="^(?!\\s*$).+", message=("O campo [username] deve conter um username válido"))
    private String username;

    @Email(message="O campo [email] deve conter um email válido")
    private String email;

    @Length(min=6, max=12)
    private String password;
    private String description;
    private String curriculum;

}
