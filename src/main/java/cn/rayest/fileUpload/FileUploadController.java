package cn.rayest.fileUpload;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

/**
 * Created by Rayest on 2016/10/7 0007.
 */
@Controller
public class FileUploadController {

    // 表单页面
    @RequestMapping("/form")
    public ModelAndView form() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/uploadFile/form");
        return modelAndView;
    }


    // 上传处理页面
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView uploadFile(@RequestParam("file") CommonsMultipartFile upfile, HttpServletRequest request) throws IOException {
        String path = request.getRealPath("/fileupload");
        System.out.println(path);

        //获取输入流
        InputStream inputStream = upfile.getInputStream();
        // 文件输出流
        OutputStream outputStream = new FileOutputStream(new File(path, upfile.getOriginalFilename()));
        // 循环写入
        int length = 0;
        byte[] buffer = new byte[128];// ?
        while ((length = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, length);
        }
        inputStream.close();
        outputStream.close();
        // 渲染
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/uploadFile/upload");
        return modelAndView;
    }


}