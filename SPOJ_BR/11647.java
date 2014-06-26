import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 11647{


	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int limite = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		String operador = st.nextToken();
		int num2 = Integer.parseInt(st.nextToken());
		int result = 0;
		
		if (operador.equals("+")) {
			result = num1+num2;
		}
		else{
			result = num1*num2;
		}
		
		sb.append((result>limite) ? "OVERFLOW\n" : "OK\n");
		
		
		
		bw.write(sb.toString());
		bw.flush();

	}
}