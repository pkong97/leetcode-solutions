// Permutations

public ArrayList<String> permutations(String s) {
	ArrayList<String> results = new ArrayList<String>();
	permutations("", s, results);
	return results;
}

private void permutation(String prefix, String suffix, ArrayList<String> results) {
	if (suffix.length() == 0) {
		results.add(prefix);
	} else {
		for (int i = 0; i < suffix.length(); i++) {
			permutations(prefix + suffix.charAt(i), suffix.substring(0,i)
				+ suffix.substring(i + 1, suffix.length()));
		}
	}
}

public ArrayList<int[]> permutations (int[] a) {
	ArrayList<int[]> results = new ArrayList<int[]>();
	permutations(a, 0, results);
	return results;
}

private void permutations(int[] a, int start, ArrayList<int[]> results) {
	if (start >= a.length) {
		results.add(a.clone());
	} else {
		for (int i = 0; i < a.length; i++) {
			swap(a, start, i);
			permutations(a, start + 1, result);
			swap(a, start, i);
		}
	}
}

private void swap(int[] a, int i, int j) {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
}