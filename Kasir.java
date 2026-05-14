public class Kasir {
    private String namaKasir;
    public Kasir(String namaKasir){
        this.namaKasir = namaKasir;
    }
    public void
     tampilIdentitas(){
        System.out.println("===TOKO GARUDA===");
        System.out.println("Nama Kasir: " + namaKasir);
     }

     public void prosesBelanja(Produk p, int jmlhBeli){

        if(p.getStok() < jmlhBeli){
            System.out.println("Out of stok");
        }
        double hargaAKhir = p.hitungHargaAkhir(jmlhBeli);
        System.out.println("Harga Akhir = " + hargaAKhir);
        System.out.println("Harga Akhir = " + hargaAKhir);
        p.setStok(jmlhBeli);
     }  
     System.out.println("Stok terbaru= " + p.getStok());
}
