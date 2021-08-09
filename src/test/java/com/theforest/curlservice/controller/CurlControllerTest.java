package com.theforest.curlservice.controller;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class CurlControllerTest {

    @Test
    void methodGet() {
        String command =
                "curl http://localhost:8080/clickMe";
        ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
        processBuilder.directory(new File("/home/"));
        Process process = null;
        try {
            process = processBuilder.start();
            InputStream inputStream = process.getInputStream();
            System.out.println(inputStream);
            int i;
            while((i=inputStream.read())!= -1){
                System.out.print((char)i);
            }
            int exitCode = process.exitValue();
            System.out.println("\n" + exitCode);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            process.destroy();
        }
    }
}