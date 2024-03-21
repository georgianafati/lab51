package exemplul3;
import exemplul1.Persoana;
import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
public class MainApp {
    static void scriere(List< PerecheNumere > lista){
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/numere.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static List<Persoana> citire() {
        try {
            File file=new File("src/main/resources/persoane.json");
            ObjectMapper mapper=new ObjectMapper();
            List<Persoana> persoana = mapper
                    .readValue(file, new TypeReference<List<Persoana>>(){});
            return persoana;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}