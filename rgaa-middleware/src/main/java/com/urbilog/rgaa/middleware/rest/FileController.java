package com.urbilog.rgaa.middleware.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.urbilog.rgaa.core.entity.UploadFileResponse;
import com.urbilog.rgaa.core.service.impl.FileStorageService;

import io.swagger.annotations.Api;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RequestMapping("/file")
@Api(value = "/file")
@RestController
public class FileController {

	private static final Logger logger = LoggerFactory.getLogger(FileController.class);

	

//	@PostMapping("/uploadMultipleFiles")
//	public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
//		return Arrays.asList(files).stream().map(file -> uploadFile(file)).collect(Collectors.toList());
//	}

//	@GetMapping("/downloadFile/{fileName:.+}")
//	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
//		// Load file as Resource
//		Resource resource = fileStorageService.loadFileAsResource(fileName);
//
//		// Try to determine file's content type
//		String contentType = null;
//		try {
//			contentType = request.getSession().getServletContext().getMimeType(resource.getFile().getAbsolutePath());
//		} catch (IOException ex) {
//			logger.info("Could not determine file type.");
//		}
//
//		// Fallback to the default content type if type could not be determined
//		if (contentType == null) {
//			contentType = "application/octet-stream";
//		}
//
//		return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
//				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
//				.body(resource);
//	}
}
