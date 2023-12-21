package ch11_array.ex8;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    private static List<ClientDTO> clientDTOList = new ArrayList<>();
    private static List<AccountDTO> accountDTOList = new ArrayList<>();
    private static List<AccountDTO> accountHistoryList = new ArrayList<>();
    public boolean NumberCheck(String number) {
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (number.equals(clientDTOList.get(i).getAccountNumber())) {
                result = true;
            }
        }
        return result;
    }

    public boolean save(ClientDTO clientDTO) {

        return clientDTOList.add(clientDTO);
    }

    public ClientDTO list(String number) {
        ClientDTO clientDTO = null;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (number.equals(clientDTOList.get(i).getAccountNumber())) {
                clientDTO = clientDTOList.get(i);
            }
        }
        return clientDTO;
    }

    public ClientDTO deposit(String number, int deposit) {
        ClientDTO clientDTO = null;
        long money = 0;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (number.equals(clientDTOList.get(i).getAccountNumber())) {
                money = deposit + clientDTOList.get(i).getBalance();
                clientDTOList.get(i).setBalance(money);
                clientDTO = clientDTOList.get(i);
                AccountDTO accountDTO = new AccountDTO(number, deposit, 0);
                accountDTOList.add(accountDTO);

            }
        }
        return clientDTO;
    }

    public ClientDTO withdraw(String number, int withdraw) {
        ClientDTO clientDTO = null;
        long money = 0;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (number.equals(clientDTOList.get(i).getAccountNumber())) {
                money = clientDTOList.get(i).getBalance();
                if (money >= withdraw) {
                    money -= withdraw;
                    clientDTOList.get(i).setBalance(money);
                    clientDTO = clientDTOList.get(i);
                    AccountDTO accountDTO = new AccountDTO(number, 0, withdraw);
                    accountDTOList.add(accountDTO);
                }
            }
        }
        return clientDTO;
    }

    public boolean PassCheck(String Pass) {
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (Pass.equals(clientDTOList.get(i).getClientPass())) {
                result = true;
            }
        }
        return result;

    }

    public List<AccountDTO> findAll(String num) {
        for (int i = 0; i < accountDTOList.size(); i++) {
            if (num.equals(accountDTOList.get(i).getAccountNumber())) {
                accountHistoryList.add(accountDTOList.get(i));
            }
        }
        return accountHistoryList;
    }
}
