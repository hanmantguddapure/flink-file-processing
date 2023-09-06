package processor;

/*import config.FlinkExecutionEnvironment;*/
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import service.FileServiceImpl;

public class FileOperation {
    final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
    FileServiceImpl fileService=new FileServiceImpl();
    public void readFile() throws Exception {
        System.out.println("Reading file process start");
        String inputFilePath = "src/main/Test.txt";

            //DataSet<String> data = env.fromElements("test", "test1");
        DataSet<String> data = env.readTextFile(inputFilePath);
        data = data.map(new FileServiceImpl());

        data.print();
        // Execute the Flink job
      // env.execute();
    }
}
