package other;

/**
 * Created by jc302404 on 4/05/15.
 */
public class TestAccess2 {
        public static void main(String[] args) {
            MyData myData = new MyData();
            // myData.secret_data = 0;
            myData.inheritedData = 42;
            myData.packageData = 42;
            myData.globalData = 42;


        }
    }

