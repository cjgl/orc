package cn.cjgl.orc;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class MainTest {

	/**
	 * 
	 * @param args e:/orc/verify_code.jpg
	 * @throws TesseractException
	 */
	public static void main(String[] args) throws TesseractException {
		// TODO Auto-generated method stub
		String file = "";
		if(args.length == 1){
			file = args[0];
		}
		
		//File imageFile = new File("d:/verify_code.jpg");
		File imageFile = new File(file);  
        Tesseract instance = new Tesseract();
        instance.setDatapath("./tessdata");
        //将验证码图片的内容识别为字符串
        String result = instance.doOCR(imageFile);
        System.out.println(result);
	}

}
