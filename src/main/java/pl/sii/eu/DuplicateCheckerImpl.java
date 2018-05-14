package pl.sii.eu;


public class DuplicateCheckerImpl implements DuplicateChecker {

    @Override
    public boolean hasDuplicateCharacters(String input){

        input= input.replaceAll(" ", "");

        for(int i=0; i<input.length();i++)
        {
            if (input.indexOf(input.charAt(i), i+1)>-1)
            {
                return true;
            }
        }
        return false;
    }
}
