    public class WrapperClassDemo {
        public static void main(String[] args) {
            Integer intObj = new Integer(10);
            int intValue = intObj.intValue();
            System.out.println("Integer value: " + intValue);
    
            Double doubleObj = new Double(3.14);
            double doubleValue = doubleObj.doubleValue();
            System.out.println("Double value: " + doubleValue);
    
            String strInt = "20";
            int parsedInt = Integer.parseInt(strInt);
            System.out.println("Parsed Integer value: " + parsedInt);
    
            String strDouble = "3.14159";
            double parsedDouble = Double.parseDouble(strDouble);
            System.out.println("Parsed Double value: " + parsedDouble);
    
            Integer autoboxedInt = 30;
            System.out.println("Autoboxed Integer value: " + autoboxedInt);
    
            Double autoboxedDouble = 2.718;
            System.out.println("Autoboxed Double value: " + autoboxedDouble);
    
            int unboxedInt = autoboxedInt.intValue();
            System.out.println("Unboxed int value: " + unboxedInt);
    
            double unboxedDouble = autoboxedDouble.doubleValue();
            System.out.println("Unboxed double value: " + unboxedDouble);
        }
    }
    

