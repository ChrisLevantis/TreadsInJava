/// Chris Levantis 321-2020110
/// Συγνωμη για τα σχολια στο τελευταιο ερωτημα, το VS code βαζει τα αστερακια...
/// Συνοπτικα για καθε κλαση thread κανουμε τα ιδια , κατεβαζει την ιστοσελιδα και την αποθηκευει σε ενα αρειο (πχ page1.html) 
/// μετα ανοιγουμε αυτο το αρχειο για να το διαβασουμε και να βρουμε τις λεξεις που θελουμε
/// καθε κλαση ειναι ενα link, κανουμε τις ενεργειες για το καθενα, αντοιστοιχα
import java.io.*;
import java.net.URL;
import java.util.*;
import java.net.MalformedURLException;

/// Done
class thread1 extends Thread {
    public void run() {

        System.out.println("Thread 1 is running...");

        String Drama = "Drama";
        String Action = "Action";
        String Comedy = "Comedy";

        /* download page */
        try {

            // Δημιουργια URL object
            URL url = new URL(
                    "https://www.imdb.com/search/title/?title_type=tv_series&release_date=2020-01-01,2021-12-31&countries=us");
            BufferedReader readr = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter("page1.html"));

            // Διαβασε καθε γραμμη μεχρι το τελος
            String line;
            while ((line = readr.readLine()) != null) {
                writer.write(line);
            }

            readr.close();
            writer.close();
            System.out.println("Successfully Downloaded Page1.");
        } catch (MalformedURLException mue) {
            System.out.println("Malformed URL Exception raised");
        } catch (IOException ie) {
            System.out.println("IOException raised");
        }

        /* read file */
        try {
            File myObj = new File("page1.html");
            Scanner myReader = new Scanner(myObj);
            String delimiters = "\\s+|\\>+|,";

            int counter_drama = 0;
            int counter_action = 0;
            int counter_comedy = 0;
            /*
             * Καθε λεξη που θα διαβαστει θα ελεχθει με την equals αν ειναι ιδιο με το
             * search (που καθε φορα ειναι η λέξη)
             */

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String splString[] = data.split(delimiters);
                for (String word : splString) {
                    if (word.trim().equals(Drama)) {
                        counter_drama++;
                    }
                    if (word.trim().equals(Action)) {
                        counter_action++;
                    }
                    if (word.trim().equals(Comedy)) {
                        counter_comedy++;
                    }
                }
            }
            System.out.println("LINK1 --> Word --> " + Drama + " appears --> " + counter_drama);
            System.out.println("LINK1 --> Word --> " + Action + " appears --> " + counter_action);
            System.out.println("LINK1 --> Word --> " + Comedy + " appears --> " + counter_comedy);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
} // thread 1 end

/// Done
class thread2 extends Thread {
    public void run() {
        System.out.println("Thread 2 is running...");

        String Drama = "Drama";
        String Action = "Action";
        String Comedy = "Comedy";

        /* download page */
        try {

            // Δημιουργια URL object
            URL url = new URL(
                    "https://www.imdb.com/search/title/?title_type=tv_series&release_date=2019-01-01,2019-12-31");
            BufferedReader readr = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter("page2.html"));

            // Διαβασε καθε γραμμη μεχρι το τελος
            String line;
            while ((line = readr.readLine()) != null) {
                writer.write(line);
            }

            readr.close();
            writer.close();
            System.out.println("Successfully Downloaded Page 2.");
        } catch (MalformedURLException mue) {
            System.out.println("Malformed URL Exception raised");
        } catch (IOException ie) {
            System.out.println("IOException raised");
        }

        /* read file */
        try {
            File myObj = new File("page2.html");
            Scanner myReader = new Scanner(myObj);
            String delimiters = "\\s+|\\>+|,";

            int counter_drama = 0;
            int counter_action = 0;
            int counter_comedy = 0;
            /*
             * Καθε λεξη που θα διαβαστει θα ελεχθει με την equals αν ειναι ιδιο με το
             * search (που καθε φορα ειναι η λέξη)
             */

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String splString[] = data.split(delimiters);
                for (String word : splString) {
                    if (word.trim().equals(Drama)) {
                        counter_drama++;
                    }
                    if (word.trim().equals(Action)) {
                        counter_action++;
                    }
                    if (word.trim().equals(Comedy)) {
                        counter_comedy++;
                    }
                }
            }
            System.out.println("LINK2 --> Word --> " + Drama + " appears --> " + counter_drama);
            System.out.println("LINK2 --> Word --> " + Action + " appears --> " + counter_action);
            System.out.println("LINK2 --> Word --> " + Comedy + " appears --> " + counter_comedy);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
} // thread 2 end

