import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class GetFile {
    public static void main(String args[]){
	new GetFile();
    }
    public GetFile(){
	try {
		for(int i=14; i<=18; i++){
	    URI uri =new URI("http://g.e-hentai.org/s/3cd647a352/818017-" + i);
	    URL url=uri.toURL();/*url�̎擾*/
	    URLConnection urlcon =url.openConnection();/*�T�C�g�ւ̐ڑ�*/
	    InputStream fileIS =urlcon.getInputStream();/*�ۑ��f�[�^�̎擾*/
	    File saveFile = new File("a" + i +".jpg");/*�t�@�C���̖��O�t��*/
	    FileOutputStream fileOS = new FileOutputStream(saveFile);/* �t�@�C���̕ۑ�*/
	    int c;
	    while((c =fileIS.read()) != -1) 
	    fileOS.write((byte) c);
	    fileOS.close();
	    fileIS.close();
		}
	} catch (URISyntaxException e) {
	   System.err.println(e);
	} catch (MalformedURLException e) {
	   System.err.println(e);
	} catch (IOException e) {
	   System.err.println(e);
	}
    }
}