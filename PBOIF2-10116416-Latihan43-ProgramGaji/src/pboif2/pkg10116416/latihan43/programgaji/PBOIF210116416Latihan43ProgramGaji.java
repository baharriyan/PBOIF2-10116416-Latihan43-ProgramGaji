package pboif2.pkg10116416.latihan43.programgaji;
/**
 * @author
 * Nama  : RIYAN BAHAR
 * Kelas : PBOIF2
 * NIM   : 10116416
 * Deskripsi Program : Program penggajian pegawai
**/
import Instansi.Pegawai;
import java.util.Scanner;
public class PBOIF210116416Latihan43ProgramGaji {
    public static void main(String[] args) {
        // instance the object
        Scanner scan = new Scanner(System.in);
        Pegawai pegawai = new Pegawai();
        
        pegawai.setNama("Rizki Adam Kurniawan");
        pegawai.setAlamat("Jl. Semar dlm 4 No 72/66");
        pegawai.setUangTransport(250000);
        pegawai.setUangTunjangan(300000);
        pegawai.setGajiPokok(4500000);
        pegawai.setTotalGaji(pegawai.totalGaji(pegawai.getUangTransport(),pegawai.getUangTunjangan(), pegawai.getGajiPokok()));
        pegawai.tampilData(pegawai.getNama(),pegawai.getAlamat(),pegawai.getUangTransport(),pegawai.getUangTunjangan(),pegawai.getGajiPokok(),pegawai.getTotalGaji());
        
    }
    
}
