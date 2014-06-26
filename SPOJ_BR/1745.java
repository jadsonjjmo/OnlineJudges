import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 1745 {


	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int x = 1;
		while(br.ready()){
		sb.append("Instancia ").append(x).append("\n");
		
		int quant = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int soma = 0;
		boolean bool = false;
		
		for(int i = 1 ; i<=quant ; i++){
		int num = Integer.parseInt(st.nextToken());
		if(soma==num){
			sb.append(soma).append("\n\n");
			bool = true;
			break;
		}
		soma+=num;
		}
		
		if(bool==false){
			sb.append("nao achei\n\n");
		}
		
		x++;
		}		
		
		bw.write(sb.toString());
		bw.flush();
	}
	
}