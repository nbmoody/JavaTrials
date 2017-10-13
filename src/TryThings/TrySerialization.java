package TryThings;// Created by natha on 10/5/2017.

// Author: Nathaniel Ben. Moody
// Initial Date: 10/5/2017
// Filename: TrySerialization.java
// Project: JavaTrials


// Imports:
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TrySerialization {

    SimpleClass io = new SimpleClass();

    public void writeObject() throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream("TrySerialization.ser");
        ObjectOutputStream obout = new ObjectOutputStream(fout);
        obout.writeObject(this.io);
        obout.close();
    }



}//end of head class
