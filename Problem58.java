import java.util.ArrayList;
import java.util.Collections;

import acm.graphics.*;
import acm.program.ConsoleProgram;

public class Problem58 extends ConsoleProgram {
	public void run() {
		int[][] matrica = { { 1, 4 }, { 2, 3 } };
		println(magic(matrica));

		int n = matrica[0].length;
		matricasArray = new ArrayList<Integer>();

		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				matricasArray.add(matrica[j][k]);
			}
		}

		uechMagiuri = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			uechMagiuri.add(i);
		}

	}

	private boolean magic(int[][] matrica) {
		if (matrica.length != matrica[0].length) {
			return false;
		}
		Collections.sort(uechMagiuri);
		Collections.sort(matricasArray);
		if (uechMagiuri == matricasArray) {
			return true;
		} else {

			return false;
		}
	}

	ArrayList<Integer> uechMagiuri;
	ArrayList<Integer> matricasArray;
}
