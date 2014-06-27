import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 1334 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int x = 1;

		while (true) {

			int tam = Integer.parseInt(br.readLine());
			if (tam == 0)
				break;

			sb.append("Teste ").append(x).append("\n");

			String linha = br.readLine();
			StringBuilder sb2 = new StringBuilder();

			int acumulador = 0;
			char operador = 0;

			for (int i = 0; i < linha.length(); i++) {
				if (Character.isDigit(linha.charAt(i))) {
					sb2.append(linha.charAt(i));
				} else {

					if (operador == '-') {
						acumulador -= Integer.parseInt(sb2.toString());
					} else {
						acumulador += Integer.parseInt(sb2.toString());
					}
					sb2 = new StringBuilder();
					operador = linha.charAt(i);
				}

			}

			if (operador == '-') {
				acumulador -= Integer.parseInt(sb2.toString());
			} else {
				acumulador += Integer.parseInt(sb2.toString());
			}

			sb.append(acumulador).append("\n\n");
			x++;
		}

		bw.write(sb.toString());
		bw.flush();

	}

}