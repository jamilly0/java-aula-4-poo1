public class App {
    public static void main(String[] args) throws Exception {
    
        veiculo v1 = new veiculo();
        v1.setCodigo(1);
        v1.setMarca("fiat");
        v1.setModelo("toro");
        v1.setCor("branco");
        v1.setAno(2025);

        System.out.println("veiculo:");
        System.out.println("cogido:" + v1.getCodigo());
        System.out.println("marca:" +v1.getMarca());
        System.out.println("modelo:" + v1.getModelo());
        System.out.println("cor:" + v1.getCor());
        System.out.println("ano:" + v1.getAno());

        veiculo v2 = new veiculo(2, "volkswagen", "golf", "vermelho", 2025);

        System.out.println("veiculo:");
        System.out.println("cogido:" + v2.getCodigo());
        System.out.println("marca:" +v2.getMarca());
        System.out.println("modelo:" + v2.getModelo());
        System.out.println("cor:" + v2.getCor());
        System.out.println("ano:" + v2.getAno());

 veiculo v2 = new veiculo(3, "toyota", "ull",0)

        System.out.println("veiculo:");
        System.out.println("cogido:" + v3.getCodigo());
        System.out.println("marca:" +v3.getMarca());
        System.out.println("modelo:" + v3.getModelo());
        System.out.println("cor:" + v3.getCor());
        System.out.println("ano:" + v3.getAno());
    }
}
