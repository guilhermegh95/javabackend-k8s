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
        userDTO.setNome("Luis");
        userDTO.setCpf("456");
        userDTO.setEndereco("rua b");
        userDTO.setEmail("luis@email.com");
        userDTO.setTelefone("1234-4321");
        userDTO.setDataCadastro(new Date());

        UserDTO userDTO3 = new UserDTO();
        userDTO.setNome("Bruna");
        userDTO.setCpf("678");
        userDTO.setEndereco("rua c");
        userDTO.setEmail("bruna@email.com");
        userDTO.setTelefone("1234-4321");
        userDTO.setDataCadastro(new Date());

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
