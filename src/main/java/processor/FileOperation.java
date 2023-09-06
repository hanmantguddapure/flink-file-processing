package processor;

/*import config.FlinkExecutionEnvironment;*/
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import service.JsonParser;

public class FileOperation {
    final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
    JsonParser fileService=new JsonParser();
    public void readFile() throws Exception {
        System.out.println("Reading file process start");
        String inputFilePath = "src/main/test.json";
        String outputFilePath = "src/main/output.json";

        //DataSet<String> data = env.fromElements("test", "test1");
        DataSet<String> data = env.readTextFile(inputFilePath);
        data = data.map(new JsonParser());
       // data.print();
        data.writeAsText(outputFilePath,org.apache.flink.core.fs.FileSystem.WriteMode.OVERWRITE);
        // Execute the Flink job

       env.execute();
    }
}
