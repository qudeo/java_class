package ch11_array.ex8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccountDTO {
    private Long id;
    private String accountNumber;
    private int deposit;
    private int withdraw;
    private String bankingAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public String getBankingAt() {
        return bankingAt;
    }

    public void setBankingAt(String bankingAt) {
        this.bankingAt = bankingAt;
    }

    public AccountDTO() {
    }
    public static Long idValue = 1L;

    public AccountDTO(String accountNumber, int deposit, int withdraw) {
        this.id = idValue++;
        this.accountNumber = accountNumber;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.bankingAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", deposit=" + deposit +
                ", withdraw=" + withdraw +
                ", bankingAt='" + bankingAt + '\'' +
                '}';
    }
}
