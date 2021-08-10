package assignment.service;

import assignment.interfaces.Writable;
import static assignment.service.ParsingRecordData.parseDataMethod;
import assignment.utils.Validatior;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class ReadnWrite {

    public static void readTXTFile() throws InterruptedException {
        Thread t1 = new Thread(new ReaderFile());
        Thread t2 = new Thread(new WriterFile());
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }

    static class ReaderFile implements Runnable {

        public void run() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the path of source file");
            final String FILE_PATH = input.next();
            BufferedReader readFile = null;
            try {
                String record;
                readFile = new BufferedReader(new FileReader(FILE_PATH));
                while ((record = readFile.readLine()) != null) {
                    if (Validatior.isValidRecord(record)) {
                        parseDataMethod(record);
                    }
                }
                if (ParsingRecordData.beanList.size() > 0) {
                    
                    Collections.sort(ParsingRecordData.beanList);
                    Writable writer = new CSVWriter();
                    writer.writeCSV(ParsingRecordData.beanList);
                }
            } catch (Exception exp) {
                Logs.printLogs("Error is ParseData function Error:" + exp.toString());
            } finally {
                try {
                    if (readFile != null) {
                        readFile.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class WriterFile implements Runnable {

        public void run() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the path of source file for saving invalid output");
            final String FILE_PATH = input.next();
            BufferedReader readFile = null;
            try {
                String record;
                readFile = new BufferedReader(new FileReader(FILE_PATH));
                String INVALIDFILE_PATH = "D:\\Test\\InvalidOutpt.txt";
                BufferedWriter Writer = new BufferedWriter(new FileWriter(INVALIDFILE_PATH));
                while ((record = readFile.readLine()) != null) {
                    if (!Validatior.isValidRecord(record)) {
                        Writer.write(record);
                        Writer.newLine();
                    }
                }
                Writer.flush();
                Writer.close();
            } catch (Exception exp) {
                Logs.printLogs("Error is ParseData function Error:" + exp.toString());
            } finally {
                try {
                    if (readFile != null) {
                        readFile.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
