package JavaIOAssignment;

import java.io.*;
import java.util.Properties;

/**
 * =========================================================
 * Assignment-15 : Java IO
 * =========================================================
 */

public class JavaIOAssignment {

    public static void main(String[] args) {

        // =================================================
        // 1. Read Text Using InputStream
        // =================================================

        System.out.println("===== 1. InputStream =====");

        try (FileInputStream fis = new FileInputStream("sample.txt")) {

            int data;

            while ((data = fis.read()) != -1) {

                System.out.print((char) data);
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("\n\n=================================\n");

        // =================================================
        // 2. Write Text Using OutputStream
        // =================================================

        System.out.println("===== 2. OutputStream =====");

        try (FileOutputStream fos = new FileOutputStream("output.txt")) {

            String text = "Written using FileOutputStream";

            fos.write(text.getBytes());

            System.out.println(
                    "Data Written Successfully");

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("\n=================================\n");

        // =================================================
        // 3. BufferedInputStream
        // =================================================

        System.out.println(
                "===== 3. BufferedInputStream =====");

        try (
                BufferedInputStream bis = new BufferedInputStream(
                        new FileInputStream(
                                "sample.txt"))) {

            int data;

            while ((data = bis.read()) != -1) {

                System.out.print((char) data);
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("\n\n=================================\n");

        // =================================================
        // 4. BufferedOutputStream
        // =================================================

        System.out.println(
                "===== 4. BufferedOutputStream =====");

        try (
                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream(
                                "output.txt",
                                true))) {

            String text = "\nWritten using BufferedOutputStream";

            bos.write(text.getBytes());

            bos.flush();

            System.out.println(
                    "Buffered Write Successful");

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("\n=================================\n");

        // =================================================
        // 5. FileReader
        // =================================================

        System.out.println(
                "===== 5. FileReader =====");

        try (FileReader reader = new FileReader("sample.txt")) {

            int data;

            while ((data = reader.read()) != -1) {

                System.out.print((char) data);
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("\n\n=================================\n");

        // =================================================
        // 6. FileWriter
        // =================================================

        System.out.println(
                "===== 6. FileWriter =====");

        try (FileWriter writer = new FileWriter("output.txt")) {

            writer.write(
                    "Written using FileWriter");

            System.out.println(
                    "FileWriter Success");

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("\n=================================\n");

        // =================================================
        // 7. BufferedReader
        // =================================================

        System.out.println(
                "===== 7. BufferedReader =====");

        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(
                                "sample.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("\n=================================\n");

        // =================================================
        // 8. BufferedWriter
        // =================================================

        System.out.println(
                "===== 8. BufferedWriter =====");

        try (
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(
                                "output.txt",
                                true))) {

            bw.newLine();

            bw.write(
                    "Written using BufferedWriter");

            System.out.println(
                    "BufferedWriter Success");

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("\n=================================\n");

        // =================================================
        // 9. Read Properties File
        // =================================================

        System.out.println(
                "===== 9. Properties File =====");

        try {

            Properties properties = new Properties();

            FileInputStream fis = new FileInputStream(
                    "config.properties");

            properties.load(fis);

            System.out.println(
                    "Name : "
                            + properties.getProperty(
                                    "name"));

            System.out.println(
                    "Course : "
                            + properties.getProperty(
                                    "course"));

            System.out.println(
                    "Location : "
                            + properties.getProperty(
                                    "location"));

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("\n=================================\n");

        // =================================================
        // 10. Read Data From Excel
        // =================================================

        /*
         * Reading Excel files requires
         * Apache POI library.
         *
         * Since external libraries may not
         * be available in assignment setup,
         * CSV is used as a lightweight
         * Excel alternative.
         */

        System.out.println(
                "===== 10. Read Excel (CSV Demo) =====");

        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(
                                "students.csv"))) {

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("\n=================================\n");

        // =================================================
        // 11. Write Data To Excel
        // =================================================

        /*
         * Using CSV as Excel-compatible format
         */

        System.out.println(
                "===== 11. Write Excel (CSV Demo) =====");

        try (
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(
                                "students_output.csv"))) {

            bw.write("ID,Name,Marks");
            bw.newLine();

            bw.write("201,David,95");
            bw.newLine();

            bw.write("202,Emma,89");

            System.out.println(
                    "CSV File Created Successfully");

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println(
                "\n=================================\n");

        System.out.println(
                "All Java IO Examples Executed Successfully");
    }
}
