package com.example.fileUpload;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * springboot文件上传
 * @author Arthur
 *
 */
@RestController  //此注解相当于是Controller和Responsebody的合体，返回值会自动进行json格式的转换 
public class FileUploadController {

	@RequestMapping(name = "/fileUpload")
	public Map<String, String> fileUpload(MultipartFile fileName) throws Exception, IOException{
		System.out.println(fileName.getOriginalFilename());
		
//		fileName.transferTo(new File("C:\\Arthur\\picture"+fileName.getOriginalFilename()));
		Map<String, String> map = new HashMap<String, String>();
		map.put("msg", "uploaded");
		return map;
	}
}
