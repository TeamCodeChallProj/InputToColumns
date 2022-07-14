import java.util.ArrayList;

public class DisplayTheData {

    public static void displayData( ArrayList<String[]> nums ) {

        StringBuilder values;

        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < nums.get(i).length; j++) {
                values = new StringBuilder();

                for ( int k = 0; k < nums.size(); k++ ) {
                    try {
                        values.append( nums.get(i + k)[j] + "," );

                    } catch ( Exception e ) {

                    }
                }

                String[] lastC = values.toString().split(",");

                for ( int l = 0; l < lastC.length; l++ ) {

                    System.out.printf( "%-15s", lastC[l] );
                }
                System.out.println();

            }

        }

    }

}