/// Done
class thread3 extends Thread {
    public void run() {
        System.out.println("Thread 3 is running...");

        String Drama = "Drama";
        String Action = "Action";
        String Comedy = "Comedy";

        /* download page */
        try {

            // Δημιουργια URL object
            URL url = new URL(
                    "https://www.imdb.com/search/title/?title_type=tv_series&year=2018-01-01,2018-12-31");
            BufferedReader readr = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter("page3.html"));

            // Διαβασε καθε γραμμη μεχρι το τελος
            String line;
            while ((line = readr.readLine()) != null) {
                writer.write(line);
            }

            readr.close();
            writer.close();
            System.out.println("Successfully Downloaded Page 3.");
        } catch (MalformedURLException mue) {
            System.out.println("Malformed URL Exception raised");
        } catch (IOException ie) {
            System.out.println("IOException raised");
        }

        /* read file */
        try {
            File myObj = new File("page3.html");
            Scanner myReader = new Scanner(myObj);
            String delimiters = "\\s+|\\>+|,";
            int counter_drama = 0;
            int counter_action = 0;
            int counter_comedy = 0;
            /*
             * Καθε λεξη που θα διαβαστει θα ελεχθει με την equals αν ειναι ιδιο με το
             * search (που καθε φορα ειναι η λέξη)
             */

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String splString[] = data.split(delimiters);
                for (String word : splString) {
                    if (word.trim().equals(Drama)) {
                        counter_drama++;
                    }
                    if (word.trim().equals(Action)) {
                        counter_action++;
                    }
                    if (word.trim().equals(Comedy)) {
                        counter_comedy++;
                    }
                }
            }
            System.out.println("LINK3 --> Word --> " + Drama + " appears --> " + counter_drama);
            System.out.println("LINK3 --> Word --> " + Action + " appears --> " + counter_action);
            System.out.println("LINK3 --> Word --> " + Comedy + " appears --> " + counter_comedy);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
} /// thread 3 end

/// Done
class thread4 extends Thread {
    public void run() {
        System.out.println("Thread 4 is running...");

        String Drama = "Drama";
        String Action = "Action";
        String Comedy = "Comedy";

        /* download page */
        try {

            // Δημιουργια URL object
            URL url = new URL(
                    "https://www.imdb.com/search/title/?title_type=tv_series&year=2017,2017&sort=moviemeter,asc");
            BufferedReader readr = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter("page4.html"));

            // Διαβασε καθε γραμμη μεχρι το τελος
            String line;
            while ((line = readr.readLine()) != null) {
                writer.write(line);
            }

            readr.close();
            writer.close();
            System.out.println("Successfully Downloaded Page 4.");
        } catch (MalformedURLException mue) {
            System.out.println("Malformed URL Exception raised");
        } catch (IOException ie) {
            System.out.println("IOException raised");
        }

        /* read file */
        try {
            File myObj = new File("page4.html");
            Scanner myReader = new Scanner(myObj);
            String delimiters = "\\s+|\\>+|,";
            int counter_drama = 0;
            int counter_action = 0;
            int counter_comedy = 0;
            /*
             * Καθε λεξη που θα διαβαστει θα ελεχθει με την equals αν ειναι ιδιο με το
             * search (που καθε φορα ειναι η λέξη)
             */

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String splString[] = data.split(delimiters);
                for (String word : splString) {
                    if (word.trim().equals(Drama)) {
                        counter_drama++;
                    }
                    if (word.trim().equals(Action)) {
                        counter_action++;
                    }
                    if (word.trim().equals(Comedy)) {
                        counter_comedy++;
                    }
                }
            }
            System.out.println("LINK4 --> Word --> " + Drama + " appears --> " + counter_drama);
            System.out.println("LINK4 --> Word --> " + Action + " appears --> " + counter_action);
            System.out.println("LINK4 --> Word --> " + Comedy + " appears --> " + counter_comedy);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
} /// thread 4 end

