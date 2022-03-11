import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("Nama: Karin Oktariani E");
        System.out.println("NIM: 2111522019");
        System.out.println("Tugas 2 Struktur dan Algoritma");
        System.out.println("-----------------------------------");

        System.out.println("Tugas LinkedList");
    
        LinkedList<String> saya = new LinkedList<String>();
        saya.add("K");
        saya.add("A");
        saya.add("R");
        saya.add("I");
        saya.add("N");
        saya.add(" ");
        saya.add("O");
        saya.add("K");
        saya.add("T");
        saya.add("A");
        saya.add("R");
        saya.add("I");
        saya.add("A");
        saya.add("N");
        saya.add("I");
        saya.add(" ");
        saya.add("E");
        
        System.out.println(saya);
    

        

    // Add LinkedList
    saya.addFirst("P");
    saya.addLast("C");
    System.out.println("\nHASIL SETELAH DITAMBAH (DEPAN 7 BELAKANG) = " +saya);
    System.out.println("Size = "+saya.size());

    saya.add("B");
    saya.add("Z");
    System.out.println("HASIL SETELAH DITAMBAH = " +saya);
    System.out.println("Size = "+saya.size());

    // Set LinkedList
    saya.set(3,"V" );
    saya.set(6,"C" );
    saya.set(8,"T" );
    saya.set(13,"U" );

    System.out.println("HASIL SETELAH DISISIPKAN = " +saya);
    System.out.println("Size = "+saya.size());

    // Remove LinkedList
    saya.removeFirst();
    saya.removeLast();
    System.out.println("\nHASIL SETELAH DIHAPUS (DEPAN & BELAKANG)= "+saya);
    System.out.println("Size - "+saya.size());

    saya.remove(0);
    saya.remove(2);
    saya.remove(4);
    saya.remove(6);
    saya.remove(9);
    System.out.println("\nHASIL SETELAH DIHAPUS= "+saya);
    System.out.println("Size= "+saya.size());

    // POP LinkedList
    saya.pop();
    System.out.println("\nHASIL SETELAH di-POP= "+saya);
    System.out.println("Size= "+saya.size());

    //PUSH LinkedList
    saya.push("W");
    saya.push("D");
    System.out.println("\nHASIL SETELAH di-PUSH= "+saya);
    System.out.println("Size= "+saya.size());
   }
}
