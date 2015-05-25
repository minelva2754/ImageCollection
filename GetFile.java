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
	    URL url=uri.toURL();/*urlの取得*/
	    URLConnection urlcon =url.openConnection();/*サイトへの接続*/
	    InputStream fileIS =urlcon.getInputStream();/*保存データの取得*/
	    File saveFile = new File("a" + i +".jpg");/*ファイルの名前付け*/
	    FileOutputStream fileOS = new FileOutputStream(saveFile);/* ファイルの保存*/
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