package com.company.Thread;

import com.company.Warehouse;

import java.io.File;
import java.util.concurrent.Semaphore;

public abstract class ThreadOutputInput {
    private Warehouse warehouse;
    private boolean output = true;
    private File file;
    private static final Semaphore SEMAPHORE = new Semaphore(1, true);

    public ThreadOutputInput(Warehouse warehouse, boolean output) {
        this.warehouse = warehouse;
        this.output = output;
        this.file = new File("warehouse " + warehouse.getAdress() + " product list" + ".dat");
    }
}
