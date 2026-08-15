

class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean attack = !knightIsAwake;
        return attack;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean
    prisonerIsAwake) {
        boolean spyOrNot = knightIsAwake || archerIsAwake || prisonerIsAwake;
        return spyOrNot;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean signal = !archerIsAwake && prisonerIsAwake;
        return signal;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake,           boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent){
            boolean withDog = false;
            withDog = !archerIsAwake;
            return withDog;
        } else {
            boolean notWithDog = false;
            notWithDog = !knightIsAwake && !archerIsAwake && prisonerIsAwake;
            return notWithDog;
        }
    }
}
