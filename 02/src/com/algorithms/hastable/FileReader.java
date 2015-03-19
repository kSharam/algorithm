package com.algorithms.hastable;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class FileReader {

    public ArrayList<String> readFromFile(String path) throws FileNotFoundException {
        ArrayList<String> intData = new ArrayList<String>();

        Scanner scanner = new Scanner(new File(path));
        //  scanner.nextLine(); //Skip first line

        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            if ((StringUtils.length(string) >= 1  &&
                    StringUtils.isAlpha(string.substring(0, 1))) ||
                    (StringUtils.length(string) == 1 && StringUtils.isAlpha(string))) {
                string.replaceAll("',.!-_%$#@^", "");
                intData.add((string));
            }
        }
        return intData;
    }

    public void printMe(ArrayList<String> input) {

        for (String each : input) {
            System.out.println(each);
        }

    }
}

