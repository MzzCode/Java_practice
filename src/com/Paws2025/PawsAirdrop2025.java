package com.Paws2025;

public class PawsAirdrop2025 {
	public static void main(String[] args) {
        Runnable pawsLoop = () -> {
            String[] cycle = {
            	"🐾$PAWS Community Nowadays:\n",
                "🍖 Eat",
                "😴 Sleep",
                "⏳ Ask \"wen listing?\"",
                "🔁 Repeat"
            };

            while (true) { 
                for (String action : cycle) {
                    System.out.println(action);
                    try {
                        Thread.sleep(1500); // Pause for better effect
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    System.out.println("🐾 Taking a break... Next cycle in 6 hours 🕒");
                    Thread.sleep(6 * 60 * 60 * 1000); // Sleep for 6 hours
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread pawsThread = new Thread(pawsLoop);
        pawsThread.start(); 
    }
}
