		// TODO Auto-generated method stub
		import java.io.FileOutputStream;
		import java.io.InputStream;
		import java.io.OutputStream;
		import java.net.URL;

		public class ImageFileFromUrl {

		    public static void main(String[] args) throws Exception {
		        //URL�I�u�W�F�N�g�쐬
		        URL url = new URL("http://sampledomail.com/sample.jpg");

		        //URL����InputStream�I�u�W�F�N�g���擾(����)
		        InputStream in = url.openStream();
		        
		        //�o�͐�t�@�C�� OutputStream(�o��)
		        OutputStream out = new FileOutputStream("Desktop/�摜");

		        //InputStream����OutputStream�ɏo��
		        try {
		            byte[] buf = new byte[1024];
		            int len = 0;

		            while ((len = in.read(buf)) > 0) {  //�I���܂ŏ�������
		                out.write(buf, 0, len);
		            }
		            
		            out.flush();
		        } finally {
		            out.close();//�X�g���[�����N���[�Y���邱�Ƃ�Y�ꂸ��
		            in.close();
		        }
		    }
	}
