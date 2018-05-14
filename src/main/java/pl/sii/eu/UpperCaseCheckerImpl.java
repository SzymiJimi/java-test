package pl.sii.eu;


public class UpperCaseCheckerImpl implements UpperCaseChecker {

    @Override
    public boolean hasUpperCaseLetters(String input){
        return !input.toLowerCase().equals(input);
    }
}
