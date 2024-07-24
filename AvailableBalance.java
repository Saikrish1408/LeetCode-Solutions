// https://leetcode.com/problems/account-balance-after-rounded-purchase/submissions/1331604757/


public class AccountBalanceACCEPTED {
    public static void main(String[] args) {
        System.out.println(accountBalanceAfterPurchase(11));
    }

    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int accountTotalBalance = 100;
        if(purchaseAmount % 10 == 0) {
            return accountTotalBalance - purchaseAmount;
        }
        int lastDigit = purchaseAmount%10;
        // System.out.println(lastDigit);
        if(lastDigit >= 5) {
            for(int i = 1 ; i <= 5 ; i++) {
                if((purchaseAmount + i) % 10 == 0)
                    return (accountTotalBalance - (purchaseAmount + i));
            }

        }
        if(lastDigit < 5) {
            for(int i = 4 ; i >= 1 ; i--) {
                if((purchaseAmount - i) % 10 == 0)
                    return (accountTotalBalance - (purchaseAmount - i));
            }
        }
        return -1;
    }
}
