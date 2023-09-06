package service;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

import java.util.Arrays;

public class FileServiceImpl  implements MapFunction<String, String>{

    @Override
    public String map(String s) throws Exception {
        return s.toUpperCase();
    }
}
