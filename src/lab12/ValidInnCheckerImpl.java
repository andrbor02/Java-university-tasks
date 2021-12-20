package lab12;

import java.util.ArrayList;
import java.util.List;

public class ValidInnCheckerImpl implements ValidInnChecker {

    @Override
    public List<String> getValidInn() {
        List<String> inns = new ArrayList<String>();
        inns.add("1234567890");
        inns.add("0987654321");
        inns.add("1234567891");
        return inns;
    }
}