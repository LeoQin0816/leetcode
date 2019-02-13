import java.util.HashMap;
import java.util.Map;

public class Program
{
    private static Map<String, Integer> ageStorage = new HashMap<String, Integer>();

    public int GetAge(String name)
    {
        if (ageStorage.containsKey(name))
        {
            return ageStorage.get(name);
        }
        return 0;
    }

    // 其它代码
    public static void main(String[] args) {
        ageStorage.put("a", null);
        System.out.println(new Program().GetAge("a"));
    }
}