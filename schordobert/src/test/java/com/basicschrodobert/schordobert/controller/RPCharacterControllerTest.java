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

    /*@Test
    public void givenUserDoesNotExists_whenUserInfoIsRetrieved_then404IsReceived()
            throws ClientProtocolException, IOException {

        // Given
        String name = RandomStringUtils.randomAlphabetic( 8 );
        HttpUriRequest request = new HttpGet( "https://api.github.com/users/" + name );

        // When
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );

        // Then
        assertThat(
                httpResponse.getStatusLine().getStatusCode(),
                equalTo(HttpStatus.SC_NOT_FOUND));
    } */

    /*
    /*package com.baeldung.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.baeldung.web.controller.students.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

    @RunWith(SpringRunner.class)
    @SpringBootTest
    @AutoConfigureMockMvc
    public class StudentControllerIntegrationTest {

        private static final String STUDENTS_PATH = "/students/";

        @Autowired
        private MockMvc mockMvc;

        @Test
        public void whenReadAll_thenStatusIsOk() throws Exception {
            this.mockMvc.perform(get(STUDENTS_PATH))
                    .andExpect(status().isOk());
        }

        @Test
        public void whenReadOne_thenStatusIsOk() throws Exception {
            this.mockMvc.perform(get(STUDENTS_PATH + 1))
                    .andExpect(status().isOk());
        }

        @Test
        public void whenCreate_thenStatusIsCreated() throws Exception {
            Student student = new Student(10, "Albert", "Einstein");
            this.mockMvc.perform(post(STUDENTS_PATH).content(asJsonString(student))
                            .contentType(MediaType.APPLICATION_JSON_VALUE))
                    .andExpect(status().isCreated());
        }

        @Test
        public void whenUpdate_thenStatusIsOk() throws Exception {
            Student student = new Student(1, "Nikola", "Tesla");
            this.mockMvc.perform(put(STUDENTS_PATH + 1)
                            .content(asJsonString(student))
                            .contentType(MediaType.APPLICATION_JSON_VALUE))
                    .andExpect(status().isOk());
        }

        @Test
        public void whenDelete_thenStatusIsNoContent() throws Exception {
            this.mockMvc.perform(delete(STUDENTS_PATH + 3))
                    .andExpect(status().isNoContent());
        }

        private String asJsonString(final Object obj) {
            try {
                return new ObjectMapper().writeValueAsString(obj);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
     */
}

