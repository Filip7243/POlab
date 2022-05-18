package com.Lab8;

import java.io.InputStream;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class BlednaWartoscDlaSilniException extends Exception {

    public BlednaWartoscDlaSilniException(String message) {
        super(message);
    }

    public BlednaWartoscDlaSilniException(String message, Throwable cause) {
        super(message, cause);
    }
}
