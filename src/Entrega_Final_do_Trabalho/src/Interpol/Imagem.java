package Interpol;
import javax.swing.ImageIcon;// classe que recebe uma string com o  nome de arquivo imagem, e retorna um JLabel com a imagem
import javax.swing.JLabel;
public class Imagem extends JLabel{
	private static final long serialVersionUID = 1L;
	public JLabel imagem(String arquivoImagem) {
		ImageIcon a=new ImageIcon(getClass().getResource(arquivoImagem));
		JLabel imagem=new JLabel(a);
		return imagem;
	}
}