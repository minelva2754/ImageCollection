		// TODO Auto-generated method stub
		import java.io.FileOutputStream;
		import java.io.InputStream;
		import java.io.OutputStream;
		import java.net.URL;

		public class ImageFileFromUrl {

		    public static void main(String[] args) throws Exception {
		        //URLオブジェクト作成
		        URL url = new URL("http://sampledomail.com/sample.jpg");

		        //URLからInputStreamオブジェクトを取得(入力)
		        InputStream in = url.openStream();
		        
		        //出力先ファイル OutputStream(出力)
		        OutputStream out = new FileOutputStream("Desktop/画像");

		        //InputStreamからOutputStreamに出力
		        try {
		            byte[] buf = new byte[1024];
		            int len = 0;

		            while ((len = in.read(buf)) > 0) {  //終わるまで書き込み
		                out.write(buf, 0, len);
		            }
		            
		            out.flush();
		        } finally {
		            out.close();//ストリームをクローズすることを忘れずに
		            in.close();
		        }
		    }
	}
