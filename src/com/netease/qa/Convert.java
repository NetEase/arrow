package com.netease.qa;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 * Convert GBK encoding file to UTF-8.
 * @author jingcheng01@gmail.com
 *
 */
public class Convert {

	public static void main(String[] args) {
		String srcFilePath = args[0];
        String destFilePath;
        if (args.length == 1) {
            destFilePath = srcFilePath;
        } else {
            destFilePath = args[1];
        }

        File srcFile = new File(srcFilePath);
        File destFile = new File(destFilePath);

        try {
            // Overwrite original file
            if (srcFile.equals(destFile)) {
                FileUtils.copyFile(srcFile, new File(srcFilePath + ".tmp"));
                srcFile =  new File(srcFilePath + ".tmp");
            }

            FileUtils.writeLines(destFile, "UTF-8", FileUtils.readLines(srcFile, "GBK"));
            if ((new File(srcFilePath + ".tmp")).exists()) {
                new File(srcFilePath + ".tmp").delete();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
