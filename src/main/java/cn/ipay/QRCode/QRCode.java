package cn.ipay.QRCode;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

/**
 * Created by Rayest on 2016/10/3 0003.
 * 1. 添加 jar 包：  F:\Rayest\jar包
 * 2. 编码
 */

// 生成二维码
public class QRCode {
    public void createQRCode() {
        int width = 300; // 二维码图片的宽度
        int height = 300; // 二维码图片的高度
        String format = "png"; // 二维码的格式
        String content = "https://github.com/rayest"; // 二维码的内容

        // 定义二维码的参数
        HashMap hints = new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8"); // 字符集
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M); // level = M
        hints.put(EncodeHintType.MARGIN, 2); // 图片边距

        // 生成二维码
        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height);
            Path file = new File("F:/code/zxing.png").toPath(); // 生成二维码的保存路径
            MatrixToImageWriter.writeToPath(bitMatrix, format, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Result readQRCode() {
        MultiFormatReader formatReader = new MultiFormatReader();
        File file = new File("F:/code/zxing.png");
        BufferedImage image = null;

        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));
        HashMap hints = new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        Result result = null;
        try {
            result = formatReader.decode(binaryBitmap, hints);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
