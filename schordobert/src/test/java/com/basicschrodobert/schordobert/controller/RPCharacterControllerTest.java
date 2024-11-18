package com.basicschrodobert.schordobert.controller;

import com.basicschrodobert.schordobert.model.RpCharacter;
import com.basicschrodobert.schordobert.repository.RpCharacterRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RPCharacterControllerTest {

    private static final String CHARACTER_PATH = "/characters";

    @Autowired
    private MockMvc mockMvc;
    // Here the controller junit tests should be added!
    @Autowired
    private static RpCharacterRepository rpCharacterRepository;

    @BeforeEach
    public static void setup() {
        RpCharacter rpCharacter = rpCharacterRepository.save(new RpCharacter("Kalle", 2L));

    }

    @Test
    public void whenReadAll_thenStatusIsOk() throws Exception {
        this.mockMvc.perform(get(CHARACTER_PATH))
                .andExpect(status().isOk());
    }
}

