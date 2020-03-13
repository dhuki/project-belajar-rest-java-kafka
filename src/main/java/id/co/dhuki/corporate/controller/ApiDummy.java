package id.co.dhuki.corporate.controller;

import net.lingala.zip4j.core.ZipFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@RestController
public class ApiDummy {

    class Anonymous {
        String message;

        // need getter to all model response to bind with JSON
        public String getMessage() {
            return message;
        }
    }

    @GetMapping("/hello")
    public Anonymous helloWorld() {

        Anonymous anonymous = new Anonymous();
        anonymous.message = "Hello World";

        return anonymous;
    }

    @PostMapping("/unzip-file")
    public Anonymous unzipFile(HttpServletRequest request) {

        Anonymous anonymous = new Anonymous();
        String password = "passwor";

        try {

            ZipFile zipFile = new ZipFile("D:\\Program\\Data-project-belajar\\zipFile\\Telkom Eduphoria.zip");
            if (zipFile.isEncrypted()) {
                zipFile.setPassword(password);
            }
            zipFile.extractAll("D:\\Program\\Data-project-belajar\\zipFile");

            anonymous.message = "success";

            return anonymous;

        } catch (Exception e) {
            if (e.toString().contains("Wrong Password")) {
                File file = new File("D:\\Program\\Data-project-belajar\\zipFile\\Telkom Eduphoria.mp4");

                if(file.delete())
                {
                    System.out.println("File deleted successfully");
                }
                else
                {
                    System.out.println("Failed to delete the file");
                }
            }

            return anonymous;
        }
    }

}
