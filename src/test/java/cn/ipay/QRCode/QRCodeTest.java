package cn.ipay.QRCode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Rayest on 2016/10/3 0003.
 */

public class QRCodeTest {

    @Test
    public void testCreateQRCode() throws Exception {
        QRCode qrCode = new QRCode();
        qrCode.createQRCode();
        assertNotNull(qrCode);
    }

    @Test
    public void testReadQRCode() throws Exception {
        QRCode qrCode = new QRCode();
        Result result = qrCode.readQRCode();
        String resultString = result.toString();
        BarcodeFormat barcodeFormat = result.getBarcodeFormat();
        String content = result.getText();
        assertEquals("https://github.com/rayest", resultString);
        assertEquals(BarcodeFormat.QR_CODE, barcodeFormat);
        assertEquals("https://github.com/rayest", content);
    }
}
