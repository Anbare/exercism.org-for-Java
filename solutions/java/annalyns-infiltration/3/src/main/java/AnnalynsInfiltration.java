

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
            boolean canFree = 
                petDogIsPresent && !archerIsAwake 
                ||
                !petDogIsPresent && !knightIsAwake && !archerIsAwake && prisonerIsAwake;
            return canFree;
    }
}
