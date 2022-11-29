package org.KNUJavaLabs.Ivan;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Task6_4 {
    public static void writeToBinary(String filename, int[] intValues){
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream(filename));

            for(int value: intValues) {
                dos.writeInt(value);
            }

            dos.flush();
            dos.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try{
                assert dos!=null;
                dos.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
    public static byte[] readFromBinary(String filename) {
        byte[] allBytes = new byte[0];
        try {
            allBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return allBytes;
    }
    public static int[] toIntArray(byte[] byteArray){
        int times = Integer.SIZE/Byte.SIZE;
        int[] integers = new int[byteArray.length/times];

        for(int i=0; i<integers.length;++i){
            integers[i] = ByteBuffer.wrap(byteArray,i*times, times).getInt();
        }

        return integers;
    }
    public static void generateIntArray(String filename,int size){
        int[] intArray = new int[size];

        for(int i=0; i<size/2; ++i){
            Random r = new Random();
            intArray[i] = r.nextInt(200);
        }

        for(int i=size/2; i<size; ++i){
            Random r = new Random();
            intArray[i] = r.nextInt(200)-300;
        }

        writeToBinary(filename, intArray);
    }

    public static void main(String[] args) {
        int size = 17;
        generateIntArray("fileF.dat",size);
        int [] fileF= toIntArray(readFromBinary("fileF.dat"));
        int counter1 = 0 ;
        int counter2 = 0 ;
        for (int j : fileF) {
            if (j % 2 == 1) {
                counter2++;
            } else {
                counter1++;
            }
        }
        int [] fileG = new int[counter1];
        int [] fileH = new int[counter2];
        counter1 = 0 ;
        counter2 = 0 ;
        for (int j : fileF) {
            if (j % 2 == 1) {
                fileH[counter1] = j;
                counter1++;
            } else {
                fileG[counter2] = j;
                counter2++;
            }
        }
        writeToBinary("fileG.dat",fileG);
        writeToBinary("fileH.dat",fileH);
    }
}
