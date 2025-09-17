package com.xworkz.writerapp;

import com.xworkz.writerapp.impl.WriterImpl;
import com.xworkz.writerapp.writer.Writer;

public class WriterRunner {

    public static void main(String[] args) {
        Writer writer = new WriterImpl();
        writer.write();
        writer.edit();
        writer.publish();
    }
}
