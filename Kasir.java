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
        
     }
}
