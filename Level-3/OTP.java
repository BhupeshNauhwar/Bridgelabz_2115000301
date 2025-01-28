import java.util.*;

class NumberChecker {

public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); 
    }

    
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[] otps = new int[10]; 

        
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        
        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
