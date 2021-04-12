package com.homemanagement.springboot.platform.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc

public class HomeManagementControllerTest {

    @Autowired
    private MockMvc mockMvc;

   // private HomeManagementController homeManagementController;

    @Test
    public void testHomeManagementController() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string("Welcome to Home Management App"));

    }


}
