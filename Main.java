package latihan;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Scanner in=new Scanner(System.in);
        String [] satuan = {""," Satu "," Dua "," Tiga "," Empat "," Lima "," Enam "," Tujuh "," Delapan "," Sembilan "," Sepuluh "};
        String [] puluh = {""," Belas "," Dua Puluh "," Tiga Puluh "," Empat Puluh "," Lima Puluh "," Enam Puluh "," Tujuh Puluh "," Delapan Puluh "," Sembilan Puluh "};
        String [] ratus = {""," Seratus "," Dua Ratus "," Tiga Ratus "," Empat Ratus "," Lima Ratus "," Enam Ratus "," Tujuh Ratus "," Delapan Ratus "," Sembilan Ratus "};
        String [] ribu = {""," Seribu "," Dua Ribu "," Tiga Ribu "," Empat Ribu "," Lima Ribu "," Enam Ribu "," Tujuh Ribu "," Delapan Ribu "," Sembilan Ribu "};
        System.out.println("Masukkan Angka yang diinginkan : ");
        int angka = in.nextInt();
        if (angka <1000 && angka>0) {
            int ribuu,ratuss,puluhh,satuann;
            ribuu = angka/1000;
            ratuss = (angka%1000)/100;
            puluhh = (angka%100)/10;
            satuann = angka%10;
        if (puluhh==1){
            if(satuann==1){
            System.out.println("Angka anda"+ribu[ribuu]+ratus[ratuss]+" Se "+puluh[puluhh]);
            }else{
                System.out.println("Angka anda"+ribu[ribuu]+ratus[ratuss]+satuan[satuann]+puluh[puluhh]);
            }
        }else{
            System.out.println("Angka anda"+ribu[ribuu]+ratus[ratuss]+puluh[puluhh]+satuan[satuann]);
        }
        }else{
            System.out.println("Angka tidak valid");
            }
        }
    }