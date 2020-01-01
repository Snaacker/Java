package com.snaacker.playground.core.file;

import java.io.*;

/**
 * Created by quanghuy on 4/26/2016.
 */
public class FileProcess {

    public void WriteTextFile(String path, String content){
        try {
            java.io.File file = new java.io.File(path);

            if (!file.exists()) {
                file.createNewFile();
            }

            // Append to end of file - incase don't need append, just remove true
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ReadTextFile(String path){
        BufferedReader br = null;

        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(path));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
