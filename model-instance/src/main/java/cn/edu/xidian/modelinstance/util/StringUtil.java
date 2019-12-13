package cn.edu.xidian.modelinstance.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class StringUtil {
    public static String getStringFromFile(MultipartFile file) throws IOException {
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(file.getInputStream(), "UTF-8");
        int size;
        while((size = in.read(buffer, 0, buffer.length)) >= 0)
            out.append(buffer, 0, size);
        return out.toString();
    }
}
