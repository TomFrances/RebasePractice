package com.example.demo.student;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public interface StudentEndpoint {
    @ApiResponse(responseCode = "200")
    @ApiResponse(responseCode = "404", description = "Student not found", content = @Content(schema = @Schema(implementation = Exception.class)))
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "api/v1/student")
    public List<Student> getStudents();


}
