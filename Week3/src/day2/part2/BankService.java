package day2.part2;

public interface BankService {
    public Account register(String type, String name, String IDCard, String pwd);
    public Account login(String id, String pwd);
}
