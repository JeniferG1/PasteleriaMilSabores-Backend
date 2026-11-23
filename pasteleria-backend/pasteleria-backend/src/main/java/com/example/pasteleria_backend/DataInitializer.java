package com.example.pasteleria_backend;

import com.example.pasteleria_backend.model.Categoria;
import com.example.pasteleria_backend.model.Producto;
import com.example.pasteleria_backend.repository.CategoriaRepository;
import com.example.pasteleria_backend.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ProductoRepository productoRepository, CategoriaRepository categoriaRepository) {
        return args -> {
            if (productoRepository.count() == 0) {
                Categoria catTortasCuadradas = new Categoria();
                catTortasCuadradas.setNombre("tortas-cuadradas");
                categoriaRepository.save(catTortasCuadradas);

                Categoria catTortasCirculares = new Categoria();
                catTortasCirculares.setNombre("tortas-circulares");
                categoriaRepository.save(catTortasCirculares);

                Categoria catPostres = new Categoria();
                catPostres.setNombre("postres-individuales");
                categoriaRepository.save(catPostres);

                Categoria catSinAzucar = new Categoria();
                catSinAzucar.setNombre("sin-azucar");
                categoriaRepository.save(catSinAzucar);

                Categoria catTradicional = new Categoria();
                catTradicional.setNombre("tradicional");
                categoriaRepository.save(catTradicional);

                Categoria catSinGluten = new Categoria();
                catSinGluten.setNombre("sin-gluten");
                categoriaRepository.save(catSinGluten);

                Categoria catVegana = new Categoria();
                catVegana.setNombre("vegana");
                categoriaRepository.save(catVegana);

                Categoria catEspeciales = new Categoria();
                catEspeciales.setNombre("especiales");
                categoriaRepository.save(catEspeciales);

                Producto p1 = new Producto();
                p1.setCodigo("TC001");
                p1.setNombre("Torta Cuadrada de Chocolate");
                p1.setDescripcion("Deliciosa torta de chocolate con capas de ganache y un toque de avellanas. Personalizable con mensajes especiales.");
                p1.setPrecio(45000.0);
                p1.setStock(10);
                p1.setCategoria(catTortasCuadradas);
                productoRepository.save(p1);

                Producto p2 = new Producto();
                p2.setCodigo("TC002");
                p2.setNombre("Torta Cuadrada de Frutas");
                p2.setDescripcion("Una mezcla de frutas frescas y crema chantilly sobre un suave bizcocho de vainilla, ideal para celebraciones.");
                p2.setPrecio(50000.0);
                p2.setStock(10);
                p2.setCategoria(catTortasCuadradas);
                productoRepository.save(p2);

                Producto p3 = new Producto();
                p3.setCodigo("TT001");
                p3.setNombre("Torta Circular de Vainilla");
                p3.setDescripcion("Bizcocho de vainilla clásico relleno con crema pastelera y cubierto con un glaseado dulce, perfecto para cualquier ocasión.");
                p3.setPrecio(40000.0);
                p3.setStock(10);
                p3.setCategoria(catTortasCirculares);
                productoRepository.save(p3);

                Producto p4 = new Producto();
                p4.setCodigo("TT002");
                p4.setNombre("Torta Circular de Manjar");
                p4.setDescripcion("Torta tradicional chilena con manjar y nueces, un deleite para los amantes de los sabores dulces y clásicos.");
                p4.setPrecio(42000.0);
                p4.setStock(10);
                p4.setCategoria(catTortasCirculares);
                productoRepository.save(p4);

                Producto p5 = new Producto();
                p5.setCodigo("PI001");
                p5.setNombre("Mousse de Chocolate");
                p5.setDescripcion("Postre individual cremoso y suave, hecho con chocolate de alta calidad, ideal para los amantes del chocolate.");
                p5.setPrecio(5000.0);
                p5.setStock(15);
                p5.setCategoria(catPostres);
                productoRepository.save(p5);

                Producto p6 = new Producto();
                p6.setCodigo("PI002");
                p6.setNombre("Tiramisú Clásico");
                p6.setDescripcion("Un postre italiano individual con capas de café, mascarpone y cacao, perfecto para finalizar cualquier comida.");
                p6.setPrecio(5500.0);
                p6.setStock(15);
                p6.setCategoria(catPostres);
                productoRepository.save(p6);

                Producto p7 = new Producto();
                p7.setCodigo("PSA001");
                p7.setNombre("Torta Sin Azúcar de Naranja");
                p7.setDescripcion("Torta ligera y deliciosa, endulzada naturalmente, ideal para quienes buscan opciones más saludables.");
                p7.setPrecio(48000.0);
                p7.setStock(10);
                p7.setCategoria(catSinAzucar);
                productoRepository.save(p7);

                Producto p8 = new Producto();
                p8.setCodigo("PSA002");
                p8.setNombre("Cheesecake Sin Azúcar");
                p8.setDescripcion("Suave y cremoso, este cheesecake es una opción perfecta para disfrutar sin culpa.");
                p8.setPrecio(47000.0);
                p8.setStock(10);
                p8.setCategoria(catSinAzucar);
                productoRepository.save(p8);

                Producto p9 = new Producto();
                p9.setCodigo("PT001");
                p9.setNombre("Empanada de Manzana");
                p9.setDescripcion("Pastelería tradicional rellena de manzanas especiadas, perfecta para un dulce desayuno o merienda.");
                p9.setPrecio(3000.0);
                p9.setStock(20);
                p9.setCategoria(catTradicional);
                productoRepository.save(p9);

                Producto p10 = new Producto();
                p10.setCodigo("PT002");
                p10.setNombre("Tarta de Santiago");
                p10.setDescripcion("Tradicional tarta española hecha con almendras, azúcar y huevos, una delicia para los amantes de los postres clásicos.");
                p10.setPrecio(6000.0);
                p10.setStock(20);
                p10.setCategoria(catTradicional);
                productoRepository.save(p10);

                Producto p11 = new Producto();
                p11.setCodigo("PG001");
                p11.setNombre("Brownie Sin Gluten");
                p11.setDescripcion("Rico y denso, este brownie es perfecto para quienes necesitan evitar el gluten sin sacrificar el sabor.");
                p11.setPrecio(4000.0);
                p11.setStock(15);
                p11.setCategoria(catSinGluten);
                productoRepository.save(p11);

                Producto p12 = new Producto();
                p12.setCodigo("PG002");
                p12.setNombre("Pan Sin Gluten");
                p12.setDescripcion("Suave y esponjoso, ideal para sándwiches o para acompañar cualquier comida.");
                p12.setPrecio(3500.0);
                p12.setStock(15);
                p12.setCategoria(catSinGluten);
                productoRepository.save(p12);

                Producto p13 = new Producto();
                p13.setCodigo("PV001");
                p13.setNombre("Torta Vegana de Chocolate");
                p13.setDescripcion("Torta de chocolate húmeda y deliciosa, hecha sin productos de origen animal, perfecta para veganos.");
                p13.setPrecio(50000.0);
                p13.setStock(10);
                p13.setCategoria(catVegana);
                productoRepository.save(p13);

                Producto p14 = new Producto();
                p14.setCodigo("PV002");
                p14.setNombre("Galletas Veganas de Avena");
                p14.setDescripcion("Crujientes y sabrosas, estas galletas son una excelente opción para un snack saludable y vegano.");
                p14.setPrecio(4500.0);
                p14.setStock(20);
                p14.setCategoria(catVegana);
                productoRepository.save(p14);

                Producto p15 = new Producto();
                p15.setCodigo("TE001");
                p15.setNombre("Torta Especial de Cumpleaños");
                p15.setDescripcion("Diseñada especialmente para celebraciones, personalizable con decoraciones y mensajes únicos.");
                p15.setPrecio(55000.0);
                p15.setStock(10);
                p15.setCategoria(catEspeciales);
                productoRepository.save(p15);

                Producto p16 = new Producto();
                p16.setCodigo("TE002");
                p16.setNombre("Torta Especial de Boda");
                p16.setDescripcion("Elegante y deliciosa, esta torta está diseñada para ser el centro de atención en cualquier boda.");
                p16.setPrecio(60000.0);
                p16.setStock(10);
                p16.setCategoria(catEspeciales);
                productoRepository.save(p16);

                System.out.println("¡Los 16 productos iniciales fueron cargados exitosamente en la base de datos de AWS!");
            }
        };
    }
}