public class ask1Filladio01 {
    public static void main(String args[]) {
        
        /// Aρχικη main...

        /* Tread 1-Link 1 */
        thread1 t1 = new thread1();
        /* Tread 2-Link 2 */
        thread2 t2 = new thread2();
        /* Tread 3-Link 3 */
        thread3 t3 = new thread3();
        /* Thread 4-Link 4 */
        thread4 t4 = new thread4();
        /// start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

/*
 * ΥΠΟΛΟΓΙΣΤΗΚΗ ΔΥΝΑΜΗ --> 4 cores with 4 threads (35% usage of CPU) // RAM 16GB
 * (8.5 in use of 16) // HDD 1 ΤΒ (200 KB/sec)
 * TIME FOR ONE THREAD RUNNING --> 2.338
 * TIME FOR FOUR THREADS RUNNING --> 6.395 (CPU USAGE ΕΦΤΑΣΕ ΕΩΣ 47%)
 * 
 * Κωδικας που χρησιμοποιηθηκε για την main είναι ο παρακάτω (μονο την main
 * αλλαξα, απλα τον εβαλα σε σχολιο για να μην χαλασει το αρχικο προγραμμα,
 * μπορειται να το κανετε αντιγραφη στην main για να το δειτε να τρεχει).
 */

/*
 * /// TESTING TIME FOR 4 TREADS,
 * /// σκοπος ηταν να εκτελειται καθε thread ξεχωριστα δηλαδη να τελιωνει το ενα
 * /// και μετα να αρχιζει το δευτερο, να μην "παρεμβαλει" το ενα το αλλο, αυτο
 * /// γινεται με την εντολη join()
 * /// που "περιμενει" να τελιωσει το thread για να παει στην επομενες γρμμες
 * /// κωδικα.
 * 
 * 
 * /// Tread 1-Link 1
 * thread1 t1 = new thread1();
 * /// Tread 2-Link 2
 * thread2 t2 = new thread2();
 * /// Tread 3-Link 3
 * thread3 t3 = new thread3();
 * /// Tread 4-Link 4
 * thread4 t4 = new thread4();
 * /// start threads
 * long startTime = System.nanoTime();
 * 
 * t1.start();
 * try {
 * t1.join();
 * } catch (InterruptedException e) {
 * // TODO Auto-generated catch block
 * e.printStackTrace();
 * }
 * t2.start();
 * try {
 * t2.join();
 * } catch (InterruptedException e) {
 * // TODO Auto-generated catch block
 * e.printStackTrace();
 * }
 * t3.start();
 * try {
 * t3.join();
 * } catch (InterruptedException e) {
 * // TODO Auto-generated catch block
 * e.printStackTrace();
 * }
 * t4.start();
 * try {
 * t4.join();
 * } catch (InterruptedException e) {
 * // TODO Auto-generated catch block
 * e.printStackTrace();
 * }
 * 
 * long endTime = System.nanoTime();
 * long timeElapsed = endTime - startTime;
 * System.out.println("Time (in seconds) --> " + (timeElapsed / 1000000) *
 * 0.001);
 */

/*
 * ΓΙΑ ΝΑ ΥΠΟΛΟΓΙΣΟΥΜΕ ΕΝΑ THREAD ΧΡΕΙΑΖΟΜΑΣΤΕ ΑΠΛΑ ΜΟΝΟ ΤΟ TREAD t1 ΠΡΟΦΑΝΩΣ
 * ΔΕΝ ΕΚΑΝΑ ΟΛΟ ΤΟ ΚΩΔΙΚΑ ΑΝΤΙΓΡΑΦΗ ΓΙΑΤΙ ΕΙΝΑΙ ΦΑΝΕΡΟ...
 * ...
 * long startTime = System.nanoTime();
 * 
 * t1.start();
 * try {
 * t1.join();
 * } catch (InterruptedException e) {
 * // TODO Auto-generated catch block
 * e.printStackTrace();
 * }
 * ...
 * 
 * long endTime = System.nanoTime();
 * long timeElapsed = endTime - startTime;
 * System.out.println("Time (in seconds) --> " + (timeElapsed / 1000000) *
 * 0.001);
 */