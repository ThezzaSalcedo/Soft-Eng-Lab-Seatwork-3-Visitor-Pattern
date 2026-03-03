public class UnliCallTextPackage implements UnliCallsTextOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        return telcoName + 
               (unliCallText ? " offers unlimited calls and texts."
                             : " does NOT offer unlimited calls and texts.");
    }
}