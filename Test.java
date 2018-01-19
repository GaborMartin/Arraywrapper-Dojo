import java.util.Arrays;

public class Test {

    public static void main(String args[]) {
        testAccess();
        testSearch();
        testInsert1();
        testInsert2();
        testDelete1();
        testDelete2();
        testDelete3();
    }

    private static void testAccess() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[] {42, -4, 59});

        assert wrapper.access(0) == 42;
        assert wrapper.access(1) == -4;
        assert wrapper.access(2) == 59;
    }

    private static void testSearch() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[] {42, -4, 59});

        assert wrapper.search(-1) == -1;
        assert wrapper.search(42) == 0;
        assert wrapper.search(-4) == 1;
        assert wrapper.search(59) == 2;
        assert wrapper.search(100) == -1;
    }

    private static void testInsert1() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[] {42, -4, 59});

        wrapper.insert(0, 123);
        assert Arrays.equals(wrapper.getArray(), new int[] {123, 42, -4, 59});
    }

    private static void testInsert2() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[] {42, -4, 59});

        wrapper.insert(2, 123);
        assert Arrays.equals(wrapper.getArray(), new int[] {42, -4, 123, 59});
    }

    private static void testDelete1() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[] {42, -4, 59});

        wrapper.delete(0);
        assert Arrays.equals(wrapper.getArray(), new int[] {-4, 59});
    }

    private static void testDelete2() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[] {42, -4, 59});

        wrapper.delete(1);
        assert Arrays.equals(wrapper.getArray(), new int[] {42, 59});
    }

    private static void testDelete3() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[] {42, -4, 59});

        wrapper.delete(2);
        assert Arrays.equals(wrapper.getArray(), new int[] {42, -4});
    }
}
