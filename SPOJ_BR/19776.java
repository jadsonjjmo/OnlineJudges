import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 19776 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		char carac[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A','B',
				'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M','N',
				'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		
		int aux;
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			if (a.equals("0") && b.equals("0"))
				break;

			int x = Integer.parseInt(a, 36);
			int y = Integer.parseInt(b, 36);
			int z = x + y;
			StringBuilder sb2 = new StringBuilder();
			while (z > 0) {
				aux = z % 36;
				sb2.append(carac[aux]);
				z /= 36;
			}
			sb2.reverse();
			sb.append(sb2.toString()).append("\n");

		}
		bw.write(sb.toString());
		bw.flush();
	}
}
