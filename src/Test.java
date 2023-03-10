import java.util.Scanner;

class IrisUnlocker extends Unlocker{
    public void scan() {
        System.out.println("Scanning Iris...");
    }

    public boolean evaluate() {
        System.out.println("Checking iris database...");
        return true;
    }

    public void unlock() {
        System.out.println("The door unlocked by iris scanning...");
    }
}

class WifiUnlocker extends Unlocker{
    public void scan() {
        System.out.println("Scanning app id...");
    }

    public boolean evaluate() {
        System.out.println("Checking application id database...");
        return true;
    }

    public void unlock() {
        System.out.println("The door unlocked by app through wifi...");
    }
}

class FingerprintUnlocker extends Unlocker{
    public void scan() {
        System.out.println("Scanning fingerprint...");
    }

    public boolean evaluate() {
        System.out.println("Checking fingerprint database...");
        return true;
    }

    public void unlock() {
        System.out.println("The door unlocked by fingerprint scanning...");
    }
}

class SecureDoor extends IrisUnlocker {
    public SecureDoor() {
    }

    public void unlockDoor() {
        Scanner scan = new Scanner(System.in);
        this.scan();
        if (this.evaluate()) {
            System.out.println("Last Step TFA: Please enter your password suitable for your scan method...");
            int pass = scan.nextInt();
            if (passCheck(pass)) {
                this.unlock();
            } else {
                System.out.println("Your pass is wrong... Cannot unlock...");
            }
        }
    }

    public boolean passCheck(int p) {
        if (this instanceof IrisUnlocker) {
            return (p % 2 == 0) ? true : false;
        }
        /*else if(this instanceof WifiUnlocker){
            return (p%3==0)?true:false;
        }
        else if(this instanceof FingerprintUnlocker){
            return (p%5==0)?true:false;
        }*/
        else {
            return false;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        SecureDoor door = new SecureDoor();

        door.unlockDoor();

    }
}


