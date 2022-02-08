public class Qfind {
    int n;
    int id[] = new int[11];

    Qfind() {
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return (id[p] == id[q]);
    }

    public void union(int p, int q) {
        if (connected(p, q)) {
            System.out.println("It is already connected");
        } else {
            int pid = id[p];
            int qid = id[q];
            for (int i = 0; i < id.length; i++) {
                if (id[i] == pid) {
                    id[i] = qid;
                }
            }
        }
        getId();
    }

    public void getId() {
        for (int i = 0; i < id.length; i++) {
            System.out.println(id[i]);
        }
    }
}
