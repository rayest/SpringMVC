package cn.ipay.QRCode;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.swetake.util.Qrcode;

import javax.imageio.ImageIO;
import java.awt.*;
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


public class QRCode {
    // 生成二维码
    public void createQRCodeByZxing() {
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

    // 读取二维码
    public Result readQRCodeByZxing() {
        MultiFormatReader formatReader = new MultiFormatReader();
        File file = new File("F:/code/zxing.png"); // 获取二维码的路径
        BufferedImage image = null;
        try {
            image = ImageIO.read(file); // 读取文件
        } catch (IOException e) {
            e.printStackTrace();
        }
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image))); // 获取文件资源
        HashMap hints = new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        Result result = null;
        try {
            result = formatReader.decode(binaryBitmap, hints); // 解析二维码
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    // QRCode
    public void createQRCodeByQR() throws IOException {
        Qrcode qrcode = new Qrcode();
        qrcode.setQrcodeErrorCorrect('M');  // 纠错等级
        qrcode.setQrcodeEncodeMode('B'); // N 代表数字，A 代表 a-Z，B 代表其他字符
        qrcode.setQrcodeVersion(7); // 版本
        String qrDataString = "https://github.com/rayest";
        int width = 67 + 12 * (7 -1); // 固定的公式
        int height = 67 + 12 * (7 -1);
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setBackground(Color.WHITE); // 二维码的背景设置为白色
        graphics2D.setColor(Color.BLACK); // 设置二维码的颜色为黑色
        graphics2D.clearRect(0, 0, width, height);
        int pixoff = 2; // 偏移量

        byte[] qrDataBytes = qrDataString.getBytes("gb2312"); // 如果有中文的话，需要加此
        if (qrDataBytes.length > 0 && qrDataBytes.length < 120) {
            boolean[][] calculatedQrCode = qrcode.calQrcode(qrDataBytes);
            for (int i = 0; i < calculatedQrCode.length; i++) {
                for (int j = 0; j < calculatedQrCode.length; j++) {
                    if (calculatedQrCode[j][i]) {
                        graphics2D.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                    }
                }
            }
        }
        graphics2D.dispose(); // 关闭 java 的绘图
        bufferedImage.flush(); // 关闭输入流
        ImageIO.write(bufferedImage, "png", new File("F:/code/qrCode.png")); // 将二维码写入内存
    }
}
