package com.javak8s.userapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class Controller {

    public static List<UserDTO> usuarios = new ArrayList<UserDTO>();

    @PostConstruct
    public void initiateList() {
        UserDTO userDTO = new UserDTO();
        userDTO.setNome("Eduardo");
        userDTO.setCpf("123");
        userDTO.setEndereco("Rua a");
        userDTO.setEmail("eduardo@email.com");
        userDTO.setTelefone("1234-4321");
        userDTO.setDataCadastro(new Date());

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setNome("Luis");
        userDTO2.setCpf("456");
        userDTO2.setEndereco("rua b");
        userDTO2.setEmail("luis@email.com");
        userDTO2.setTelefone("1234-4321");
        userDTO2.setDataCadastro(new Date());

        UserDTO userDTO3 = new UserDTO();
        userDTO3.setNome("Bruna");
        userDTO3.setCpf("678");
        userDTO3.setEndereco("rua c");
        userDTO3.setEmail("bruna@email.com");
        userDTO3.setTelefone("1234-4321");
        userDTO3.setDataCadastro(new Date());

        usuarios.add(userDTO);
        usuarios.add(userDTO2);
        usuarios.add(userDTO3);
    }


    @GetMapping("/")
    public String getMensagem(){
        return "Spring boot is working!!";
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers(){
        return usuarios;
    }



}
