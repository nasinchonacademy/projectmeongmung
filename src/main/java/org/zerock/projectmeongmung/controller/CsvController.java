package org.zerock.projectmeongmung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.projectmeongmung.service.CsvService;

import java.io.IOException;
import java.util.List;

@RestController
public class CsvController {

    @Autowired
    private CsvService csvService;

    @GetMapping("/read-csv")
    public List<String[]> readCsv() throws IOException {
        // 클래스패스에서 리소스 가져오기
        Resource resource = new ClassPathResource("static/csv/서울시송파구동물병원인허가정보.csv");
        // CSV 파일 경로 얻기
        String filePath = resource.getFile().getPath();

        // CSV 파일
        return csvService.readCsv(filePath);
    }
}
