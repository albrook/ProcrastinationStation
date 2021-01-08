package ConceptualCode.ConceptualModel;
import org.json.*;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class WriteToJson {

    public static void main(String[] args) throws Exception {
        String filename = "test.json";
        JSONObject obj = new JSONObject();
        obj.put("Name", "Hello");
        obj.put("Age", 22);
        JSONArray objects = new JSONArray();
        objects.put(1);
        objects.put("here");
        objects.put(2);
        obj.put("Objects", objects);
        Files.write(Paths.get(filename), Collections.singleton(obj.toString()));
    }
}
