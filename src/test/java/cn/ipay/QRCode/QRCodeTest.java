package cn.ipay.QRCode;

import org.junit.Test;

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
}
