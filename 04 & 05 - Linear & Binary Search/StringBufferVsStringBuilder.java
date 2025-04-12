    public class StringBufferVsStringBuilder {
        public static void main(String[] args) {
            int numStrings = 1000000;
            String str = "hello";
            long startTimeBuffer = System.nanoTime();
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < numStrings; i++) {
                buffer.append(str);
            }
            long endTimeBuffer = System.nanoTime();
            long timeBuffer = endTimeBuffer - startTimeBuffer;
            long startTimeBuilder = System.nanoTime();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < numStrings; i++) {
                builder.append(str);
            }
            long endTimeBuilder = System.nanoTime();
            long timeBuilder = endTimeBuilder - startTimeBuilder;
            System.out.println("Time taken for StringBuffer: " + timeBuffer + " nanoseconds");
            System.out.println("Time taken for StringBuilder: " + timeBuilder + " nanoseconds");
        }
    }

