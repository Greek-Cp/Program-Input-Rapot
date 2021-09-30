package ppl.tugas.bulan.one;

import java.util.ArrayList;
import java.util.Scanner;


public class NilaiMhsw {
    //RESET COLOR
    public static final String ANSI_RESET = "\u001B[0m";
    // Background
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    // High Intensity backgrounds
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE

    public static void main(String[]args){
        int tot_matkul = 10;

        Scanner oc = new Scanner(System.in);
        String Nama, NIM;
        int Usia;
        double rata_rata = 0;
        boolean isInputNilai = true;
        int Nil_matkul[] = new int[tot_matkul];
        int jumlahNilai = 0;
        for(int x = 0; x<= 20; x++){
            if(x == 0){
                System.out.print("*");
            } else if (x  == 20){
                System.out.print("*");
                System.out.println();
            } else{
                System.out.print("-");

            }
             }
        String Nama_Matkul[] = {"Basis Data" , "Logika Dan Algoritma" , "Pemrograman Dasar",
        "Workshop Perangkat Lunak" , "Matematika Diskrit" , "Agama" , "English" , "Aljabar Linier" , "PKN","Computer Vision" };
        System.out.print("Masukan Nama: ");
        Nama = oc.nextLine();
        System.out.print("Masukan Usia: ");
        Usia = oc.nextInt();
        System.out.print("Masukan NIM: ");
        oc.nextLine();
        NIM = oc.nextLine();
        int iteration = 0;
        System.out.println("\t[MATKUL]\t|\t[NILAI]\t");
        while(isInputNilai){
            System.out.print("\t" + Nama_Matkul[iteration] + "\t" + "=\t");
            Nil_matkul[iteration] = oc.nextInt();
            jumlahNilai += Nil_matkul[iteration];
            iteration++;
            if(iteration % 10 == 0){
                rata_rata = jumlahNilai / tot_matkul;
                System.out.println("INPUT NILAI SELESAI");
                for(int d= 0; d<= 10; d++){
                    System.out.print("*");
                    if(d == 10){
                        System.out.println();
                        System.out.println("Nilai Rata Rata: " + rata_rata);
                    }
                }
                isInputNilai = false;
            }
        }
        //hitung rata rata
        int tot = 0;
        for(int c = 0; c <= Nil_matkul.length - 1 ; c++){
            tot += Nil_matkul[c];
            rata_rata = tot / tot_matkul;
        }
;        //laporan
        for(int t = 0; t<= 2; t++){
            for(int x = 0; x<= 10;x++){
                int v =0 ;
                if(t == 0){
                    System.out.print("-");
                    if(x == 10){
                        System.out.println();
                    }
                } else if ( t == 1 && x >= 2 && x <= 8 && t != 0 && t < 2){
                    System.out.print("-");
                } else{
                    System.out.print(" ");
                    if( x == 10){
                        System.out.println();
                    }
                }
            }
        }
        String RAPOT_RINGKAS[] = {"BSD" , "LDA" , "PDS",
                "WPL" , "MDK" , "AGM" , "ENG" , "ALI" , "PKN","OCV"};


        for(int d = 0 ;d <= RAPOT_RINGKAS.length - 1; d++){
            int v = 10;
            if(d == 0 && d<= 1 && d != 1){
                System.out.println(" "+"[KETERANGAN KODE MAPEL]" + " ");
            } else{
                if(d >= 7 && d<= 10){
                    System.out.println(  " "+d +".\u001B[1;3"+ (v - 4)+"m"+Nama_Matkul[d] + "("+ RAPOT_RINGKAS[d] + ")" +"\u001B[0m");
                    v--;
                } else{
                    System.out.println( " "+d+".\u001B[1;3"+ d+"m"+Nama_Matkul[d] + "("+ RAPOT_RINGKAS[d] + ")" +"\u001B[0m");
                }
            }
        }
        System.out.println();
        System.out.println("\t\t[ HASIL RAPOT]");
        System.out.println("Nama : " + Nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Usia: " + Usia);

        System.out.println("|\tMATKUL\t|\tNILAI\t|");
        ArrayList<Integer>  LIST_NILAI = new ArrayList<>();
        for(int t= 0; t< tot_matkul; t++){
            if(Nil_matkul[t] >= 90 && Nil_matkul[t] <= 100){
                LIST_NILAI.add(Nil_matkul[t]);
                System.out.println("|\t"+ GREEN_BOLD_BRIGHT + RAPOT_RINGKAS[t]  + ANSI_RESET + "\t\t|"+"\t" +BLACK_BOLD_BRIGHT+ GREEN_BACKGROUND  + BLACK_BOLD_BRIGHT+ +Nil_matkul[t] +"\t\t"+ANSI_RESET+"|");
            } else if(Nil_matkul[t] >=70 && Nil_matkul[t]  <=90){
                LIST_NILAI.add(Nil_matkul[t]);
                System.out.println("|\t"+ YELLOW_BOLD_BRIGHT +RAPOT_RINGKAS[t] + ANSI_RESET +"\t\t|"+"\t" +BLACK_BOLD_BRIGHT+ YELLOW_BACKGROUND_BRIGHT + BLACK_BOLD_BRIGHT + Nil_matkul[t] +"\t\t"+ANSI_RESET+"|");
            } else if(Nil_matkul[t] <= 70 && Nil_matkul[t] >= 50){
                LIST_NILAI.add(Nil_matkul[t]);
                System.out.println("|\t"+ PURPLE_BOLD_BRIGHT+RAPOT_RINGKAS[t] + ANSI_RESET+"\t\t|"+"\t"+ BLACK_BOLD_BRIGHT+ PURPLE_BACKGROUND_BRIGHT +BLACK_BOLD_BRIGHT +Nil_matkul[t] +"\t\t"+ANSI_RESET+"|");
            } else if(Nil_matkul[t] <= 50 && Nil_matkul[t] >= 0){
                LIST_NILAI.add(Nil_matkul[t]);
                System.out.println("|\t"+RED_BOLD_BRIGHT +RAPOT_RINGKAS[t] + ANSI_RESET +"\t\t|"+"\t"+BLACK_BOLD_BRIGHT + RED_BACKGROUND_BRIGHT + BLACK_BOLD_BRIGHT+ Nil_matkul[t] +"\t\t" +ANSI_RESET+"|");
            }
          }
        System.out.println("|"+RED_BOLD_BRIGHT + " RATA-RATA" + ANSI_RESET +"\t|"+"\t"+BLACK_BOLD_BRIGHT + RED_BACKGROUND_BRIGHT + BLACK_BOLD_BRIGHT+ rata_rata +"\t" +ANSI_RESET+"|");

        for(int s = 0; s< LIST_NILAI.size(); s++){
            for(int x = 1 ; x<= LIST_NILAI.size() - 1; x++){
                if(LIST_NILAI.get(x - 1) > LIST_NILAI.get(x)){
                    int tmp = LIST_NILAI.get(x - 1);
                    LIST_NILAI.set(x - 1,LIST_NILAI.get(x));
                    LIST_NILAI.set(x,tmp);
                }
            }
        }
        ArrayList<Integer> MAPEL_REMIDI = new ArrayList<>();
        ArrayList<Integer> MAPEL_LULUS = new ArrayList<>();
        //memisahkan Nilai

        for(int d = 0; d< LIST_NILAI.size() ; d++){
           if (LIST_NILAI.get(d) <= 60) {
               MAPEL_REMIDI.add(d);
           } else {
               MAPEL_LULUS.add(d);
           }
        }
        System.out.println();


        System.out.println( RED_BOLD_BRIGHT + "[TOTAL MATKUL TIDAK LULUS] = " + MAPEL_REMIDI.size() + ANSI_RESET);
        System.out.println(GREEN_BOLD_BRIGHT + "[TOTAL MATKUL LULUS] = " + MAPEL_LULUS.size() + ANSI_RESET);

        int maximum_Value = LIST_NILAI.get(LIST_NILAI.size() - 1);
        int low_val = LIST_NILAI.get(0);

        System.out.println(YELLOW_BOLD_BRIGHT + "[NILAI TERTINGGI] = " + maximum_Value  + ANSI_RESET);
        System.out.println(PURPLE_BOLD_BRIGHT + "[TERENDAH] = " + low_val  + ANSI_RESET);
        System.out.println();

        System.out.println("\t[GRAFIK NILAI]\t");

        System.out.println();
        for(int c = 0; c< LIST_NILAI.size() ; c++){
            for(int d = 0 ;d < LIST_NILAI.get(c)  ;d++){
                if(LIST_NILAI.get(c)  >= 90 && LIST_NILAI.get(c) <= 100){
                    System.out.print(" " +GREEN_BACKGROUND);
                    if(d == LIST_NILAI.get(c) - 1){
                        System.out.print(ANSI_RESET + RAPOT_RINGKAS[c] + "="+GREEN_BOLD_BRIGHT + LIST_NILAI.get(c)  +" [LULUS]" +ANSI_RESET + "\n");
                    }
                } else if (LIST_NILAI.get(c) <90 && LIST_NILAI.get(c) >=70){
                    System.out.print(" " +YELLOW_BACKGROUND_BRIGHT);

                    if(d >= LIST_NILAI.get(c) - 1){

                        System.out.print(ANSI_RESET + RAPOT_RINGKAS[c] + "= "+YELLOW_BOLD_BRIGHT + LIST_NILAI.get(c)  +" [LULUS]" +ANSI_RESET + "\n");
                    }
                } else if(LIST_NILAI.get(c) <70 && LIST_NILAI.get(c) >= 50){
                    System.out.print(" "+PURPLE_BACKGROUND_BRIGHT);
                    if( d >= LIST_NILAI.get(c) - 1){

                        System.out.print(ANSI_RESET + RAPOT_RINGKAS[c] + "= "+PURPLE_BOLD_BRIGHT + LIST_NILAI.get(c)  +" [REMIDI]" +ANSI_RESET + "\n");
                    }

                } else if(LIST_NILAI.get(c) < 50 && LIST_NILAI.get(c) >= 1){
                    System.out.print(" " + RED_BACKGROUND_BRIGHT);
                    if( d >= LIST_NILAI.get(c) - 1){
                        System.out.print(ANSI_RESET + RAPOT_RINGKAS[c] + "= "+RED_BOLD_BRIGHT + LIST_NILAI.get(c)  +" [REMIDI]" +ANSI_RESET + "\n");
                    }
                }
            }
            System.out.println();
        }
    }
}
