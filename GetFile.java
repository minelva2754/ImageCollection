import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.ConsoleHandler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;


public class GetFile {
	public static void main(String args[]){
	new GetFile(); 

    }
    public GetFile(){
	try {
		
	    URL url =new URL("http://36.media.tumblr.com/db417a630b5c17a2ce20db5b461135cb/tumblr_n20rgza5Mh1s5lg4ho1_500.jpg");
	    URLConnection urlcon =url.openConnection();/*�T�C�g�ւ̐ڑ�*/
	    InputStream fileIS =urlcon.getInputStream();/*�ۑ��f�[�^�̎擾*/
	    File saveFile = new File("a.png");/*�t�@�C���̖��O�t��*/
	    FileOutputStream fileOS = new FileOutputStream(saveFile);/* �t�@�C���̕ۑ�*/
	    int c;
	    while((c =fileIS.read()) != -1) 
	    fileOS.write((byte) c);
	    fileOS.close();
	    fileIS.close();
		
	} catch (IOException e) {
	   System.err.println(e);
	}
    }
}