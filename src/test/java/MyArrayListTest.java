import com.example.hw2_15.MyArrayList;
import com.example.hw2_15.StringList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyArrayListTest {

    private static final String[] STRINGS =
            {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8", "Ivan9"};
    private static String[] strings_for_add_with_index_expected =
            {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8"};
    private static String[] strings_for_add_with_index_actual =
            {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8", "Ivan9"};
    private static String[] strings_for_add_with_index_expected1 =
            {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7"};
    private static String[] strings_for_add_with_index_actual1 =
            {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8"};
    private static String[] strings_for_set_with_index_expected =
            {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8", "Ivan9"};
    private static String[] strings_for_set_with_index_actual =
            {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8", "Ivan9"};


    private static String[] strings_for_set_with_index_expected1 =
            {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8"};
    private static String[] strings_for_set_with_index_actual1 =
            {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8"};


    private static String[] strings_for_remove_with_item_expected =
            {"Ivan1", "Ivan2", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8", "Ivan9"};
    private static String[] strings_for_remove_with_item_actual =
            {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8", "Ivan9"};


    private static String[] strings_for_remove_with_item_expected1 =
            {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8", "Ivan9"};
    private static String[] strings_for_remove_with_item_actual1 =
            {"Ivan1", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8", "Ivan9"};


    private static String[] strings_for_remove_with_index_expected = {"Ivan1", "Ivan2", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8", "Ivan9"};
    private static String[] strings_for_remove_with_index_actual = {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8", "Ivan9"};


    private static String[] strings_for_remove_with_index_expected1 = {"Ivan1", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8", "Ivan9"};
    private static String[] strings_for_remove_with_index_actual1 = {"Ivan1", "Ivan2", "Petr1", "Ivan3", "Ivan4", "Ivan5", "Ivan6", "Ivan7", "Ivan8", "Ivan9"};


    private static final MyArrayList STRING_ARRAYLIST = new MyArrayList(STRINGS);
    private static MyArrayList stringArraylist_for_add_with_index_expected = new MyArrayList(strings_for_add_with_index_expected);
    private static MyArrayList stringArraylist_for_add_with_index_actual = new MyArrayList(strings_for_add_with_index_actual);
    private static MyArrayList stringArraylist_for_add_with_index_expected1 = new MyArrayList(strings_for_add_with_index_expected1);
    private static MyArrayList stringArraylist_for_add_with_index_actual1 = new MyArrayList(strings_for_add_with_index_actual1);
    private static MyArrayList stringArraylist_for_set_with_index_expected = new MyArrayList(strings_for_set_with_index_expected);
    private static MyArrayList stringArraylist_for_set_with_index_actual = new MyArrayList(strings_for_set_with_index_actual);
    private static MyArrayList stringArraylist_for_set_with_index_expected1 = new MyArrayList(strings_for_set_with_index_expected1);
    private static MyArrayList stringArraylist_for_set_with_index_actual1 = new MyArrayList(strings_for_set_with_index_actual1);
    private static MyArrayList stringArraylist_for_remove_with_item_expected = new MyArrayList(strings_for_remove_with_item_expected);
    private static MyArrayList stringArraylist_for_remove_with_item_actual = new MyArrayList(strings_for_remove_with_item_actual);
    private static MyArrayList stringArraylist_for_remove_with_item_expected1 = new MyArrayList(strings_for_remove_with_item_expected1);
    private static MyArrayList stringArraylist_for_remove_with_item_actual1 = new MyArrayList(strings_for_remove_with_item_actual1);
    private static MyArrayList stringArraylist_for_remove_with_index_expected = new MyArrayList(strings_for_remove_with_index_expected);
    private static MyArrayList stringArraylist_for_remove_with_index_actual = new MyArrayList(strings_for_remove_with_index_actual);
    private static MyArrayList stringArraylist_for_remove_with_index_expected1 = new MyArrayList(strings_for_remove_with_index_expected1);
    private static MyArrayList stringArraylist_for_remove_with_index_actual1 = new MyArrayList(strings_for_remove_with_index_actual1);

    @Test
    public static Stream<Arguments> remove_method_of_StringArraylist_index_success() {
        return Stream.of(

                Arguments.of(stringArraylist_for_remove_with_index_actual, stringArraylist_for_remove_with_index_expected, 2, "Petr1"),
                Arguments.of(stringArraylist_for_remove_with_index_actual1, stringArraylist_for_remove_with_index_expected1, 1, "Ivan2")
        );
    }

    @Test
    public static Stream<Arguments> remove_method_of_StringArraylist_item_success() {
        return Stream.of(
                Arguments.of(stringArraylist_for_remove_with_item_actual, stringArraylist_for_remove_with_item_expected, "Petr1"),
                Arguments.of(stringArraylist_for_remove_with_item_actual1, stringArraylist_for_remove_with_item_expected1, "Ivan2")
        );
    }

    @Test
    public static Stream<Arguments> set_method_of_StringArraylist_exception() {
        return Stream.of(
                Arguments.of(stringArraylist_for_set_with_index_expected, 34, "Petr1"),
                Arguments.of(stringArraylist_for_set_with_index_expected1, -2, "Ivan2")
        );
    }

    @Test
    public static Stream<Arguments> set_method_of_StringArraylist_success() {
        return Stream.of(
                Arguments.of(stringArraylist_for_set_with_index_expected, stringArraylist_for_set_with_index_actual, 2, "Petr1"),
                Arguments.of(stringArraylist_for_set_with_index_expected1, stringArraylist_for_set_with_index_actual1, 1, "Ivan2")
        );
    }

    @Test
    public static Stream<Arguments> add_method_of_StringArraylist_success() {
        return Stream.of(
                Arguments.of(stringArraylist_for_add_with_index_expected, stringArraylist_for_add_with_index_actual, "Ivan9"),
                Arguments.of(stringArraylist_for_add_with_index_expected1, stringArraylist_for_add_with_index_actual1, "Ivan8")
        );
    }

    @Test
    public static Stream<Arguments> get_method_of_StringArraylist_success() {
        return Stream.of(
                Arguments.of(STRING_ARRAYLIST, 0, "Ivan1"),
                Arguments.of(STRING_ARRAYLIST, 1, "Ivan2"),
                Arguments.of(STRING_ARRAYLIST, 2, "Petr1")
        );
    }

    @Test
    public static Stream<Arguments> get_method_of_StringArraylist_exception() {
        return Stream.of(
                Arguments.of(STRING_ARRAYLIST, 19),
                Arguments.of(STRING_ARRAYLIST, -1),
                Arguments.of(STRING_ARRAYLIST, 43)
        );
    }

    @Test
    public static Stream<Arguments> equals_method_of_StringArraylist_success() {
        return Stream.of(
                Arguments.of(STRING_ARRAYLIST, new MyArrayList(STRING_ARRAYLIST)),
                Arguments.of(STRING_ARRAYLIST, new MyArrayList(STRINGS))
        );
    }

    @Test
    public static Stream<Arguments> contains_method_of_StringArraylist_success() {
        return Stream.of(
                Arguments.of(STRING_ARRAYLIST)
        );
    }

    @Test
    public static Stream<Arguments> indexOf_method_of_StringArraylist_success() {
        return Stream.of(
                Arguments.of(STRING_ARRAYLIST, "Ivan1", 0)

        );
    }

    @Test
    public void size_with_item_method_of_StringArraylist_success() {
        int excpectedResult = 10;
        Assertions.assertEquals(excpectedResult, STRING_ARRAYLIST.size());
    }

    @Test
    public void isEmpoty_with_item_method_of_StringArraylist_success() {
        StringList stringList = new MyArrayList();
        Assertions.assertTrue(stringList.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("indexOf_method_of_StringArraylist_success")
    public void lastIndexOf_with_item_method_of_StringArraylist_success(StringList actualResult, String name, int index) {
        Assertions.assertEquals(actualResult.indexOf(name), index);
    }


    @ParameterizedTest
    @MethodSource("contains_method_of_StringArraylist_success")
    public void contains_with_item_method_of_StringArraylist_success(StringList actualResult) {
        Assertions.assertTrue(actualResult.contains("Ivan1"));
        Assertions.assertTrue(actualResult.contains("Ivan5"));
        Assertions.assertTrue(actualResult.contains("Ivan2"));

    }

    @ParameterizedTest
    @MethodSource("remove_method_of_StringArraylist_index_success")
    public void remove_with_index_method_of_StringArraylist_success(StringList actualResult, StringList expectedResult, int index, String name) {
        Assertions.assertEquals(actualResult.remove(index), name);
        Assertions.assertTrue(expectedResult.equals(actualResult));
    }

    @ParameterizedTest
    @MethodSource("remove_method_of_StringArraylist_item_success")
    public void remove_with_item_method_of_StringArraylist_success(StringList actualResult, StringList expectedResult, String name) {
        Assertions.assertEquals(actualResult.remove(name), expectedResult.remove(name), name);
        Assertions.assertFalse(expectedResult.equals(actualResult));
    }

    @ParameterizedTest
    @MethodSource("set_method_of_StringArraylist_exception")
    public void set_with_index_method_of_StringArraylist_exception(StringList expectedResult, int index, String name) {
        assertThrows(IndexOutOfBoundsException.class,
                () -> {
                    expectedResult.set(index, name);
                });
    }

    @ParameterizedTest
    @MethodSource("set_method_of_StringArraylist_success")
    public void set_with_index_method_of_StringArraylist_success(StringList expectedResult, StringList actualResult, int index, String name) {
        Assertions.assertEquals(expectedResult.set(index, name), name);
        Assertions.assertTrue(expectedResult.equals(actualResult));
    }

    @ParameterizedTest
    @MethodSource("add_method_of_StringArraylist_success")
    public void add_with_index_method_of_StringArraylist_success(StringList expectedResult, StringList actualResult, String name) {
        Assertions.assertEquals(expectedResult.add(name), name);
        Assertions.assertTrue(actualResult.equals(expectedResult));
    }

    @Test
    public void add_with_dynamic_array_method_of_StringArraylist_success() {
        StringList stringList = new MyArrayList();
        stringList.add("Ivan1");
        stringList.add("Ivan2");
        stringList.add("Petr1");
        stringList.add("Ivan3");
        stringList.add("Ivan4");
        stringList.add("Ivan5");
        stringList.add("Ivan6");
        stringList.add("Ivan7");
        stringList.add("Ivan8");
        stringList.add("Ivan9");

    }

    @ParameterizedTest
    @MethodSource("get_method_of_StringArraylist_success")
    public void get_method_of_StringArraylist_success(StringList stringList, int index, String expectedResult) {
        String result = stringList.get(index);
        Assertions.assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @MethodSource("get_method_of_StringArraylist_exception")
    public void get_method_of_StringArraylist_exception(StringList stringList, int index) {
        assertThrows(IndexOutOfBoundsException.class,
                () -> {
                    stringList.get(index);
                });
    }

    @ParameterizedTest
    @MethodSource("equals_method_of_StringArraylist_success")
    public void equals_method_of_StringArraylist_success(StringList actualResult, StringList expectedResult) {
        MyArrayList expectedStringList_false = new MyArrayList();
        Assertions.assertTrue(actualResult.equals(expectedResult));
        Assertions.assertFalse(expectedStringList_false.equals(actualResult));
    }
}



