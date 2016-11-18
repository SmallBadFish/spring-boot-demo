package com.yin.spring.boot;

import org.springframework.boot.ExitCodeGenerator;

/**
 *
 */
public class ExitException extends RuntimeException implements ExitCodeGenerator {

    public int getExitCode() {
        return 10;
    }
}