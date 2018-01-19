public class Main {

    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        String cmd = args[1];

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        ArrayWrapper wrapper = new ArrayWrapper(array);

        long start = 0, end = 0;
        if ("access".equals(cmd)) {
            int i = Integer.valueOf(args[2]);

            start = System.currentTimeMillis();
            wrapper.access(i);
            end = System.currentTimeMillis();

        } else if ("search".equals(cmd)) {
            int x = Integer.valueOf(args[2]);

            start = System.currentTimeMillis();
            wrapper.search(x);
            end = System.currentTimeMillis();

        } else if ("insert".equals(cmd)) {
            int i = Integer.valueOf(args[2]);
            int x = Integer.valueOf(args[3]);

            start = System.currentTimeMillis();
            wrapper.insert(i, x);
            end = System.currentTimeMillis();

        } else if ("delete".equals(cmd)) {
            int i = Integer.valueOf(args[2]);

            start = System.currentTimeMillis();
            wrapper.delete(i);
            end = System.currentTimeMillis();

        } else {
            System.exit(1);
        }

        System.out.format("%s took: %sms\n", cmd, end - start);
    }
}
