import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{

	@Override
	public void reduce(Text key, Iterable<IntWritable> values, Context context)
	throws IOException, InterruptedException {
		int count = 0;
		for(IntWritable x : values)
		{
			count ++;
			
		}
		context.write(key, new IntWritable(count) );
		

//		Text App = new Text("Apple");
//		Text Ban = new Text("Banana");
//		Text Gra = new Text("Grapes");
//		if (key==App)
//		{
//			context.write(App, new IntWritable(y));
//		}
//		else if (key==Ban)
//		{
//			context.write(Ban, new IntWritable(y));
//		}
//		else if (key==Gra)
//		{
//			context.write(Gra, new IntWritable(y));
//		}
//		context.write(key, new IntWritable(count));
	}
}