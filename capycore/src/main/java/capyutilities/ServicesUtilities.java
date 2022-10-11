package capyutilities;

public abstract class ServicesUtilities {

    protected boolean input_is_empty(String... inputs){
        for (String input: inputs) {
            if (input==null || input.isBlank()){
                return false;
            }
        }
        return true;
    }

}
