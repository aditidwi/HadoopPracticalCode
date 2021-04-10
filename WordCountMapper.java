import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<LongWritable,  Text, Text, IntWritable>

{

	@Override
	protected void map(LongWritable key, Text value,
			org.apache.hadoop.mapreduce.Mapper.Context context)
			throws IOException, InterruptedException {
String inputstring = value.toString();
//StringTokenizer stk = new StringTokenizer(inputstring);
//while(stk.hasMoreTokens())
//{
//	context.write(new Text(stk.nextToken()),new IntWritable(1));
//}

//for(int i =0; i<inputstring.split(" ").length;i++)
//{
//	context.write(new Text(inputstring.split(" ")[i]),new IntWritable(1));	

for(String x : inputstring.split(" "))
{
	if (x.equals("Apple") || x.equals("Banana") || x.equals("Grapes")){

		context.write(new Text(x),new IntWritable(1));	
	}
	
}
	}

}