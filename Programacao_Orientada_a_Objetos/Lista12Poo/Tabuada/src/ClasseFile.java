import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class ClasseFile {
    
    private File caminhoTeste = new File("c:/teste/");

    private File arquivoTabuada = new File("c:/teste/tabuada.txt");

    private String caminhoArquivo = arquivoTabuada.toString();
    
    public void checarSeDiretorioExiste(){
        if(!caminhoTeste.exists()){
            new File("c:/teste").mkdir();
        }
    }
  
    public void criarTabuada(){
        try {
            arquivoTabuada.createNewFile();
            FileWriter textoTabuada = new FileWriter(arquivoTabuada);
            
            for (int i = 1; i <= 10; i++) {
                textoTabuada.write("2 x " + i + " = " + (2 * i) + "\n");
            }
            
            textoTabuada.close();
            
        } catch (Exception e) {
            System.out.println("Ocorreu 1 erro");
            e.printStackTrace();
        }

        }
    public void lerLinha8(){
        try {
            String linha8 = Files.readAllLines(Paths.get(caminhoArquivo)).get(7);
            JOptionPane.showMessageDialog(null, linha8);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
        
    }
}
