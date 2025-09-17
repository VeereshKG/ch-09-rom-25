package com.xworkz.writerapp.impl;

import com.xworkz.writerapp.writer.Writer;

public class WriterImpl implements Writer {
    @Override
    public void write() {
        System.out.println("write");
    }

    @Override
    public void edit() {
        System.out.println("edit");
    }

    @Override
    public void publish() {
        System.out.println("publish");
    }
}
