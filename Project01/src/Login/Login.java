package Login;

import Login.ILogin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Login implements ILogin {

   @Override
   public boolean login(String documento,String usuario, String clave) {

        String datos = usuario + "," + clave;

        String linea;

        File f = new File(documento);
        BufferedReader entrada;
        try {
            entrada = new BufferedReader(new FileReader(f));

            while (entrada.ready()) {
                linea = entrada.readLine();
                if (linea.equals(datos)) {

                    return true;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }


}
